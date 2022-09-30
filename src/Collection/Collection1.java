package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Alex");
//        arrayList.add("Alla");
//        arrayList.add("Marsic");
//        System.out.println(arrayList);
//        ArrayList<String> arrayList2 = new ArrayList<>(15);
//        arrayList2.add("Alex");
//        arrayList2.add("Alla");
//        arrayList2.add("Marsic");
//        System.out.println(arrayList2);
        List arrList = new ArrayList();
        arrList.add("You");
        arrList.add(11);
        arrList.add(new Car());
        System.out.println(arrList);
        List<String> arrList2 = new ArrayList<>(arrList);
        System.out.println(arrList2);
        System.out.println(arrList == arrList2);
        System.out.println(arrList.equals(arrList2));



    }
}

class Car {

}