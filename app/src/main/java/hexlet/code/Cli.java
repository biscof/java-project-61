package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;

    public static String getUserName() {
        return userName;
    }

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.printf("Hello, %s!\n", userName);
    }
}
