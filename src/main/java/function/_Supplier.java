package function;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getValue());
        System.out.println("--------------------------------------------------");
        System.out.println(getString.get());
        System.out.println("--------------------------------------------------");
        System.out.println(getInteger.get());
        System.out.println("--------------------------------------------------");
        System.out.println(getBoolean.get());
        System.out.println("--------------------------------------------------");
    }

    static String getValue() {
        return "This is value";
    }

    static Supplier<String> getString = () -> "This is my String";
    static Supplier<Integer> getInteger = () -> 1987;
    static Supplier<Boolean> getBoolean = () -> false;
}
