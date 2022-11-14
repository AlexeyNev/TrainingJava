package Stream;

import java.util.ArrayList;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(9);
        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);

        /**
         * после вызова в list стрим, у нас появляется стрим который содержит
         * такие элементы 3, 2, 7, 5, 9
         * мы работаем с двумя параметрами accumulator и element
         * accumulator сразу присваивается первое значения потока, в нашем случае 3
         * element присваивается второе значение потока, в нашем случае 2
         * затем происходит умножение accumulator и element 3 * 2 и передача этого произведения аккумулятору
         * 3*2 = 6, 6*7 = 42, 42*5 = 210, 210*9 = 1890.
         * Ответ 1890.
         */

    }
}
