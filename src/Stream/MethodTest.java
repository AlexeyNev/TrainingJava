package Stream;

import java.util.stream.Stream;

/**
 * @count - метод считает количество элементов в стриме и возвращает Long.
 * @peek -  метод, как и forEach, принимает в параметры консьюмера,
 *          но в отличии от forEach он не void и возвращает stream.
 *
 */
public class MethodTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//        System.out.println(stream.distinct().count());
        System.out.println(stream.distinct().peek(System.out::println).count());
    }
}
