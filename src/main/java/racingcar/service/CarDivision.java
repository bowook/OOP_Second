package racingcar.service;

import java.util.List;

public class CarDivision {
    public static List<String> carDivide(String userInputs) {

        return List.of(userInputs.split(","));
    }
}
