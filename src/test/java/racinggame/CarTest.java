package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.model.Car;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("audi");
    }

    @Test
    @DisplayName("생성 성공 테스트")
    void 생성_성공_테스트() {
        String expected = "audi";
        String actual = car.getName();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("5자리가 초과하여 실패 테스트")
    void 생성_실패_테스트() {
        assertThatThrownBy(() -> {
            car = new Car("sonata");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5자를 초과할 수 없습니다.");
    }

    @Test
    @DisplayName("이동 테스트")
    void 이동_테스트() {
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("정지 테스트")
    void 정지_테스트() {
        car.move(() -> false);
        assertThat(car.getPosition()).isEqualTo(0);
    }

}
