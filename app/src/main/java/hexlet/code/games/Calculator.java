package hexlet.code.games;

import hexlet.code.Utils;

public class Calculator {

    public static String[] getGameData() {
        int first = Utils.getRandom();
        int second = Utils.getRandom();
        String operation = getOperation();
        String answer = doCalc(first, second, operation);
        String question = first + " " + operation + " " + second;

        String[] result = {question, answer};

        return result;
    }

    public static String getTask() {
        return "What is the result of the expression?";
    }

    private static String getOperation() {
        int random = Utils.getRandom(2);
        String[] operations;
        operations = new String[] {"-", "+", "*"};
        return operations[random];
    }

    private static String doCalc(int first, int second, String operation) {
        int result = switch (operation) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            default -> 0;
        };
        return String.valueOf(result);
    }
}
