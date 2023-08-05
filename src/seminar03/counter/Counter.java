package seminar03.counter;

import java.io.Closeable;
import java.io.IOException;

/**
 Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable{
    private boolean isClosed = false;
    private int count;
    public Counter(){
        count = 0;
    }

    public void add() throws IOException {
        if (!isClosed) {
            count++;
        }else{
            throw new IOException("Ресурс закрыт!");
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        isClosed = true;
    }
}
