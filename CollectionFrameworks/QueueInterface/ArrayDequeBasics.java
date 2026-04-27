package CollectionFrameworks.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBasics {
    static void main() {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(101);
        deque.offerFirst(110);
        deque.offerLast(111);

        System.out.println(deque);
        System.out.println("Size of Deque : " + deque.size());

        System.out.println("Peek : " + deque.peek());
        System.out.println("Peek First : " + deque.peekFirst());
        System.out.println("Peek Last : " + deque.peekLast());

        deque.pollLast();
        System.out.println(deque);

        deque.pollFirst();
        System.out.println(deque);
    }
}
