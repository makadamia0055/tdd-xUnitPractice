package xUnit;

import java.lang.reflect.Method;

public class TestCase {
    // 메서드 이름이 아니라 메서드 자체를 받는게 더 좋지 않나?
    protected Method testMethod;

    public TestCase(Method testMethod) {
        this.testMethod = testMethod;
    }


}
