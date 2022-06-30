import javax.swing.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Выберите действие: " +
                        "1. Добавить контакт" +
                        "2. Добавить группу" +
                        "3. Добавить контакт в группу"
        );
        while (true) {
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    String[] fin = input.split(" ");
                    String a = fin[0];
                    int b = Integer.parseInt(fin[1]);
                    PhoneBook.addContact(a, b);
                    PhoneBook.addContact(a, b);
                    PhoneBook.addContact(a, b);
                    break;
                case "2":
                    PhoneBook.search("Home");
                    PhoneBook.search("Work");
                    PhoneBook.search("Friends");
                    break;
                case "3":

                    break;
                default:
                    System.out.println("Ошибка");
            }
        }
    }
}
