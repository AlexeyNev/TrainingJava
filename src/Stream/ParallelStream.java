package Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        double sumResult = list.parallelStream().reduce((acc, elem) -> acc + elem).get();
//        System.out.println("sumResult = " + sumResult);

        double divisionResult = list.parallelStream().reduce((acc, elem) -> acc / elem).get();
        System.out.println("divisionResult " + divisionResult);
    }
}
/**
 * parallelStream() - для решения задач с большим количеством данных.
 * Делит один поток на потоки с помощью ядед процессоров (раскидывает задачу на все ядра)
 */