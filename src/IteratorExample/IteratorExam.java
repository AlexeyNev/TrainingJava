package IteratorExample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterator - итерация. Повторение.
 *
 * hasNext() - проверяет есть ли следующий элемент в листе
 *
 * hext() - выводит следующий элемент
 *
 * Разница между Iterator и forEach циклом заключается в том,
 * что с помощью Iteratora мы можем удалить элемент нашей коллекции
 */
public class IteratorExam {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alex");
        arrayList.add("Max");
        arrayList.add("Andrey");
        arrayList.add("Igor");
        arrayList.add("Elena");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList);
    }
}
