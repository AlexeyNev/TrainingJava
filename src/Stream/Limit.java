package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'm', 28, 3, 5.5);
        Student st2 = new Student("Alla", 'f', 25, 3,6.5);
        Student st3 = new Student("Max", 'm', 23, 2,7.5);
        Student st4 = new Student("Anton", 'm', 24, 5,3.5);
        Student st5 = new Student("Mars", 'm', 4, 2,0.5);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        /**
         * @students лист с пятью студентами
         * @stream с фильтрацией по возрасту до 20 лет stream().filter(e -> e.getAge() > 20)
         * @limit ограничение limit(2) теперь вместо 4 студентов останется только 2
         */

//        students.stream().filter(e -> e.getAge() > 20).forEach(System.out::println);
//        System.out.println("-----------------------------");
//        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
//        System.out.println("-----------------------------");
//        students.stream().filter(e -> e.getAge() > 20).skip(2).forEach(System.out::println);

//          List<Integer> courses = students.stream()
//                  .mapToInt(e -> e.getCourse())
//                  .boxed()
//                  .collect(Collectors.toList());
//            System.out.println(courses);

//            int sum = students.stream().mapToInt(e -> e.getCourse()).sum();
//            System.out.println(sum);

//              double avr = students.stream().mapToInt(e -> e.getCourse())
//                      .average().getAsDouble();
//              System.out.println(avr);

               int min = students.stream().mapToInt(e -> e.getCourse()).min().getAsInt();
               System.out.println(min);

               int max = students.stream().mapToInt(e -> e.getCourse()).max().getAsInt();
               System.out.println(max);
    }
}

/**
 * @boxed() конвертирует (оборачивает) int в Integer.
 * @sum() суммирует. В нашем случае суммирует курсы всех студентов
 * @average() вычисляет среднее арифметическое
 * @min() вычисляет минимальное значение в стриме
 * @max() вычисляет максимальное значение в стриме
 */