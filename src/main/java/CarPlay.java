import java.util.*;

public class CarPlay {

    private final List<Car> cars = new ArrayList<>();

    public CarPlay(String names) {
        List<String> carList = Arrays.asList(names.split(","));

        for (String s : carList) {
            cars.add(new Car(s, 0));   //car 객체 생성
        }
    }

    //전진 해보자.
    public void runs() {
        for (Car car : cars) {
            car.run();
            car.result();
        }
        System.out.println();
    }

    public void checkMax() {
        Car CarMaxLocation = cars.stream()
                .distinct()
                .max(Comparator.comparing(Car::getLocation))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(CarMaxLocation.getName() + "가 최종 우승했습니다.");
    }

}
