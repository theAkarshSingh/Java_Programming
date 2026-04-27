package OOP.Abstraction;

//abstract -> used to define abstract classes & methods.
//abstraction is the process of hiding implementation data and showing only the essential features

public abstract class Shape {
    abstract double area();

    void display() { //Concrete method
        System.out.println("This is a Shape.");
    }
}
