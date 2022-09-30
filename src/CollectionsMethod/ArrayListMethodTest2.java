package CollectionsMethod;

import java.util.ArrayList;
import java.util.Objects;

/**
 * remove() - проверяет есть ли объект в ArrayList или нет. Если есть - он удаляется, если нет - то не удаляется.
 * indexOf() - принимает объект и возвращает его позицию в ArrayList либо -1 если объект в ArrayList не найден
 *  * (сравнение объектов листа идет за счет использования метода equals.)
 */

public class ArrayListMethodTest2 {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 'm', 19, 2, 2.0);
        Student student2 = new Student("Max", 'm', 22, 2, 4.0);
        Student student3 = new Student("Vladik", 'm', 20, 2, 2.6);
        Student student4 = new Student("Alla", 'f', 25, 3, 2.4);
        Student student5 = new Student("Marsic", 'm', 4, 1, 2.0);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
//        System.out.println(studentList);
//        Student student6 = new Student("Mariya", 'm', 4, 1, 2.0);
//        studentList.remove(student6);
//        int index = studentList.indexOf(student3);
//        System.out.println(index);

    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student (String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
