package Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list =  new ArrayList<>();
        list.add("Marsic");
        list.add("Alexey");
        list.add("Alla");
        System.out.println("Pered sortirovkoi");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Posle sortirovki");
        System.out.println(list);
    }
}
