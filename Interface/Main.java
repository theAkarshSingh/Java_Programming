package Interface;

public class Main {
    static void main() {
        // Interface -> a blueprint for a class that specifies a set of abstract methods
        // that implementing classes must define, supports multiple inheritance like behavior.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
