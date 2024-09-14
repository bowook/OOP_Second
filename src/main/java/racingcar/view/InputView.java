package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readRacingCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String name = Console.readLine();

        return name;
    }

    public String readTrialCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String count = Console.readLine();
        return count;
    }
}
