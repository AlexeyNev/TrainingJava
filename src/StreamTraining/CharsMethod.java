package StreamTraining;

import java.util.List;
import java.util.stream.Collectors;

/**
 * map() возвращает стрим, того же типа (в смысле стрим объектов или стрим примитивов).
 * Если мы вызовем map() для стрима объектов, мы получим стрим из объектов.
 * Если мы вызовем map() для стрима примитивов IntStream, мы получим стрим IntStream.
 *
 * Если нам нужно преобразовать стрим примитивов в стрим объектов, мы можем использовать метод mapToObj(),
 * работает он так же как и map().
 *
 * Из символов строки можно получим стрим, используя метод chars() в классе String.
 * Но этот стрим возвращает нам IntStream.
 * Ваша задача преобразовать стрим, который вернет chars(), в стрим Charater и собрать в список.
 *
 * IntStream будет содержать коды символы. Чтобы получить символ мы можем сделать так:
 * Charater c = (char) 91;
 */

public class CharsMethod {
    public static List<Character> symbols(String string) {
        return string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
    }
}