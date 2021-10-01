package racinggame.utils;

import java.util.Random;

public class RandomNumber {
    private final int RANDOM_RANGE;
    private Random random;

    public RandomNumber() {
        this.random = new Random();
        this.RANDOM_RANGE = 10;
        createRandomNumber();
    }

    public int createRandomNumber() {
        return random.nextInt(RANDOM_RANGE);
    }
}
