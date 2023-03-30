package HW4;

public class LevelOne extends Problem {

    public LevelOne() {
        super();
    }

    // Generates an addition problem with a single digit answer
    public void generateProblem() {
        do {
            super.generateProblem();

        } while (super.getAnswer() >= 10);
    }
}
