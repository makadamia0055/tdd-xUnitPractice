package xUnit;

import java.lang.reflect.Method;

public class WasRun extends TestCase{
    private boolean wasRun;

//    public WasRun(){
//        super(WasRun.class, "testMethod");
//        wasRun = false;
//    }

    public WasRun(Class<?> testClass, String testMethodName) {
        super(testClass,testMethodName);
        this.wasRun = false;

    }
    public void testMethod(){
        this.wasRun = true;
    }
    public boolean wasRun(){
        return this.wasRun;
    } // 파이선에는 없는 게터 구현


}
