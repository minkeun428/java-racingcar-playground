import java.util.List;
import java.util.stream.Collectors;

public class CarView {

    public String drawCarPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    public String callFinalWinners(List<Car> winners) {
        return String.join(",", winners.stream().map(car -> car.isName()).collect(Collectors.toList()) + "가 최종 우승했습니다.");
    }
}
