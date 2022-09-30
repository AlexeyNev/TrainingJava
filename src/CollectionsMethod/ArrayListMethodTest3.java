package CollectionsMethod;

import java.util.ArrayList;

/**
 * addAll() - добавить все элменты ArrayList в другой ArrayList
 * clear() - очишает ArrayList
 * lastIndexOf() - покажет последнее вхождение элемента. Например если в ArrayList есть два одинаковых элемента
 * size() - возвращает длину ArrayList
 * isEmpty() - проверяет не пустой ли ArrayList. true - если ArrayList пуст и false если нет
 * contains() - проверяет содержит ли ArrayList какой то объект. Возвращает true или false.
 * toString() - перевод ArrayList в string. Но этот метод по умолчанию вызывается у ArrayList.
 */
public class ArrayListMethodTest3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Petr");
        arrayList1.add("Masha");
        System.out.println(arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList1.add("!!!");
//        arrayList1.add("???");
//
//        arrayList1.addAll(arrayList2);
//        System.out.println(arrayList1);
//
//        arrayList2.clear();
//        System.out.println(arrayList2);
//        System.out.println(arrayList1.indexOf("Petr"));
//        System.out.println(arrayList1.indexOf("Mars"));
//        System.out.println(arrayList1.size());
//        System.out.println(arrayList1.isEmpty());
          System.out.println(arrayList1.contains("Mariya"));
          System.out.println(arrayList1.contains("Masha"));
    }
}
