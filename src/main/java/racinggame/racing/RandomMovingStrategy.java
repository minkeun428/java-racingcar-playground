package racinggame.racing;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {

    @Override
    public int move() {
        return new Random().nextInt(10);
    }
}
