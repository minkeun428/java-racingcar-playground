package racinggame.racing;

import racinggame.model.Car;
import racinggame.model.CarList;


public class Race {

    public void run(CarList cars) {
        for (Car car : cars.getCarList()) {
            car.run();
        }
    }
}
