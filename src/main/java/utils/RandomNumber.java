import java.util.Random;

public class RandomNumber {
    private final int number;
    private static final int MIN = 0;
    private static final int MAX = 9;

    public RandomNumber() {
        Random random = new Random();
        this.number = validateRandomNumber(random.nextInt(10));
    }

    public int isNumber() {
        return this.number;
    }

    public int validateRandomNumber(int number) {
        if(number < MIN && number > MAX) {
            throw new IllegalArgumentException("잘못된 움직임 값입니다.");
        }
        return number;
    }
}
