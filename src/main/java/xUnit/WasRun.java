package xUnit;

import java.lang.reflect.Method;
import java.util.logging.Logger;

public class WasRun extends TestCase{
    private static final Logger wasRunLogger = Logger.getLogger(WasRun.class.getName());


    private boolean wasRun;
    private boolean wasSetUp;


    public WasRun(Class<?> testClass, String testMethodName) {
        super(testClass,testMethodName);
        this.wasRun = false;
        this.wasSetUp = false;

    }

    @Override
    public void setUp() throws Exception {
        this.wasSetUp = true;
        //wasRunLogger.info("setUp");

    }

    public void testMethod(){
        this.wasRun = true;
    }
    public boolean wasRun(){
        return this.wasRun;
    } // 파이선에는 없는 게터 구현
    public boolean wasSetUp(){
        return this.wasSetUp;
    }

}
