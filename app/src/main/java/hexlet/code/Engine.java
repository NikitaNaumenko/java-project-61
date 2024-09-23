package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.games.Gcd;
import hexlet.code.games.Calculator;

import java.util.Scanner;

final class Engine {

    public static String[] genGameData(String gameNumber) {
        String[] gameData = switch (gameNumber) {
            case "2" -> Even.getGameData();
            case "3" -> Calculator.getGameData();
            case "4" -> Gcd.getGameData();
            case "5" -> Progression.getGameData();
            case "6" -> Prime.getGameData();
            default -> new String[]{"error", "error"};
        };

        return gameData;
    }

    public static String getGameTask(String gameNumber) {
        String task = switch (gameNumber) {
            case "2" -> Even.getTask();
            case "3" -> Calculator.getTask();
            case "4" -> Gcd.getTask();
            case "5" -> Progression.getTask();
            case "6" -> Prime.getTask();
            default -> "Error";
        };

        return task;
    }

    public static void run(String gameNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");

        int currentRound = INIT_ROUND;

        String task = getGameTask(gameNumber);

        System.out.println(task);

        while (currentRound <= ROUND_COUNTS) {
            String[] gameData = genGameData(gameNumber);
            String question = "Question: " + gameData[0];
            String answer = gameData[1];

            System.out.println(question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                currentRound++;
            } else {
                System.out.println(
                        userAnswer + " is wrong answer ;(. Correct answer was "
                                + answer);
                System.out.println("Let's try again, " + userName);

                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }

    private static final int INIT_ROUND = 1;

    private static final int ROUND_COUNTS = 3;
}
