package Queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alex");
        queue.add("Petr");
        queue.add("Mark");
        queue.add("Marsic");
        queue.add("Alla");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
