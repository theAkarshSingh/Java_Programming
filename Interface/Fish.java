package Interface;

public class Fish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("*The Fish is swimming away*");
    }

    public void hunt() {
        System.out.println("*The Fish is Hunting*");
    }
}
