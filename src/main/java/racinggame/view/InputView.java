package racinggame.view;

import racinggame.model.CarList;

import java.util.Scanner;

public class InputView {
    private final static String INPUT_CAR_NAME_VIEW = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private final static String INPUT_PLAY_TIME_VIEW = "시도할 횟수는 몇회인가요?";
    private final Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public CarList createInPutCarNameView() {
        System.out.println(INPUT_CAR_NAME_VIEW);
        return new CarList(scanner.next());
    }

    public int createInPutPlayTimeView() {
        System.out.println(INPUT_PLAY_TIME_VIEW);
        return scanner.nextInt();
    }

}
