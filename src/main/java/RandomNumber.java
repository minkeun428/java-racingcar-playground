import java.util.Random;

public class RandomNumber {
    private final int number;

    public RandomNumber() {
        Random random = new Random();
        this.number = validateRandomNumber(random.nextInt(10));
    }

    public int isNumber() {
        return this.number;
    }

    public int validateRandomNumber(int number) {
        if(number < 0 && number > 9) {
            throw new IllegalArgumentException("잘못된 움직임 값입니다.");
        }
        return number;
    }
}
