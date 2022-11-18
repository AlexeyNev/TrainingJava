package StreamTraining;

import java.util.stream.Stream;

/**
 * Стримы содержат терминальные и промежуточные операции.
 * Терминальные операции завершают стрим, т.е. после их вызова нельзя работать со стримом.
 * Вы уже знакомы с одной из них. Это метод collect().
 * Промежуточные операции делают какие-то преобразования и возвращают стрим.
 * Методы, отвечающие за промежуточные операции могут быть вызваны много раз.
 * Одним из терминальных методов, который есть как в стриме объектов, так и в стриме примитивов является метод count(),
 * который возвращает число элементов в стриме.
 *
 * Например:
 * long count = List.of(1, 2, 3).stream().count(); // count = 3
 *
 * Ваша задача вернуть количество элементов в стриме
 */

public class CountMethod {
    public static long count(Stream<Integer> data) {
        return data.count();
    }
}