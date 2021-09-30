package racinggame.model;

import racinggame.utils.RandomNumber;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public int run() {
        return new RandomNumber().getNumber();
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
