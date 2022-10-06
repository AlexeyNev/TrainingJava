package LinkedList;

import java.util.LinkedList;

public class CatLinkedList {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Marsic",4);
        Cat cat2 = new Cat("Zuzzha",1);
        Cat cat3 = new Cat("Murzic",15);

        LinkedList<Cat> catLinkedList = new LinkedList<>();
        catLinkedList.add(cat1);
        catLinkedList.add(cat2);
        catLinkedList.add(cat3);
        System.out.println(catLinkedList);
        System.out.println(catLinkedList.get(0));
        Cat cat4 = new Cat("Muha",6);
        Cat cat5 = new Cat("Lars",8);
        catLinkedList.add(cat4);
        System.out.println(catLinkedList);
        catLinkedList.add(0,cat5);
        System.out.println(catLinkedList);
        catLinkedList.remove(0);
        System.out.println(catLinkedList);
    }
}

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


