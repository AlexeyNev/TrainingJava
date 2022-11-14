package Stream;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int [] array = {5, 9 , 4, 3, 1};
//        Arrays.stream(array).forEach(e -> System.out.println(e));
        Arrays.stream(array).forEach(Utils::myMethod);
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}