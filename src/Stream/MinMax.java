package Stream;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
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

        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(min);

        /**
         * Делаем стрим на основе students, используем метод min() и
         * добавляем компаратор на основе него и будет идти вычисление
         * на младшего студента min((x, y) -> x.getAge() - y.getAge())
         * с помощью .get() получаем вычисление
         */

        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(max);

        /**
         * Делаем стрим на основе students, используем метод max() и
         * добавляем компаратор на основе него и будет идти вычисление
         * на старшего студента max((x, y) -> x.getAge() - y.getAge())
         * с помощью .get() получаем вычисление
         */
    }
}
