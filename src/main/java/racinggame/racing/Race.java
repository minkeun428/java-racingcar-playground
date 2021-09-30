package racinggame.racing;

import racinggame.model.Car;
import racinggame.model.CarList;
import racinggame.view.OutputView;


public class Race {
    OutputView outputView = new OutputView();

    public void run(CarList cars) {
        cars.getCarList().stream()
                .forEach(car -> car.move(new RandomMovingStrategy()));
        for (Car car : cars.getCarList()) {
            car.move(new RandomMovingStrategy());
            //야 outview야 내가 얘네 정보 넘겨줄테니깐 넌 얘네 그려줘
           outputView.getCarNameAndPosition(car.getName(), car.getPosition());
        }
    }
}
