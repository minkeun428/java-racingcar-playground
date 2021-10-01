package racinggame.controller;

import racinggame.model.Car;
import racinggame.model.CarList;
import racinggame.racing.Race;
import racinggame.view.InputView;

import java.util.List;


public class RacingGame {
    private CarList carInput;
    private List<Car> cars;
    private int playTime;
    private Race race;
    private InputView inputView;

    public RacingGame() {
        this.race = new Race();
        this.inputView = new InputView();
    }

    public void play() {
        //자동차 생성 입력 받기
        this.carInput = inputView.createInPutCarNameView();

        //플레이 횟수 받기
        playTime = inputView.createInPutPlayTimeView();
        inputView.closeScanner();

        //경주할 자동차들 받기
        cars = carInput.getCarList();

        //경주 시작하기
        for(int i = 0; i < playTime; i++) {
            this.race.run(cars);
        }

        //우승자 가려내기
        race.createRaceResult(cars);
    }
}
