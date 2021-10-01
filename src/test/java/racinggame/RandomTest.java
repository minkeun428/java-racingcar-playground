package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.utils.RandomNumber;

public class RandomTest {

    @Test
    @DisplayName("0~9 사이의 랜덤 숫자 생성 성공")
    void 랜덤숫자_성공() {
        RandomNumber randomNumber = RandomNumber.getInstance();
        int actualNumber = randomNumber.createRandomNumber();

        assertThat(actualNumber).isBetween(0, 9);
    }
}
