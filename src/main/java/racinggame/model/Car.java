package racinggame.model;

import racinggame.racing.MovingStrategy;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable()) {
            this.position++;
        }
    }

    public void validate(String name) {
        if(name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
