public class OverloadTest {
    public final String foo() {
        return "asd";
    }

    public final int foo(String x) {
        return x.length();
    }
}
