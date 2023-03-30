package HW4;

// This class is used to track the number of tries per problem and score for the round.
public class Tracker {
    private int tries;
    private int score;

    public Tracker() {
        tries = 2;
        score = 0;
    }

    public Tracker(int tries) {
        this.tries = tries;
        score = 0;
    }

    public void resetTries() {
        tries = 2;
    }

    // Check if the user has any tries left for the problem.
    public boolean hasTries() {
        return tries > 0;
    }

    public void decrementTries() {
        tries--;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

}
