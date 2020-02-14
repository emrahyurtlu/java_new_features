package function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        String url = "https://hmb.gov.tr/";
        String result = String.valueOf(isUrlValid.test(url));
        System.out.println(result);
        System.out.println("--------------------------------------------------");
        System.out.println(isEqual.test("emrah", "esin"));
    }

    static Predicate<String> isUrlValid = url -> url.startsWith("http://") ||
            url.startsWith("https://") &&
                    url.endsWith("/") &&
                    url.contains(".");

    static BiPredicate<String, String> isEqual = String::equals;
}
