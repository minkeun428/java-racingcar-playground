package model;

import model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarRacing {
    private final List<Car> carList = new ArrayList<>();

    public List<Car> createNewCar(String nameList) {
        List<String> cars = Arrays.asList(nameList.split(","));
        for (String car : cars) {
            carList.add(new Car(car, 0));
        }
        return carList;
    }

    public List<Car> getWinners() {
        int maxPosition = carList.stream()
                .mapToInt(car -> car.getPosition())
                .max()
                .orElse(0);

        return carList.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

}
