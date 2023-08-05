package hw03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Human {
    private String surName;
    private String firstName;
    private String fatherName;

    private Date birthday;
    private String phoneNumber;
    private char sex;

    public Human(String inputString){

        List<String> inputArray = List.of(inputString.split(" "));
        checkArrayLength(inputArray.size());

        surName = inputArray.get(0);
        firstName = inputArray.get(1);
        fatherName = inputArray.get(2);

        parsDate(inputArray.get(3));

        parsPhoneNumber(inputArray.get(4));

        parsSex(inputArray.get(5));

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
            birthday = new SimpleDateFormat("dd.MM.yyyy").parse(strDate);
        }catch (ParseException e) {
            throw new CheckDateFormat();
        }
    }
    private void parsPhoneNumber(String strNum){
        String pattern = "\\d{11}";
        if (strNum.matches(pattern)){
            phoneNumber = strNum;
        }else {
            throw new CheckPhoneNumber();
        }
    }

    private void parsSex(String str){
        if(Objects.equals(str, "f") || Objects.equals(str, "m")){
            sex = str.charAt(0);
        } else {
            throw new CheckSexFormat();
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "Фамилия = '" + surName + '\'' +
                ", Имя = '" + firstName + '\'' +
                ", Отчество = '" + fatherName + '\'' +
                ", день рождения = " + getBirthday() +
                ", номер телефона = '" + phoneNumber + '\'' +
                ", пол = " + sex +
                '}';
    }

    public String toLineInFile() {
        return String.format("<%s><%s><%s><%s> <%s><%s>", surName, firstName, fatherName, getBirthday(), phoneNumber, sex);
    }
}
