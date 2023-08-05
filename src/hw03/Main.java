package hw03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your information");
        System.out.println("You must divide words by space like this");
        System.out.println("Фамилия Имя Отчество датарождения номертелефона пол");
        System.out.print(": ");

        Scanner scanner = new Scanner(System.in);

        Human human = new Human(scanner.nextLine());

        System.out.println(human);
        System.out.println(human.toLineInFile());

    }
}
