import java.util.*;
import java.util.stream.Collectors;

public class CarPlay {
    private final List<Car> cars = new ArrayList<>();

    public CarPlay(String names) {
        List<String> carList = Arrays.asList(names.split(","));
        for (String s : carList) {
            cars.add(new Car(s, 0));
        }
    }

    public CarPlay() {}

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void runs(int times) {
        for (int i = 0; i < times; i++) {
            callCarRun();
        }
    }

    public void callCarRun() {
        for (Car car : cars) {
            car.run();
            car.result();
        }
        System.out.println();
    }

    public List<Car> getWinners() {
        int maxLocation = cars.stream().mapToInt(c -> c.getLocation()).max().orElse(0);
        return cars.stream().filter(c -> c.getLocation() == maxLocation)
                        .collect(Collectors.toList());

    }

    public void callWinners() {
        System.out.println(String.join(",", getWinners().stream().map(c -> c.getName()).collect(Collectors.toList()) + "최종 우승했습니다."));
    }
}
