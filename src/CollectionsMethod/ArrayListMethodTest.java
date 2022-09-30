package CollectionsMethod;

import java.util.ArrayList;

/**
 * add() - добавить
 * get() - достать
 * set() - вставляет элемент в arrayList на определенный индекс set==replace
 * remove() - удалить элемент. Вводим индекс элемента в параметры или сам элемент который надо удалить
 *
 */
public class ArrayListMethodTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alexey");
        arrayList.add("Alla");
        arrayList.add("Marsic");
        arrayList.add(0,"Krisik");
        for (String s : arrayList) {
            System.out.println(s + " ");
        }
        System.out.println();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        System.out.println(arrayList1);
        System.out.println(arrayList.get(3));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.set(0,"Meow");
        System.out.println(arrayList);
        arrayList.set(3,"Meow");
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
        arrayList.remove("Meow");
        System.out.println(arrayList);
    }
}
