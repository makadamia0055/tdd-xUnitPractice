package xUnit;

import java.util.logging.Logger;

public class TestCaseTest extends TestCase{
    private static final Logger testLogger = Logger.getLogger(TestCaseTest.class.getName());

    private WasRun wasRun;

    private static String logStr = "";

    public TestCaseTest(Class<?> testClass, String testMethodName) throws Exception {
        super(testClass, testMethodName);
        setUp();
    }


    @Override
    public void setUp() throws Exception {
        //testLogger.info(this.getClass().getName() + ": setUp() 실행");
        wasRun = new WasRun(WasRun.class, "testMethod");
        wasRun.setUp();

    }

    public void testRunning() throws Exception {
        setUp();
        wasRun.run();
        logStr = logStr + "wasRun ";



    }
    public void testSetUp() throws Exception {
        setUp();
        logStr = logStr + "wasSetUp ";

    }



    public static void main(String[] args) {
        try {
            TestCaseTest testCaseTest = new TestCaseTest(TestCaseTest.class, "testRunning");
            testCaseTest.testSetUp();
            testCaseTest.testRunning();
            testCaseTest.run();


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            testLogger.info(logStr);
        }
    }


}
