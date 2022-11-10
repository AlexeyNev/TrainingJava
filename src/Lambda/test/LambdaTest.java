package Lambda.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Сортировка с помощью лямбда выражения Collections.sort(list, (s1, s2) -> -s1.compareTo(s2));
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.format("%02d", i));
        }

        Collections.sort(list, (s1, s2) -> -s1.compareTo(s2));

        for (String s : list) {
            System.out.println(s);
        }
    }
}
