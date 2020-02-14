package function;


import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        var addition = add10.apply(25);
        System.out.println(addition);
        System.out.println("--------------------------------------------------");

        var multiplication = multiply.apply(12, 12);
        System.out.println(multiplication);
        System.out.println("--------------------------------------------------");
    }

    // Function
    static Function<Integer, Integer> add10 = number -> number + 10;

    // Bifunction
    static BiFunction<Integer, Integer, Integer> multiply = (number1, number2) -> number1 * number2;
}