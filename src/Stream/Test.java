package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Ok");
        list.add("Stream");
        list.add("Api");

        /**
         * Заполнение list цифрами(длинами слов) с помощью цикла for.
         * [5, 5, 2, 6, 3]
         */
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }


        List<Integer> list2 = list.stream().map(element -> element.length())
                .collect(Collectors.toList());
        /**
         * 1) из коллекции list сделали stream list.stream()
         * 2) .map() берет по очереди каждый элемент из нашего стрима
         * 3) element -> element.length() c помощью лямбды получаем нужное для нас значение
         *      каждого элемента листа.
         * 4) Чтобы вывести результат на экран -
         * мы должны сначала преобразовать этот поток в лист
         * с помощью  .collect(Collectors.toList());
         * System.out.println(list2);
         * В итоге получается результат как при заполнении через цикл фор.
         * [5, 5, 2, 6, 3]
         */
        System.out.println(list2);


        int[] array = {4, 6, 7, 3, 1};
       array =  Arrays.stream(array).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("W");
        set.add("Ok");
        set.add("Stream");


        Set<Integer> set1 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set1);
    }
}
