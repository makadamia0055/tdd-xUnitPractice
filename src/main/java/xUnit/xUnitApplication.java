package xUnit;

import java.lang.reflect.Method;

public class xUnitApplication {
    public static void main(String[] args) {
        try {
            testRunning();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void testRunning() throws Exception {
        WasRun wasRun = new WasRun(WasRun.class, "testMethod"); // WasRun 셋업
        System.out.println(wasRun.wasRun());
        wasRun.run();
        System.out.println(wasRun.wasRun());
    }


}
