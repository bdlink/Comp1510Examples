package ca.bcit.comp1510.ch07;

import java.util.Scanner;

/**
 * Demonstrates the use of a class that implements an interface.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class MiniQuiz {
    
    /** Average complexity.*/
    private static final int AVERAGE = 4;
    
    /** Difficult complexity. */
    private static final int DIFFICULT = 10;

    /**
     * Presents a short quiz.
     * 
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Question q1;
        Question q2;
        Question q3;

        Scanner scan = new Scanner(System.in);

        q1 = new Question("What is the capital of Jamaica?", "Kingston");
        q1.setComplexity(AVERAGE);

        q2 = new Question("Which is worse, ignorance or apathy?",
                "I don't know and I don't care");
        q2.setComplexity(DIFFICULT);
        
        q3 = new Question("What is the capital of Canada?", "Ottawa");

        poseQuestion(q1, scan);
        poseQuestion(q2, scan);
        poseQuestion(q3, scan);
    }
    /**
     * Helper method to ask a question and check the answer.
     * @param q question to pose to the user
     * @param scan scanner that processes the answer
     */
    private static void poseQuestion(Question q, Scanner scan) {
        System.out.print(q.getQuestion());
        System.out.println(" (Level: " + q.getComplexity() + ")");
        
        String possible = scan.nextLine();
        if (q.answerCorrect(possible)) {
            System.out.println("Correct");
        } else {
            System.out.println("No, the answer is " + q.getAnswer());
        }
        System.out.println();
    }
}

