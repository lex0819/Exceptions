package hw03;

public class CheckPhoneNumber extends RuntimeException{
    public CheckPhoneNumber(){
        super("Phone number must have only 11 digits!");
    }
}
