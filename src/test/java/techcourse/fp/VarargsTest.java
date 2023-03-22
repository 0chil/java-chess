package techcourse.fp;

import org.junit.jupiter.api.Test;

public class VarargsTest {

    @Test
    void testMethods() {
        method("hithere");
        method2(new String[] {"hithere"});
        method3(1, "a", 0.1);
    }

    void method(String... args) {
    }

    void method2(String[] args) {
    }

    <T> void method3(T... args) {
        Object[] args1 = args;
    }
}
