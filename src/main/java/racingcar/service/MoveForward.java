package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;

public class MoveForward {
    public static int randomMoveForwards() {
        return Randoms.pickNumberInRange(0,9);
    }
}
