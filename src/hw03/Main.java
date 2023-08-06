package hw03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter your information");
        System.out.println("You must divide words by space like this");
        System.out.println("Фамилия Имя Отчество дата_рождения номер_телефона пол:");

        Scanner scanner = new Scanner(System.in);

        Human human = new Human(scanner.nextLine());

//        System.out.println(human);

        try(FileWriter writer = new FileWriter(new File(human.getSurName() + ".txt"), true);
        ){
            writer.write(human.toString());
        }catch (IOException e){
            e.fillInStackTrace();
        }
    }
}
