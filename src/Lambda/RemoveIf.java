package Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *         arrayList.removeIf(el -> el.length() < 5);
 *
 *         Predicate<String> p = element -> element.length() < 5;
 *         arrayList.removeIf(p);
 *
 *         Одно и тоже
 */
public class RemoveIf {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Bye");
        arrayList.add("Learn Java");

        arrayList.removeIf(el -> el.length() < 5);

        Predicate<String> p = element -> element.length() < 5;
        arrayList.removeIf(p);

        System.out.println(arrayList);
    }
}
