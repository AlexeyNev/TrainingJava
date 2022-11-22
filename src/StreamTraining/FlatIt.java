package StreamTraining;

import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.Iterator;
import java.util.List;

/**
 * Даны вложенные итераторы.
 * Нужно написать метод, который соберет все элементы данных итераторов в List.
 *
 * Для преобразование итератора в стрим нужно воспользоваться методом iteratorToStream().
 * Для решения нужно также использовать методы flatMap() и collect().
 */

public class FlatIt {

    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return StreamSupport
                .stream(Spliterators.spliteratorUnknownSize(it, 0), false)
                .flatMap(iterator -> StreamSupport
                        .stream(Spliterators.spliteratorUnknownSize(iterator, 0), false))
                .collect(Collectors.toList());
    }
}