package racingcar.domain;

import racingcar.service.MoveForward;

import java.util.List;

public class Cars {

    private final List<String> cars;

    public Cars(List<String> cars) {
        this.cars = cars;
    }

    public boolean stopAndGo() {
        int number = MoveForward.randomMoveForwards();
        return number >= 4;
    }
}
