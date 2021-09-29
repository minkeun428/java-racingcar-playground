package model;

import utils.RandomNumber;
import validation.CarValidation;
import view.CarView;

public class Car {
    private final String name;
    private int position;

    public Car(String name, int position) {
        CarValidation validation = new CarValidation();
        validation.validateNameLength(name);
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
