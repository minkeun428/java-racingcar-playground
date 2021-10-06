package racinggame.model;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private List<Car> carList;

    public CarList() {}

    public CarList(String cars) {
        carList = new ArrayList();
        String[] carNameArray = cars.split(",");

        for (int i = 0; i < carNameArray.length; i++) {
            carList.add(createCar(carNameArray[i]));
        }
    }

    public List<Car> getCarList() {
        return this.carList;
    }

    private Car createCar(String carName) {
        return new Car(carName);
    }
}
