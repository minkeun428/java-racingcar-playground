package racinggame.utils;

import java.util.Random;


public class RandomNumber {
    private static Random random;
    private final int RANDOM_RANGE;


    private RandomNumber() {
        this.random = new Random();
        RANDOM_RANGE = 10;
    }

    /**
     * 1.객체가 필요한 시점까지 초기화를 미룬다.
     * 2.해당 클래스는 변수가 없기 때문에 싱글톤 클래스 로딩 시,
     * 3.해당 클래스를 초기화하지 않는다.
     */
    private static class LazyHolder {
        static final RandomNumber INSTANCE = new RandomNumber();
    }

    /**
     * 해당 메소드에서 LazyHolder.INSTANCE를 참조하는 순간,
     * 클래스가 로딩되며 초기화가 진행된다.
     * 클래스를 로딩하고 초기화하는 시점은 thread-safe를 보장하기 때문에
     * volatile이나 synchronized가 없어도 성능이 보장된다.
     */
    public static RandomNumber getInstance() {
        return LazyHolder.INSTANCE;
    }

    public int createRandomNumber() {
        return random.nextInt(RANDOM_RANGE);
    }
}
