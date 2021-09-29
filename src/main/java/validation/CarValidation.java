package validation;

public class CarValidation {

    public void validateNameLength(String name) {
        if(name.isEmpty()) {
            throw new NullPointerException("자동차 이름을 입력해주세요.");
        }
        if(name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
    }
}
