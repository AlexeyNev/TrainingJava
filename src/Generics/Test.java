package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Java 5
        List animals = new ArrayList();
        Animal an = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(an);

        String animal = (String) animals.get(3);
        System.out.println(animal);

        // появление дженериков
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");


        String animal2 = animals2.get(2);

        // Java 7
        List<String> anima = new ArrayList<>();

    }
}

class Animal {

}
