package MapInterface;

import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Alexey");
        map1.put(34884, "Alla");
        map1.put(444, "Marsic");
        map1.put(445, "Oleg");
        map1.putIfAbsent(444, "Marsic");
        System.out.println(map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.containsValue("Alla"));
        System.out.println(map1.containsKey(444));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
