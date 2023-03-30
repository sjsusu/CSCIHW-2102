package HW4;

public class Game {

    public Game() {

    }

    // Plays the game based on number of rounds, the tries for each question, and the score required for each round.
    public void playGame(int rounds, int tries, int score) {
        System.out.println("-----Start game-----");

        boolean pass = false;
        for (int i = 1; i <= rounds; i++) {
            pass = conductRound(i, tries, score);
            if (!pass) {
                break;
            }
        }

        if (pass) {
            System.out.println("You win!");
        }
    }

    // Conducts a round of the game.
    public boolean conductRound(int round, int tries, int score) {
        System.out.println("Welcome to level " + round + ".");

        Problem problem = makeProblem(round);
        Tracker tracker = new Tracker(tries);
        System.out.println("Score: " + tracker.getScore());

        do {
            problem.generateProblem();
            problem.askQuestion();

            while (!problem.checkAnswer() && tracker.hasTries()) {
                tracker.decrementTries();
                if (tracker.hasTries()) {
                    System.out.println("Incorrect. Try again.");
                    problem.askQuestion();
                }
            }

            if (problem.checkAnswer()) {
                System.out.println("Correct!");
                tracker.incrementScore();
                System.out.println("Score: " + tracker.getScore());
                tracker.resetTries();
            } else {
                System.out.println("Incorrect. The correct answer is " + problem.getAnswer() + ".");
                System.out.println("Game over.");
                return false;
            }

        } while (tracker.getScore() != score);

        return true;
    }

    // Creates a problem based on the round.
    public Problem makeProblem(int round) {
        Problem problem = null;
        switch (round) {
            case 1:
                problem = new LevelOne();
                break;
            case 2:
                problem = new Problem();
                break;
            case 3:
                problem = new LevelThree();
                break;
        }
        return problem;
    }
}
