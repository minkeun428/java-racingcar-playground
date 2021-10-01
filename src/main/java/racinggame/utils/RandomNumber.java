package racinggame.utils;


import java.util.Random;

public class RandomNumber {
    private static Random random = null;

    private RandomNumber() {}

    public static Random createRandomNumber() {
        if (random == null) {
            random = new Random();
        }
        return random;
    }
}
