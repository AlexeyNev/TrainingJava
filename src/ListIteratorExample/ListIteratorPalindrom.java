package ListIteratorExample;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorPalindrom {
    public static void main(String[] args) {
        String p = "dohod";
        List<Character> list = new LinkedList<>();
        for (char c : p.toCharArray()) {
            list.add(c);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversIterator = list.listIterator(list.size());
        boolean isPalindrom = true;
        while (iterator.hasNext() && reversIterator.hasPrevious()) {
            if (iterator.next() != reversIterator.previous()) {
                isPalindrom = false;
                break;
            }
        }

        if (isPalindrom) {
            System.out.println("Palindrom");
        }
        else {
            System.out.println("NotPalindrom");
        }
    }
}
