package hw03;

public class CheckDateFormat extends RuntimeException{
    public CheckDateFormat(){
        super("Birthday must be entered as 'dd.MM.yyyy'!");
    }

}
