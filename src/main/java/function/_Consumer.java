package function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        sayHello.accept("Emrah");
        System.out.println("--------------------------------------------------");

        showUserInfo.accept("Emrah", 33);
        System.out.println("--------------------------------------------------");
    }

    // Consumer
    static Consumer<String> sayHello = name -> System.out.println("Hello, " + name);

    // BiConsumer
    static BiConsumer<String, Integer> showUserInfo = (name, age) -> System.out.println("Hello, " + name + ". Your age is: " + age.toString());
}
