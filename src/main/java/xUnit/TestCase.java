package xUnit;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Supplier;

public class TestCase {
    // 메서드 이름이 아니라 메서드 자체를 받는게 더 좋지 않나?
    protected final String testMethodName;
    protected final Class<?> testClass;

    protected TestCase instance;

    public TestCase(Class<?> testClass, String testMethodName) {
        this.testClass = testClass;
        this.testMethodName = testMethodName;
    }
    private void setUp() throws Exception {
       instance = (TestCase) testClass.getDeclaredConstructor(Class.class, String.class).newInstance(testClass, testMethodName); // 이게 셋업이 된다.

    }

    public void run() throws Exception{
        setUp();
        Method testMethod = Arrays.stream(testClass.getMethods())
                .filter(method-> method.getName().equals(testMethodName))
                .findAny().orElseThrow(()-> new NoSuchMethodError("메서드 탐색 오류"));
        testMethod.invoke(instance); // 자바에서는 메서드를 실행시키기 위해서는 당연히 그 메서드의 맥락- 클래스의 인스턴스가 필요하다
    }

    public TestCase getInstance(){
        return instance;
    }

}
