package racingcar.view;

import racingcar.model.CarModel;

/**
 * 출력 관리
 */
public class OutputView {
    /**
     * 실행 결과 메세지 출력
     */
    public static void printResult() {
        System.out.println("실행 결과");
    }

    /**
     * 단일 차수 실행 결과 출력
     *
     * @param car 자동차 객체
     */
    public static void printGameResult(CarModel car) {
        System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
    }

    /**
     * 우승자 출력
     *
     * @param cars 우승 차량들
     */
    public static void printWinners(CarModel[] cars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (CarModel car : cars) {
            stringBuilder.append(car.getName()).append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        System.out.println(stringBuilder + "가 최종 우승했습니다.");
    }
}
