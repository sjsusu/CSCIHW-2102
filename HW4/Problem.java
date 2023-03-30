package HW4;

import java.util.Scanner;

// Default Problem class is the same as round 2.
public class Problem {
    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Scanner scan;

    public Problem() {
        num1 = 0;
        num2 = 0;
        answer = 0;
        userAnswer = 0;
        scan = new Scanner(System.in);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    // Generates an addition problem with that adds two single digit numbers
    public void generateProblem() {
        Tools gen = new Tools();

        num1 = gen.generateInt(0, 10);
        num2 = gen.generateInt(0, 10);

        answer = num1 + num2;
    }

    // Asks the user for an answer to the problem
    public void askQuestion() {
        System.out.println("What is " + num1 + " + " + num2 + "?");

        userAnswer = scan.nextInt();

    }

    // Checks if the user's answer is correct
    public boolean checkAnswer() {
        return userAnswer == answer;

    }

}
