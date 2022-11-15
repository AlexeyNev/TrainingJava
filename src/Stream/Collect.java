package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'm', 28, 3, 5.5);
        Student st2 = new Student("Alla", 'f', 25, 2,6.5);
        Student st3 = new Student("Max", 'm', 23, 4, 7.5);
        Student st4 = new Student("Anton", 'm', 24, 2,3.5);
        Student st5 = new Student("Mariya", 'f', 14, 1,0.5);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Map<Integer, List<Student>> map = students.stream().map(e -> {
//            e.setName(e.getName().toUpperCase());
//            return e;
//        })
//                .collect(Collectors.groupingBy(e -> e.getCourse()));
//        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//        }

          Map<Boolean, List<Student>> map =
                  students.stream().collect(Collectors.partitioningBy(e -> e.getAvgGrade() > 7));
          for (Map.Entry<Boolean, List<Student>> entry: map.entrySet()) {
              System.out.println(entry.getKey() + ": " + entry.getValue().toString());
          }
    }
}
