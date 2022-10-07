package ListIteratorExample;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorPalindrom2 {
    public static void main(String[] args) {
        String pal = "kazak";
        LinkedList<Character> linkedList = new LinkedList<>();
        for (char c : pal.toCharArray()) {
            linkedList.add(c);
        }
        ListIterator<Character> iterator = linkedList.listIterator();
        ListIterator<Character> reversIterator = linkedList.listIterator(linkedList.size());
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
