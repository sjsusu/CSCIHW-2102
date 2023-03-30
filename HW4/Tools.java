package HW4;

import java.util.Random;

public class Tools {

    // Generate a random integer between min (inclusive) and max (exclusive)
    public int generateInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
