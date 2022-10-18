package SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Alex");
        set.add("Oleg");
        set.add("Igor");
        set.add("Marina");

        System.out.println(set);

        set.remove("Marina");

        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }
    }
}
