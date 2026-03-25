package OOP;

public class overloadedConstructor {
    static void main() {
        User user1 = new User("Akarsh");
        User user2 = new User("Singh", "singh@gmail.com");
        User user3 = new User("Akarsh Singh", "akarshsingh@gmail.com", 20);
        User user4 = new User();

        System.out.println("User 1 :");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println("Age : " + user1.age);

        System.out.println("------");

        System.out.println("User 2 :");
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println("Age : " + user2.age);

        System.out.println("------");

        System.out.println("User 3 :");
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println("Age : " + user3.age);

        System.out.println("------");

        System.out.println("User 4 :");
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println("Age : " + user4.age);
    }
}
