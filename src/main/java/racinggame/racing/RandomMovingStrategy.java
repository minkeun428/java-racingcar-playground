package racinggame.racing;

import racinggame.utils.RandomNumber;

public class RandomMovingStrategy implements MovingStrategy {

    @Override
    public int move() {
        return new RandomNumber().createRandomNumber();
    }
}
