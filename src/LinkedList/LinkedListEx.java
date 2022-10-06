package LinkedList;

import java.util.LinkedList;

/**
 * в LinkedList все элементы знают о друг друге
 * и имеют связь/есть ссылка на элемент до и на элемент последующий.
 * если элемент ссылается на null это означает конец Lista, дальше элементов нет.
 */
public class LinkedListEx {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 3);
        Student student2 = new Student("Nikolay", 2);
        Student student3 = new Student("Elena", 1);
        Student student4 = new Student("Petr", 4);
        Student student5 = new Student("Mariya", 3);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);
        System.out.println("LinkedList = " + studentLinkedList);
        System.out.println(studentLinkedList.get(2));

    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    class Cat {
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}