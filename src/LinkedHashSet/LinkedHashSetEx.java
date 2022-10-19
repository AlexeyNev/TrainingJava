package LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ihs = new LinkedHashSet<>();
        ihs.add(5);
        ihs.add(1);
        ihs.add(3);
        ihs.add(8);
        ihs.add(10);
        System.out.println(ihs);

        ihs.remove(1);
        System.out.println(ihs);
        System.out.println(ihs.contains(1));
    }
}
