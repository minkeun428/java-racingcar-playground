package racinggame.model;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private List<Car> carList;

    public CarList(String cars) {
        carList = new ArrayList();
        String[] carNameArray = cars.split(",");

        for (int i = 0; i < carNameArray.length; i++) {
            carList.add(createCars(carNameArray[i]));
        }
    }

    private Car createCars(String carName) {
        return new Car(carName);
    }

    public List<Car> getCarList() {
        return this.carList;
    }
}
