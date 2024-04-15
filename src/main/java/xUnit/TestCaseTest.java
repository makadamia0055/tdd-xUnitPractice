package xUnit;

public class TestCaseTest extends TestCase{
    private TestCase test;

    public TestCaseTest(Class<?> testClass, String testMethodName) {
        super(testClass, testMethodName);
    }

//    public TestCase setUp() throws Exception {
//        return (TestCase) testClass.getDeclaredConstructor(Class.class, String.class).newInstance(testClass, testMethodName);
//
//    }

    public void testRunning() throws Exception {
        WasRun wasRun = new WasRun(WasRun.class, "testMethod"); // WasRun 셋업
        // 상기 class 전달을 해당 클래스 안에서 실행할 수 있나 봤는데, 레터럴이 아니면 할 수 없는 듯.
        wasRun.run();
        wasRun = (WasRun) wasRun.getInstance();
        System.out.println(wasRun.wasRun());
    }
    public void testSetUp() throws Exception {

    }



    public static void main(String[] args) {
        try {
            new TestCaseTest(TestCaseTest.class, "testRunning").testRunning();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
