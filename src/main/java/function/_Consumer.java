package function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        sayHello.accept("Emrah");
        System.out.println("--------------------------------------------------");

        showUserInfo.accept("Emrah", 33);
        System.out.println("--------------------------------------------------");

        hello("Emrah", "Yurtlu", null);
        System.out.println("--------------------------------------------------");

        hello(null, "Yurtlu", value -> System.out.println("Sn. " + value + "; isim bilginizi girmediniz!"));
        System.out.println("--------------------------------------------------");
    }

    // Consumer
    static Consumer<String> sayHello = name -> System.out.println("Hello, " + name);

    // BiConsumer
    static BiConsumer<String, Integer> showUserInfo = (name, age) -> System.out.println("Hello, " + name + ". Your age is: " + age.toString());

    static void hello(String name, String surname, Consumer<String> callback) {
        if (name != null) {
            System.out.println("Hello, " + name);
        } else {
            callback.accept(surname);
        }
    }

    ;
}
