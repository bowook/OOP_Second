package racingcar.domain;

import racingcar.service.CarDivision;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public List<String> cars;

    public Cars(String userInputs) {
        this.cars = CarDivision.carDivide(userInputs);
    }



}
