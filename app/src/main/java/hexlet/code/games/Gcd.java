package hexlet.code.games;

import hexlet.code.Utils;

public class Gcd {
    public static String[] getGameData() {
        int first = Utils.getRandom();
        int second = Utils.getRandom();
        String answer = doCalc(first, second);
        String question = first + " " + second;

        String[] result = {question, answer};

        return result;
    }

    public static String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    private static String doCalc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return String.valueOf(a);
    }
}
