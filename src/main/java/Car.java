public class Car {
    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String isName() {
        return this.name;
    }

    public int isPosition() {
        return this.position;
    }

    public void move() {
        RandomNumber randomNumber = new RandomNumber();
        this.position += randomNumber.isNumber();
    }

    public boolean validateNameLength(String name) {
        if(name.isEmpty()) {
            throw new NullPointerException("자동차 이름을 입력해주세요.");
        }
        if(name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
        return true;
    }

    public void view() {
        CarView carView = new CarView();
        System.out.println(name + " : " + carView.drawCarPosition(position));
    }

}
