package Bai_3;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {
    public static void main(String[] args) {
        
        // 1. Create Student and Staff objects
        Student s1 = new Student("Alice", "123 Main St", "Computer Science", 2, 15000.0);
        Staff f1 = new Staff("Bob", "456 Oak Ave", "Greenwood High", 55000.0);
        Student s2 = new Student("Charlie", "789 Pine Ln", "Biology", 1, 14500.0);

        // 2. Print out information (tests toString() and getters implicitly)
        System.out.println("--- Initial Objects ---");
        System.out.println(s1);
        System.out.println(f1);
        System.out.println(s2);

        // 3. Change information using setters
        System.out.println("\n--- Testing Setters ---");
        s1.setYear(3);
        s1.setFee(15500.0);
        f1.setPay(57500.0);
        
        System.out.println("Updated Student 1: " + s1);
        System.out.println("Updated Staff 1: " + f1);

        // 4. Test individual getters
        System.out.println("\n--- Testing Getters ---");
        System.out.println("Student 1's Name: " + s1.getName());
        System.out.println("Student 1's Program: " + s1.getProgram());
        System.out.println("Staff 1's School: " + f1.getSchool());
        System.out.println("Staff 1's Pay: " + f1.getPay());

        // 5. Create a list of Students and Staff (demonstrates polymorphism)
        System.out.println("\n--- Testing with a List<Person> ---");
        List<Person> people = new ArrayList<>();
        people.add(s1);
        people.add(f1);
        people.add(s2);

        for (Person p : people) {
            System.out.println(p);
        }
    }
}