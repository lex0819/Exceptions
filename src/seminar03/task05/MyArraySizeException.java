package seminar03.task05;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        super("Matrix must be square!");
    }
}

