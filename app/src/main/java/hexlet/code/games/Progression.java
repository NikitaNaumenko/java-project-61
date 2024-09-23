package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {
    private static final int MAX = 10;
    private static final int MIN = 5;

    public static String[] getGameData() {
        int progressionLength = genProgressionLength();
        int[] progression = genProgression(progressionLength);
        int progressionIndex = Utils.getRandom(progressionLength);
        int answer = progression[progressionIndex];

        String question = genQuestion(progression, progressionIndex);

        String[] result = {question, String.valueOf(answer)};

        return result;
    }

    public static String getTask() {
        return "What number is missing in the progression?";
    }

    private static String genQuestion(int[] progression, int progressionIndex) {
        String[] arr = new String[progression.length];
        for (int i = 0; i < progression.length; i++) {
            if (i != progressionIndex) {
                arr[i] = Integer.toString(progression[i]);
            } else {
                arr[i] = "..";
            }
        }
        String question = String.join(" ", arr);
        return question;
    }

    private static int[] genProgression(int progressionLength) {
        int[] progression = new int[progressionLength];
        int startProgression = Utils.getRandom();
        int step = Utils.getRandom(MAX);
        progression[0] = startProgression;
        for (int i = 1; i < progressionLength; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }

    private static int genProgressionLength() {
        int num = Utils.getRandom();
        if (num < MIN) {
            return MIN;
        } else if (num > MAX) {
            return MAX;
        }
        return num;
    }
}
