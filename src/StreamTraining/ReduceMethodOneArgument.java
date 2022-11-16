package StreamTraining;

import java.util.List;

/**
 * Пример:
 * Integer sum = List.of(1, 2, 3).stream().reduce((n1, n2) -> n1 + n2).get(); // сумма 6
 * Integer sum = List.of(1).stream().reduce((n1, n2) -> n1 + n2).get(); // сумма 1, т.к. найдем только один элемент
 *
 * Ваша задача найти произведение чисел, используя данный метод. Размер списка всегда больше 0
 */

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        int result = list.stream().reduce((a, b) ->
                a * b).get();
        return result;
    }
}