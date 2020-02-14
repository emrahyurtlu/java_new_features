package optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Object value1 = Optional.ofNullable("Hello World!").orElseGet(() -> "default value");
        System.out.println(value1);

        Optional.ofNullable(null).ifPresent(System.out::println);
    }
}
