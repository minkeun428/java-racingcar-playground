package racinggame.utils;

import java.util.Random;

public class RandomNumber {
    private int number;

    public RandomNumber() {
        Random random = new Random();
        createRandomNumber(random);
    }

    private void createRandomNumber(Random random) {
        this.number = random.nextInt(10);
    }

    public int getNumber() {
        return this.number;
    }
}
