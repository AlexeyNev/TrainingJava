package ListIteratorExample;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * toCharArray() - создает массив чаров. Разделяет слово на символы и создает массив этих символов.
 */
public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrom = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
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
