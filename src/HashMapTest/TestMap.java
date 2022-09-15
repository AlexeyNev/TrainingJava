package HashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        HashMap<Integer, String> maps = new HashMap<>();
        maps.put(123, "Alexey");
        maps.put(1234, "Alla");
        maps.put(12345, "Mars");
        System.out.println(maps);

        String nameAlexey = maps.get(123);
        String nameAlla = maps.get(1234);
        String nameMars = maps.get(12345);
        System.out.println(nameAlexey);
        System.out.println(nameAlla);
        System.out.println(nameMars);

        maps.remove(123);
        System.out.println(maps);

        System.out.println(maps.containsKey(123));
        System.out.println(maps.containsValue("Mars"));

        Set<Integer> keys = maps.keySet();
        System.out.println("Ключи " + keys);

        ArrayList<String> values = new ArrayList<>(maps.values());
        System.out.println("Значения " + values);
    }
}
