package hw03;

public class CheckSexFormat extends RuntimeException{
    public CheckSexFormat(){
        super("You mast enter about sex only one char! 'f' or 'm' !");
    }
}
