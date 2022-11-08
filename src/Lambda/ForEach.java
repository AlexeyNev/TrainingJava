package Lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        /**
         * Работа forEach с Consumer
         */
        List<String> list = List.of("Hello", "Kak dela?");
        for(String s : list) {
            System.out.println(s);
        }
        list.forEach(str -> System.out.println(str));

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        list1.forEach(s -> System.out.print(s));
    }
}
