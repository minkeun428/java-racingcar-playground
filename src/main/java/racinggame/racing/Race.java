package racinggame.racing;

import racinggame.model.Car;
import racinggame.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;


public class Race {
    private OutputView outputView;

    public Race() {
        this.outputView = new OutputView();
    }

    public void run(List<Car> cars) {
        for (Car car : cars) {
            car.move(RandomMovingStrategy.getInstance());
            outputView.getCarNameAndPosition(car.getName(), car.getPosition());
        }
    }

    public void createRaceResult(List<Car> carList) {
        int maxPosition = carList.stream()
                .mapToInt(car -> car.getPosition())
                .max()
                .orElse(0);

        outputView.printRaceResult(
                carList.stream()
                        .filter(car -> car.getPosition() == maxPosition)
                        .collect(Collectors.toList()));
    }
}
