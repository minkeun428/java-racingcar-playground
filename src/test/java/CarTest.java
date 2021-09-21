import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    @DisplayName("차 생성 테스트")
    void createCarTest() {
        Car car1 = new Car("pobi", 0);
        Car car2 = new Car("crong", 0);
        Car car3 = new Car("honux", 0);

        assertThat(car1.isName()).isEqualTo("pobi");
        assertThat(car2.isName()).isEqualTo("crong");
        assertThat(car3.isName()).isEqualTo("honux");
    }

    @Test
    @DisplayName("5자 초과 검증 테스트")
    void validateNameLength() {
        Car car4 = new Car("pobist", 0);
        assertThatThrownBy(() -> {
            car4.validateNameLength(car4.isName());
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5자를 초과할 수 없습니다.");
    }

    @Test
    @DisplayName("자동차 이름 미입력 테스트")
    void validateNameIsNull() {
        Car car4 = new Car("", 0);
        assertThatThrownBy(() -> {
            car4.validateNameLength(car4.isName());
        }).isInstanceOf(NullPointerException.class)
                .hasMessageContaining("자동차 이름을 입력해주세요.");
    }

    @Test
    @DisplayName("입력한 문자열에서 차 생성 테스트")
    void createStringCarListTest() {
        CarPlay carPlay = new CarPlay();
        for (Car car : carPlay.createNewCar("pobi,crong,honux")) {
            System.out.println("car = " + car.isName());
        }
    }

    @Test
    @DisplayName("차 움직임 테스트")
    void moveCarTest() {
        Car car = new Car("kmk", 0);
        car.move();
        System.out.println("car move::" + car.isPosition());
    }

    @Test
    @DisplayName("실행 결과 테스트")
    void actionPlayTest() {
        CarPlay carPlay = new CarPlay();
        List<Car> cars = carPlay.createNewCar("pobi, crong, honux");

        for (Car car : cars) {
            car.move();
            car.view();
        }
    }

    @Test
    @DisplayName("최종 우승자 가리기")
    void getFinalWinners() {
        CarPlay carPlay = new CarPlay();
        List<Car> cars = carPlay.createNewCar("pobi, crong, honux");

        for (Car car : cars) {
            car.move();
            car.view();
        }

        CarView carView = new CarView();
        List<Car> carList = carPlay.getWinners();
        System.out.println(carView.callFinalWinners(carList));
    }
}
