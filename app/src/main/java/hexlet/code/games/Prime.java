package hexlet.code.games;

import hexlet.code.Utils;

public class Prime {
    public static String[] getGameData() {
        int question = Utils.getRandom();
        String answer = isPrime(question);

        return new String[] {String.valueOf(question), answer};
    }

    public static String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String isPrime(int n) {
        if (n <= 1) {
            return "no";
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
