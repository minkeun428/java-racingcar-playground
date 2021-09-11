import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarRacingGameTest {

    @Test
    @DisplayName("자동차 이름 5자 이하 이어야 한다.")
    void checkCarNameLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Car("bmw3Series", 0));

        String message = exception.getMessage();
        assertEquals("자동차 이름은 5자를 초과하면 안돼요.", message);
    }

    @Test
    @DisplayName("콤마로 구분하여 경주할 자동차 인스턴스 생성")
    void createCarByComa() {
        String str = "pobi,crong,honux";
        CarPlay racingCars = new CarPlay(str);
    }

    @Test
    @DisplayName("자동차 전진 테스트")
    void carRunTest() {
        String input = "pobi,crong,honux";
        CarPlay racingCars = new CarPlay(input);

        racingCars.runs();
    }

    @Test
    @DisplayName("자동차 반복 전진 테스트")
    void carRunRePeatTest() {
        String input = "pobi,crong,honux";
        CarPlay racingCars = new CarPlay(input);

        System.out.println("실행 결과");
        for (int i = 0; i < 5; i++) {
            racingCars.runs();
            System.out.println();
        }
    }

    @Test
    @DisplayName("최종 우승자 정하기")
    void setFinalWinner() {
        String input = "pobi,crong,honux";
        CarPlay racingCars = new CarPlay(input);

        System.out.println("실행 결과");
        for (int i = 0; i < 5; i++) {
            racingCars.runs();
        }
        racingCars.checkMax();
    }

}
