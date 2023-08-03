package seminar02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Изучите данный код. Все ли с ним хорошо? Если нет,
 * скорректируйте код, попробуйте обосновать свое решение.
 */
public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента массива, " +
                        "в который хотите записать значение 1");
        int index = 0;
        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
        } else {
            System.err.println("Введено не число");
        }

        try {
            arr[index] = 1;
        }
//        catch (InputMismatchException e) {
//            System.err.println("Вы ввели не число");
//        // todo не всегда нужно обрабатывать исключения в catch, так как это не очень быстро
//        }
        catch (Exception e) {
            System.err.println("Указан индекс за пределами массива");
        }
    }
}
