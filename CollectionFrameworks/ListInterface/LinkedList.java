package CollectionFrameworks.ListInterface;

public class LinkedList {
    static void main() {

        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();

        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(11);
        linkedList.add(33);
        linkedList.add(11);
        linkedList.add(44);
        linkedList.add(11);
        linkedList.add(55);

        System.out.println("Linked list : " + linkedList);
        System.out.println("Index of 22 : " + linkedList.indexOf(22));
        System.out.println("Index of last element : " + linkedList.lastIndexOf(11));

        linkedList.addFirst(123);
        linkedList.addLast(456);
        System.out.println("First & Last element added : " + linkedList);

        linkedList.removeFirst();
        System.out.println("First element removed : " + linkedList);

        linkedList.removeLast();
        System.out.println("Last element removed : " + linkedList);

        System.out.println("First Element : " + linkedList.getFirst());
        System.out.println("Last Element : " + linkedList.getLast());
        System.out.println("Peek : " + linkedList.peek()); //returns the first element head
        System.out.println("Poll : " + linkedList.poll()); //returns & removes the first element head
        linkedList.offer(111); //add element at last index
        System.out.println(linkedList);
    }
}
