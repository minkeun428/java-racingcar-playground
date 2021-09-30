package racinggame.model;

import racinggame.utils.RandomNumber;

public class Position {
    private int position;

    public Position() {
        RandomNumber randomNumber = new RandomNumber();
        this.position = randomNumber.getNumber();
    }
}
