package hw02;

import java.util.Scanner;

/*
* Разработайте программу, которая выбросит Exception,
* когда пользователь вводит пустую строку.
* Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

public class task04 {

    public static void main(String[] args) {
        System.out.println(enterString());
    }

    private static String enterString(){
        System.out.println("Please enter some non empty string: ");
        Scanner scanner = new Scanner(System.in);
        String string = null;

        string = scanner.nextLine();
        if(string == null || string.isEmpty()){
            throw new RuntimeException ("You've entered empty string!");
        }else {
            return string;
        }
    }
}
