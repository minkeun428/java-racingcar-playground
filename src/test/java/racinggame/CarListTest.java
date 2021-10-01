package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.model.CarList;

import static org.assertj.core.api.Assertions.*;

public class CarListTest {

    @ParameterizedTest
    @ValueSource(strings = {"benz,bmw,audi"})
    @DisplayName("자동차 리스트 성공 테스트")
    void 자동차_리스트_생성_성공_테스트(String carList) {
        CarList cars = new CarList(carList);
        assertThat(cars.getCarList().stream()
                .map(car -> car.getName()))
                .contains("benz", "bmw", "audi");
    }

    @ParameterizedTest
    @ValueSource(strings = {"benz,bmw,audi"})
    @DisplayName("자동차 리스트 생성과 다른지 테스트")
    void 자동차_리스트_생성_테스트(String carList) {
        CarList cars = new CarList(carList);
        assertThat(cars.getCarList().stream()
                .map(car -> car.getName()))
                .isNotIn("sonata", "avante", "tico");
    }

}
