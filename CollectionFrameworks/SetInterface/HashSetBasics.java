package CollectionFrameworks.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    static void main() {

        Set<Integer> set1 = new HashSet<>(); // TC -> O(1)
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(50);
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(20);
        set2.add(22);
        set2.add(50);
        System.out.println(set2);

        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set1.containsAll(set2));

        Set<Integer> set3 = new LinkedHashSet<>(); // TC -> O(n)
        set3.add(101);
        set3.add(112);
        set3.add(222);
        System.out.println(set3);

        Set<Integer> set4 = new TreeSet<>(); // TC -> O(log n)
        set4.add(111);
        set4.add(222);
        set4.add(333);
        set4.add(444);
        set4.add(555);
        System.out.println(set4);

    }
}
