package racinggame.view;

import racinggame.model.Car;
import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    private static final String RUN_RESULT = "실행 결과";
    private static final String RESULT_MESSAGE = "가 최종 우승했습니다.";

    public OutputView() {}

    public void printRaceStart() {
        System.out.println(RUN_RESULT);
    }

    public void printCarNameAndPosition(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + printCarPosition(car.getPosition()));
        }
        System.out.println();
    }

    public void printRaceResult(List<Car> winners) {
        System.out.println(
            String.join(",", winners.stream()
                .map(car -> car.getName())
                .collect(Collectors.toList()))
                + RESULT_MESSAGE);
    }

    private String printCarPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
