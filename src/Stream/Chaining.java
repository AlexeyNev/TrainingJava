package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Цепочка методов, то есть объедение нескольких методов.
 * Использование методов filter reduce getAsInt вместе и есть CHAINING
 */
public class Chaining {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result = Arrays.stream(array).filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                }).reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);




        Student st1 = new Student("Alex", 'm', 28, 5.5);
        Student st2 = new Student("Alla", 'f', 25, 6.5);
        Student st3 = new Student("Max", 'm', 23, 7.5);
        Student st4 = new Student("Anton", 'm', 24, 3.5);
        Student st5 = new Student("Mariya", 'f', 14, 0.5);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        /**
         * @map() для увеличения букв в именах студентов
         * @filter() для фильтрации студентов по полу
         * @sorted() для сортировки студентов по возрасту
         * @forEach() для вывода полученных студентов
         */
        students.stream().map(e -> {
            e.setName(e.getName().toUpperCase());
            return e;
        })
                .filter(e -> e.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(e -> System.out.println(e));
    }
}
