package racinggame.racing;

import racinggame.utils.RandomNumber;


public class RandomMovingStrategy implements MovingStrategy {
    private static final int MIN_LIMIT = 3;
    private final RandomNumber randomNumber;

    private RandomMovingStrategy() {
        this.randomNumber = RandomNumber.getInstance();
    }

    private static class LazyHolder {
        static final RandomMovingStrategy INSTANCE = new RandomMovingStrategy();
    }

    public static RandomMovingStrategy getInstance() {
        return LazyHolder.INSTANCE;
    }

    @Override
    public boolean movable() {
        return randomNumber.createRandomNumber() > MIN_LIMIT;
    }
}
