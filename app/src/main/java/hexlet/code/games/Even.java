package hexlet.code.games;

import java.util.Random;

public final class Even {

    public static String[] getGameData() {
        int question = getRandom();
        String answer = isEven(question);

        String[] result = {String.valueOf(question), answer};

        return result;
    }

    public static int getRandom() {
        Random random = new Random();

        int randomInt = random.nextInt();

        return randomInt;
    }

    public static String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String isEven(int number) {
        if ((number % 2) == 0) {
            return "yes";
        }

        return "no";
    }

    private Even() {
    }

}
