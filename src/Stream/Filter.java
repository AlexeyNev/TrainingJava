package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'm', 28, 3,5.5);
        Student st2 = new Student("Alla", 'f', 25, 2, 6.5);
        Student st3 = new Student("Max", 'm', 23,  4,7.5);
        Student st4 = new Student("Anton", 'm', 24, 1,3.5);
        Student st5 = new Student("Mars", 'm', 4, 5,0.5);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students = students.stream().filter(e -> e.getAge() > 22 && e.getAvgGrade() < 7).collect(Collectors.toList());
        students = students.stream().filter(e -> e.getSex() == 'f').collect(Collectors.toList());
        System.out.println(students);

        /**
         * .collect(Collectors.toList()) - преобразование к новому листу с отфильтрованными
         * значениями.
         */
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.avgGrade = avgGrade;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                '}';
    }
}