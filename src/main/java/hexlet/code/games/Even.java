package hexlet.code.games;

import hexlet.code.Utils;

public final class Even {

    public static String[] getGameData() {
        int question = Utils.getRandom();
        String answer = isEven(question);

        return new String[] {String.valueOf(question), answer};
    }

    public static String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String isEven(final int number) {
        if ((number % 2) == 0) {
            return "yes";
        }

        return "no";
    }
}
