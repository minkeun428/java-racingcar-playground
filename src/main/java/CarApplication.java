import java.util.List;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner scanner = new Scanner(System.in);
        String carList = scanner.next();

        System.out.println("시도할 횟수는 몇회인가요?");
        int playTime = scanner.nextInt();

        CarRacing carRacing = new CarRacing();
        List<Car> cars = carRacing.createNewCar(carList);

        System.out.println("실행 결과");
        for (int i = 0; i < playTime; i++) {
            for (Car car : cars) {
                car.move();
                car.view();
            }
            System.out.println();
        }

        CarView carView = new CarView();
        System.out.println(carView.callFinalWinners(carRacing.getWinners()));
    }
}
