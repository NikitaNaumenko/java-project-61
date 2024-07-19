package hexlet.code;

import java.util.Scanner;

public final class Cli {

    public static void run(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
