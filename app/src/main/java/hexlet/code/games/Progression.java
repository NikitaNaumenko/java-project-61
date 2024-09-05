package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {
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
        String question = "";
        for (int i = 0; i < progression.length; i++) {
            if (i != progressionIndex) {
                question += progression[i] + " ";
            } else {
                question += " .. ";
            }
        }
        return question;
    }

    private static int[] genProgression(int progressionLength) {
        int[] progression = new int[progressionLength];
        int startProgression = Utils.getRandom();
        int step = Utils.getRandom(10);
        progression[0] = startProgression;
        for (int i = 1; i < progressionLength; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }

    private static int genProgressionLength() {
        int num = Utils.getRandom();
        if (num < 5) {
            return 5;
        } else if (num > 10) {
            return 10;
        }
        return num;
    }
}
