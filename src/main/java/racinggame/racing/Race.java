package racinggame.racing;

import racinggame.model.Car;
import racinggame.model.CarList;

import java.util.List;
import java.util.stream.Collectors;


public class Race {

    public Race() {}

    public void run(List<Car> cars) {
        for (Car car : cars) {
            car.move(RandomMovingStrategy.getInstance());
        }
    }

    public List<Car> getRaceResult(CarList carList) {
        return carList.getCarList().stream()
                    .filter(car -> car.getPosition() == getMaxPosition(carList))
                    .collect(Collectors.toList());
    }

    private int getMaxPosition(CarList carList) {
        return carList.getCarList().stream()
                .mapToInt(car -> car.getPosition())
                .max()
                .orElse(0);
    }
}
