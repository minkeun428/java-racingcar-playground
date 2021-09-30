package racinggame.model;

import racinggame.racing.MovingStrategy;
import racinggame.utils.RandomNumber;

public class Car {
    private final String name;
    private int position;
    RandomNumber randomNumber = new RandomNumber();

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    //Strategy pattern 전략을 써야 random객체를 분리해서 테스트할 수 있다.
//    public void run() {
//        this.position += randomNumber.getNumber();
//    }

    public void move(MovingStrategy movingStrategy) {
        this.position += movingStrategy.move();
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
