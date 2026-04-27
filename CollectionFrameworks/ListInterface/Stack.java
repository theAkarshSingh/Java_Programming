package CollectionFrameworks.ListInterface;

public class Stack {
    static void main() {

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println("Elements : " + stack);

        //LIFO => Last In First Out approach is used in Stack

        stack.pop();
        System.out.println(stack);

        System.out.println("Element at top : " + stack.peek());

        System.out.println("Index of 11 : " + stack.search(11)); //Indexes element from top(in order of input)
        System.out.println("When Element isn't present : " + stack.search(12));

        System.out.println("Is Stack Empty? : " + stack.empty());
    }
}
