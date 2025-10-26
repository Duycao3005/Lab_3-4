package Bai_1;

public class Dog extends Mammal {

    // Constructor
    public Dog(String name) {
        // Call the superclass (Mammal) constructor
        super(name);
    }

    // Greets method
    public void greets() {
        System.out.println("Woof");
    }

    // Overloaded greets method
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    // toString method
    @Override
    public String toString() {
        // Returns in the format: Dog[Mammal[...]]
        return "Dog[" + super.toString() + "]";
    }
}