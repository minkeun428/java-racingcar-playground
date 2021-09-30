package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.model.Car;
import racinggame.utils.RandomNumber;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("자동차 생성 성공 테스트를 한다.")
    void createCarSuccessTest() {
        final String testName = "tico";
        Car car = new Car(testName);
        assertThat(testName).isEqualTo(car.getName());
    }

    @Test
    @DisplayName("자동차가 달린다.")
    void createCarListByString() {
        final String testName = "audi";
        RandomNumber runNumber = new RandomNumber();
        Car car = new Car(testName, runNumber.getNumber());

        assertThat(car.getPosition()).isEqualTo(runNumber.getNumber());
    }
}
