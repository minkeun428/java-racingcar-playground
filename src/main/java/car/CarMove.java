package car;

import utils.RandomNumber;

public class CarMove {

    public int move(int position) {
        RandomNumber randomNumber = new RandomNumber();
        return position += randomNumber.getNumber();
    }
}
