package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;

public class MoveForward {

    private final int trialCount;

    public MoveForward(int trialCount) {
        this.trialCount = trialCount;
    }

    public int getTrialCount() {
        return trialCount;
    }

    public static int randomMoveForwards() {
        return Randoms.pickNumberInRange(0,9);
    }


}
