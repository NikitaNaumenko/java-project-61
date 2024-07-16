package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

class Engine {

	public static String[] genGameData(String gameNumber) {
		String[] gameData = new String[2];

		switch (gameNumber) {
			case "2":
				gameData = Even.getGameData();

				break;

			default:

				break;
		}

		return gameData;
	}

	public static String getGameTask(String gameNumber) {
		String task = "";

		switch (gameNumber) {
			case "2":
				task = Even.getTask();

				break;

			default:

				break;
		}

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
			}
			else {
				System.out.println(
					userAnswer + " is wrong answer ;(. Correct answer was "
						+ answer);
				System.out.println("Let's try again, " + userName);
				scanner.close();

				return;
			}
		}

		System.out.println("Congratulations, " + userName + "!");
		scanner.close();
	}

	private static final int INIT_ROUND = 1;

	private static final int ROUND_COUNTS = 3;

	private Engine() {
	}

}
