package hw02;

/*
* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
* и возвращает введенное значение.
* Ввод текста вместо числа не должно приводить к падению приложения,
* вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
         System.out.println(enterFloatNumber());
    }

    private static float enterFloatNumber(){
        System.out.println("Please enter float number: ");
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        if (scanner.hasNextFloat()) {
            number = scanner.nextFloat();
        } else {
            System.err.println("You've entered not float number! Please enter right float number again!");
            enterFloatNumber();
        }
        return number;
    }

}
