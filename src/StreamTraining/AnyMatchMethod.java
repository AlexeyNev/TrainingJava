package StreamTraining;

import java.util.List;

/**
 * Чтобы проверить, что хотя бы один элемент стрима удовлетворяет условию, можно использовать метод anyMatch()
 *
 * Например:
 * List.of(1, 2, 0, 3, 4).stream().anyMatch(n -> n % 2 == 0); // проверяем, что есть хотя бы одно четное число
 *
 * Ваша задача проверить, что хотя бы одна строка списка начинается с "job4j"
 */

public class AnyMatchMethod {
    public static boolean check(List<String> data) {
        return data.stream().anyMatch((e -> e.startsWith("job4j")));
    }
}