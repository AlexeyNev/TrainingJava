package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> a1, Predicate<Student> pr) {
        for (Student s : a1) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Petr", 'm', 25, 2, 8.8);
        Student st3 = new Student("Alex", 'm', 30, 5, 8.0);
        Student st4 = new Student("Alla", 'w', 26, 4, 8.5);
        Student st5 = new Student("Marsic", 'm', 25, 1, 8.1);
        ArrayList<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();


        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgOfSmth(students, student -> (double)student.age);
        System.out.println(res);



//        info.testStudents(students, (Student s) -> {
//            return s.age < 30;} );
//
//        System.out.println("-------------");
//
//        info.testStudents(students, (Student s) -> {
//            return  s.sex != 'm';});
//
//        System.out.println("-------------");
//
//        info.testStudents(students, (Student s) -> {
//            return  s.avgGrade > 8.2;});
//
//        System.out.println("-------------");
//
//        info.testStudents(students, (Student s) -> {
//            return  s.course > 2;}); //полная запись
//
//        System.out.println("-------------");
//
//
//        Predicate<Student> p1 = el -> el.avgGrade > 8;
//        Predicate<Student> p2 = el -> el.sex == 'm';
//        info.testStudents(students, p1.and(p2));
        /**
         * с помощью and можно объединить две проверки
         */

//        info.testStudents(students, s -> s.course > 2); //короткая запись
//
//        StudentChecks sc = (Student p) -> {return p.avgGrade > 8;};
//        info.testStudents(students, sc); // еще один вариант записи

        /**
         * Можно укоротить лямбду
         * info.testStudents(students, s -> s.avgGrade > 8);
         */
//        info.testStudents(students, s -> s.avgGrade > 8);
//        info.testStudents(students, s -> s.age < 27);
    }


    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student student : list) {
            result += f.apply(student);
        }
        result = result / list.size();
        return result;
    }
}



//interface StudentChecks {
//    boolean check(Student s);
//}
