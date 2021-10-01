package racinggame.racing;


import racinggame.utils.RandomNumber;

import java.util.Random;


public class RandomMovingStrategy implements MovingStrategy {
    private final int RANDOM_RANGE = 10;
    private final Random random;

    RandomMovingStrategy() {
        this.random = RandomNumber.createRandomNumber();
    }

    @Override
    public int move() {
        return random.nextInt(RANDOM_RANGE);
    }
}
