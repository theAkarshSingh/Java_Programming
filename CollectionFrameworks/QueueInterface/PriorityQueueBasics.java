package CollectionFrameworks.QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    static void main() {

        Queue<Integer> pq = new PriorityQueue<>();
        //default behaviour -> Integers -> Less value -> high priority -> minHeap

        pq.offer(40);
        pq.offer(20);
        pq.offer(50);
        pq.offer(30);
        pq.offer(10);
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println("\n~~~~~~~~~~\n");

        //maxHeap -> Integers -> high value -> high priority
        Queue<Integer> pqq = new PriorityQueue<>((a, b) -> b - a);
        pqq.offer(40);
        pqq.offer(20);
        pqq.offer(50);
        pqq.offer(30);
        pqq.offer(10);
        System.out.println(pqq);

        System.out.println(pqq.poll());
        System.out.println(pqq);
        System.out.println(pqq.poll());
        System.out.println(pqq);
        System.out.println(pqq.poll());
        System.out.println(pqq);
        System.out.println(pqq.poll());
        System.out.println(pqq);
    }
}
