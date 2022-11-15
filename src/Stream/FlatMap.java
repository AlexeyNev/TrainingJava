package Stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'm', 28, 5.5);
        Student st2 = new Student("Alla", 'f', 25, 6.5);
        Student st3 = new Student("Max", 'm', 23, 7.5);
        Student st4 = new Student("Anton", 'm', 24, 3.5);
        Student st5 = new Student("Mariya", 'f', 14, 0.5);

        Faculty faculty = new Faculty("Economics");
        Faculty faculty1 = new Faculty("Apply mathematics");

        faculty.addStudentToFaculty(st1);
        faculty.addStudentToFaculty(st2);
        faculty.addStudentToFaculty(st3);
        faculty1.addStudentToFaculty(st4);
        faculty1.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(faculty);
        facultyList.add(faculty1);

        facultyList.stream().flatMap(facul -> facul.getStudentsOnFaculty().stream())
                .forEach(e -> System.out.println(e.getName()));
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}