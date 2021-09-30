package racinggame.view;

public class OutputView {
    private final static String RUN_RESULT = "실행 결과";

    public void createRunResult() {
        System.out.println(RUN_RESULT);
    }

    public void getCarNameAndPosition(String name, int position) {
        System.out.println(name + " : " + position);
    }
}
