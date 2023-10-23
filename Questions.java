
import java.util.Scanner;

public class Questions implements Runnable {
    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Java Quiz!");
        System.out.println("Answer the following questions with a, b, or c.");

        // Question 1
        System.out.println("Question 1: What is the capital of France?");
        System.out.println("a) Berlin");
        System.out.println("b) London");
        System.out.println("c) Paris");

        String answer1 = scanner.nextLine().trim().toLowerCase();
        if (answer1.equals("c")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is c.\n");
        }

        // Question 2
        System.out.println("Question 2: Which planet is known as the Red Planet?");
        System.out.println("a) Mars");
        System.out.println("b) Venus");
        System.out.println("c) Jupiter");

        String answer2 = scanner.nextLine().trim().toLowerCase();
        if (answer2.equals("a")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is a.\n");
        }

        // Add more questions as needed

        // Display the final score
        System.out.println("Your Score: " + score + " out of 2"); // Change 2 to the total number of questions

    }
}
