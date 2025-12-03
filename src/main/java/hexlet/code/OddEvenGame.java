package hexlet.code;

import java.util.Scanner;

public class OddEvenGame {
    private static final Scanner scanner = new Scanner(System.in);
    private static int counter = 0;

    public static void oddEvenGame(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (counter != 3) {
            round(name);
        }

        System.out.println("Congratulations, " + name + "!");
    }

    private static void round(String name) {
        int number = createNumber();
        String answer = isEven(number);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();
        checkAnswer(userAnswer, answer, name);
    }

    private static void checkAnswer(String userAnswer, String answer, String name) {
        if (answer.equals(userAnswer)) {
            System.out.println("Correct!");
            counter++;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            System.out.println("Let's try again, " + name);
            counter = 0;
        }
    }

    private static int createNumber() {
        return (int) (Math.random() * 100);
    }

    private static String isEven(int number) {
        return number % 2 == 0 ? "no" : "yes";
    }
}
