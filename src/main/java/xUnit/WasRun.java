package xUnit;

import java.lang.reflect.Method;

public class WasRun extends TestCase{
    private boolean wasRun;


    public WasRun(Method testMethod) {
        super(testMethod);
        this.wasRun = false;

    }
    public void testMethod(Class<?> testClass) throws Exception{

        Object instance = testClass.getDeclaredConstructor().newInstance();
        testMethod.invoke(instance); // 자바에서는 메서드를 실행시키기 위해서는 당연히 그 메서드의 맥락- 클래스의 인스턴스가 필요하다
        this.wasRun = true;



    }

}
