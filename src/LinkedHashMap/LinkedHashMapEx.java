package LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, false);

        Student st1 = new Student("Ivan", "Petrov", 3);
        Student st2 = new Student("Nikolay", "Sidorov", 2);
        Student st3 = new Student("Elena", "Katkova", 1);
        Student st4 = new Student("Ivan", "Petrov", 3);


        linkedHashMap.put(5.6, st1);
        linkedHashMap.put(4.7, st2);
        linkedHashMap.put(3.6, st3);
        linkedHashMap.put(0.7, st4);

        System.out.println(linkedHashMap);
    }

    static class Student {
        public final String name;
        public final String surname;
        public final int course;

        public Student(String name, String surname, int course) {
            this.name = name;
            this.surname = surname;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", course=" + course +
                    '}';
        }
    }
}
