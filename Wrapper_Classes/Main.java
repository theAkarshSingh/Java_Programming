package Wrapper_Classes;

public class Main {
    static void main() {

        // Autoboxing
        Integer a = 123;
        Double b = 2.50;
        Character c = '*';
        Boolean d = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Unboxing
        int x = a;
        System.out.println(x);

        // toString
        String aa = Integer.toString(123);
        String bb = Double.toString(2.22);
        String cc = Character.toString('@');
        String dd = Boolean.toString(false);
        String s = aa + bb + cc + dd;
        System.out.println(s);

        // Parsing
        int n = Integer.parseInt("1234");
        double k = Double.parseDouble("11.11");
        char ch = "Pizza".charAt(0);
        boolean bool = Boolean.parseBoolean("true");
        System.out.println(n);
        System.out.println(k);
        System.out.println(ch);
        System.out.println(bool);

        // misc methods
        char letter = 'i';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
