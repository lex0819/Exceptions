package hw03;

public class CheckLengthException extends RuntimeException{
    public CheckLengthException(int count, int all){
        super(String.format("You've entered %s items, but you must enter %s", count, all));
    }

}
