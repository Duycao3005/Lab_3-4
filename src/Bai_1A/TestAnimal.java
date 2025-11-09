package Bai_1A;
public class TestAnimal {
    public static void main(String[] args) {
        // Create instances
        Animal a1 = new Animal("Generic Animal");
        Mammal m1 = new Mammal("Generic Mammal");
        Cat c1 = new Cat("Whiskers");
        Dog d1 = new Dog("Buddy");
        Dog d2 = new Dog("Lucy");

        // Test toString() methods (matches the example output)
        System.out.println("--- Testing toString() ---");
        System.out.println("Animal: " + a1.toString());
        System.out.println("Mammal: " + m1.toString());
        System.out.println("Cat: " + c1.toString());
        System.out.println("Dog: " + d1.toString());

        System.out.println("\n--- Testing greets() ---");
        // Test Cat greets
        System.out.print("Cat c1 says: ");
        c1.greets(); // Prints "Meow"

        // Test Dog greets
        System.out.print("Dog d1 says: ");
        d1.greets(); // Prints "Woof"

        // Test overloaded Dog greets
        System.out.print("Dog d1 greets Dog d2: ");
        d1.greets(d2); // Prints "Woooof"
    }
}
