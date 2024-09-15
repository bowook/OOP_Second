package racingcar.view;

public class OutputView {

    public void executionResultMessage() {
        System.out.println("\n실행 결과");
    }

    public void finalWinnerMessage() {
        System.out.print("최종 우승자 : ");
    }

    public void dashMessage() {
        System.out.println("-");
    }

    public void printMessage(String carName, boolean stopAndGo) {
        System.out.println(carName + " : " );

    }
}
