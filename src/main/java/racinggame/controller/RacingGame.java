package racinggame.controller;

import racinggame.model.Car;
import racinggame.model.CarList;
import racinggame.racing.Race;
import racinggame.view.InputView;
import racinggame.view.OutputView;

import java.util.List;


public class RacingGame {

    public RacingGame() {}

    public void play() {
        Race race = new Race();
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        //자동차 생성 입력 받기
        CarList cars = inputView.createInPutCarNameView();

        //플레이 횟수 받기
        int playTime = inputView.createInPutPlayTimeView();
        inputView.closeScanner();

        outputView.printRaceStart();
        //경주 시작하기
        for(int i = 0; i < playTime; i++) {
            race.run(cars.getCarList());
            outputView.printCarNameAndPosition(cars.getCarList());
        }

        //우승자 가려내기
        List<Car> winners = race.getRaceResult(cars);

        //우승자 보여주기
        outputView.printRaceResult(winners);
    }
}
