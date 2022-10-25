package Queue_interface;

import java.util.PriorityQueue;
/**
 * Натуральная сортировка - 1 4 7 8 10. Сортировка от наименьшего к наибольшему
 * PriorityQueue - использует натуральную сортировку
 */
public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
//        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

    }
}