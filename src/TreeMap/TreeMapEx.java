package TreeMap;

import HashMapTest.HashCodeEx;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx {
    public void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Ivan", "Petrov", 3);
        Student st2 = new Student("Nikolay", "Sidorov", 2);
        Student st3 = new Student("Elena", "Katkova", 1);
        Student st4 = new Student("Ivan", "Petrov", 3);
        Student st5 = new Student("Nikolay", "Sidorov", 2);
        Student st6 = new Student("Elena", "Katkova", 1);
        Student st7 = new Student("Nikolay", "Sidorov", 2);

        treeMap.put(5.18, st1);
        treeMap.put(3.6, st2);
        treeMap.put(4.2, st3);
        treeMap.put(2.9, st4);
        treeMap.put(22.3, st5);
        treeMap.put(5.0, st6);
        treeMap.put(2.8, st7);

//        treeMap.remove(5.18);
//        System.out.println(treeMap);
//
//        System.out.println(treeMap.get(2.9));
//
//        System.out.println(treeMap);

//        System.out.println(treeMap.tailMap(7.5));
    }

    public static class Student {
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

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            HashCodeEx.Student student = (HashCodeEx.Student) o;
//            return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(name, surname, course);
//        }
    }
}
