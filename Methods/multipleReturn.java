package Methods;

public class multipleReturn {
    static String greetMsg() {
        boolean isMorning = true;
        if (!isMorning)
            return "Good Morning";
        else
            return "Good Day";
    }

    public static void main(String[] args) {
        System.out.println(greetMsg());
    }
}
