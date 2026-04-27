package CollectionFrameworks.QueueInterface;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    static void main() {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.offer(40); //same as add(), returns false if fails to add

        System.out.println(queue);

        System.out.println("Removing : " + queue.poll());
        System.out.println(queue);

        System.out.println("Front Element of Queue : " + queue.peek());

        // Deque
        Deque<Integer> deque = new LinkedList<>();
        deque.offer(100);
        deque.offer(200);
        deque.offer(500);
        System.out.println("Deque : " + deque);

        System.out.println("Removing : " + deque.poll());
        System.out.println(deque);

        System.out.println("Peeking Deque : " + deque.peek());

    }
}
