package Bai_2;

public class TestShape {
    public static void main(String[] args) {
        
        System.out.println("--- Testing Shape Class ---");

        // 1. Test no-arg constructor
        Shape s1 = new Shape();
        System.out.println("s1 (default): " + s1.toString()); 

        // 2. Test getters
        System.out.println("s1 color: " + s1.getColor()); // Should be "green"
        System.out.println("s1 filled: " + s1.isFilled()); // Should be true

        // 3. Test setters
        s1.setColor("blue");
        s1.setFilled(false);
        
        System.out.println("\n--- After using setters ---");
        System.out.println("s1 color: " + s1.getColor()); // Should be "blue"
        System.out.println("s1 filled: " + s1.isFilled()); // Should be false
        System.out.println("s1 (modified): " + s1.toString());

        // 4. Test parameterized constructor
        Shape s2 = new Shape("red", true);
        System.out.println("\ns2 (parameterized): " + s2.toString());
        System.out.println("s2 color: " + s2.getColor()); // Should be "red"
        System.out.println("s2 filled: " + s2.isFilled()); // Should be true
    }
}