package HW4;

import java.util.Scanner;

public class LevelThree extends Problem {
    private Scanner scan;

    public LevelThree() {
        super();
        scan = new Scanner(System.in);
    }

    // Generates a subtraction problem with a single digit answer
    public void generateProblem() {
        Tools gen = new Tools();

        do {
            super.setNum1(gen.generateInt(0, 10));
            super.setNum2(gen.generateInt(0, 10));

            super.setAnswer(super.getNum1() - super.getNum2());
        } while (super.getAnswer() < 0);
    }

    // Asks the user for an answer to the problem
    public void askQuestion() {
        System.out.println("What is " + super.getNum1() + " - " + super.getNum2() + "?");

        super.setUserAnswer(scan.nextInt());

    }
}
