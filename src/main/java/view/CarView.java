package view;

import model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarView {

    public String showCarStatus(String name, int position) {
        StringBuilder status = new StringBuilder();
        status.append(name).append(" : ").append(drawCarPosition(position));
        return status.toString();
    }

    public String drawCarPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    public String callFinalWinners(List<Car> winners) {
        return String.join(",", winners.stream()
                .map(car -> car.getName())
                .collect(Collectors.toList()) + "가 최종 우승했습니다.");
    }
}
