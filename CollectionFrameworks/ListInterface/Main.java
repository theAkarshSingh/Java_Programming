package CollectionFrameworks.ListInterface;

import java.util.*;

public class Main {
    static void main() {

        //List or Collection -> Interface
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println("Array List 1 : " + arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(101);
        arrayList2.add(102);
        System.out.println("Array List 2 : " + arrayList2);
        arrayList2.add(10);

        arrayList.addAll(arrayList2);
        System.out.println(arrayList);

        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);
        System.out.println("Size : " + arrayList.size());

        arrayList2.clear();
        System.out.println(arrayList2);

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }

        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(202);
        list.add(303);
        list.add(404);
        list.add(505);
        System.out.println("List : " + list.get(0) + "\t" + list.get(1) + "\t" +
                list.get(2) + "\t" + list.get(3) + "\t" + list.get(4));

        list.set(2, 333);
        System.out.println("\nList after set : " + list);

        //toArray -> convert collections into Array
        Object[] arr = list.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        //contains -> returns true if element is present
        System.out.println(list.contains(100));

        list.add(80);
        list.add(50);
        System.out.println("\nUnsorted list : " + list);

        //sort a collection
        Collections.sort(list);
        System.out.println("Sorted list : " + list);

        //clone -> stores shallow copy
        ArrayList<Integer> newList = (ArrayList<Integer>) ((ArrayList<Integer>) list).clone();
        System.out.println(newList);

        //ensureCapacity()
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println("Is ArrayList Empty? true or false : " + newList.isEmpty());
        System.out.println("Index of 80 is : " + newList.indexOf(80));

        Collection<Integer> collection = new ArrayList<>();
    }
}
