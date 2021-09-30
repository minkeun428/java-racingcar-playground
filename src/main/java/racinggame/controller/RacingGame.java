package racinggame.controller;

import racinggame.model.CarList;
import racinggame.racing.Race;
import racinggame.view.InputView;
import racinggame.view.OutputView;


public class RacingGame {
    private CarList carList;
    private Race race;
    private int playTime;

    public void play() {
        //입력 값 받기
        InputView inputView = new InputView();
        this.carList = inputView.createInPutCarNameView();
        playTime = inputView.createInPutPlayTimeView();

        //경주 시작하기
        race = new Race();
        for(int i = 0; i < playTime; i++) {
            race.run(carList);
        }

        //우승자 가려내기
        OutputView outputView = new OutputView();
        outputView.createRunResult();

    }
}