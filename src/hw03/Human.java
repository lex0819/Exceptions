package hw03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Human {
    private String surName;
    private String firstName;
    private String fatherName;

    private Date birthday;
    private String phoneNumber;
    private char sex;

    public Human(String inputString){

        String[] inputArray = inputString.split(" ");
        checkArrayLength(inputArray.length);

        this.surName = inputArray[0];
        this.firstName = inputArray[1];
        this.fatherName = inputArray[2];

        parsDate(inputArray[3]);

        parsPhoneNumber(inputArray[4]);

        parsSex(inputArray[5]);

    }


    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getBirthday() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.format(birthday);
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public char getSex() {
        return sex;
    }

    private void checkArrayLength(int length){
        int requiredLength = 6;
        if (length != requiredLength){
            throw new RuntimeException(new CheckLengthException(length, requiredLength));
        }
    }

    private void parsDate(String strDate){
        try{
            this.birthday = new SimpleDateFormat("dd.MM.yyyy").parse(strDate);
        }catch (ParseException e) {
            throw new CheckDateFormat();
        }
    }
    private void parsPhoneNumber(String strNum){
        String pattern = "\\d{11}|\\d{10}";
        if (strNum.matches(pattern)){
            this.phoneNumber = strNum;
        }else {
            throw new CheckPhoneNumber();
        }
    }

    private void parsSex(String str){
        if(Objects.equals(str, "f") || Objects.equals(str, "m")){
            this.sex = str.charAt(0);
        } else {
            throw new CheckSexFormat();
        }
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>\n", surName, firstName, fatherName, getBirthday(), phoneNumber, sex);
    }

}