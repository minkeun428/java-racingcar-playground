import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarRacingGameTest {
    private CarPlay carPlay;

    @Test
    @DisplayName("자동차 이름 5자 이하 이어야 한다.")
    void checkCarNameLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Car("bmw3Series", 0));

        String message = exception.getMessage();
        assertEquals("자동차 이름은 5자를 초과하면 안돼요.", message);
    }

    @Test
    @DisplayName("자동차 반복 전진 테스트")
    void carRunRePeatTest() {
        String input = "pobi,crong,honux";
        carPlay = new CarPlay(input);

        System.out.println("실행 결과");
        carPlay.runs(5);
    }

    @Test
    @DisplayName("최종 우승자 정하기")
    void setFinalWinner() {
        String input = "pobi,crong,honux";
        CarPlay carPlay = new CarPlay(input);

        System.out.println("실행 결과");
        carPlay.runs(5);
        carPlay.callWinners();
    }

    @Test
    @DisplayName("임의로 중복 우승자 정하기")
    void setTwoFinalWinner() {
        Car pobi = new Car("pobi", 5);
        Car crong = new Car("crong", 5);
        Car honux = new Car("honux", 1);

        carPlay = new CarPlay();
        carPlay.addCar(pobi);
        carPlay.addCar(crong);
        carPlay.addCar(honux);

        List<Car> winners = carPlay.getWinners();
        assertThat(winners).contains(pobi, crong);
    }
}
