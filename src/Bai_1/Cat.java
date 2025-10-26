package Bai_1;
public class Cat extends Mammal {

    // Constructor
    public Cat(String name) {
        // Call the superclass (Mammal) constructor
        super(name);
    }

    // Greets method
    public void greets() {
        System.out.println("Meow");
    }

    // toString method
    @Override
    public String toString() {
        // Returns in the format: Cat[Mammal[...]]
        return "Cat[" + super.toString() + "]";
    }
}
