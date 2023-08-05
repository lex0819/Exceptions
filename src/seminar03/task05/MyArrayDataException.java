package seminar03.task05;

import java.util.List;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int i, int j) {
        super(String.format("В ячейке [%s][%s] лежит не число", i, j));
    }

    public MyArrayDataException(List<Point2D> points) {
        super(String.format("В ячейках %s лежат не числа", points));
    }
}
