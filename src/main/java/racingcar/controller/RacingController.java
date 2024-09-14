package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Cars cars;

    public RacingController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.cars = new Cars(inputView.readRacingCarName());
    }

    public void run() {
        inputView.readTrialCount();
    }
}
