package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        int [] array = {3, 8, 1, 5 ,9, 12, 4, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

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

        students = students.stream().sorted( (x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(students);
    }
}
