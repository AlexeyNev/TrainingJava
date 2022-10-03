package CollectionsMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * containsAll() - проверяет содержит ли arrayList все элементы arrayLista из переданного параметра
 * subList() - создает из имеющегося arrayLista subList, т.е его отрывок в виде List<>
 */
public class ArrayListMethodsTest5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Alex");
        arrayList1.add("Max");
        arrayList1.add("Andrey");
        arrayList1.add("Igor");
        arrayList1.add("Elena");
        System.out.println("ArrayList = " + arrayList1);

        List<String> myList = arrayList1.subList(1, 4);
        System.out.println("SubList = " + myList);
        myList.add("Fedor");
        System.out.println("SubList = " + myList);
        System.out.println("ArrayList = " + arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Kolya");
//        arrayList2.add("Max");
//        arrayList2.add("Andrey");
//        arrayList2.add("Igor");

//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);
    }
}
