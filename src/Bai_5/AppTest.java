package Bai_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppTest {
    public static void main(String[] args) {

        // --- 1. Test Employee Class ---
        System.out.println("--- Testing Employee ---");
        
        // Create 4 employees to test sorting
        Employee e1 = new Employee("E101", "Alice", 50, 1, 2); // Travel=2, Leave=1
        Employee e2 = new Employee("E102", "Bob", 60, 1, 3);   // Travel=3, Leave=1
        Employee e3 = new Employee("E103", "Charlie", 55, 0, 3); // Travel=3, Leave=0 (Highest Rank)
        Employee e4 = new Employee("E104", "David", 45, 2, 1); // Travel=1, Leave=2 (Lowest Rank)

        // Test calculateWeeklySalary() for Alice
        System.out.println("Alice's Weekly Salary: " + e1.calculateWeeklySalary()); // Expected: 2000

        // Test toString() for Bob
        System.out.println("Bob's Info: " + e2.toString()); // Expected: [Name: Bob - Salary Per Hour: 60 - Weekly Salary: 2640]
        
        System.out.println("\n");

        // --- 2. Test Project Class ---
        System.out.println("--- Testing Project ---");

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date start = sdf.parse("2025-11-01");
            Date end = sdf.parse("2025-11-28"); 

            Project p1 = new Project("P-ALPHA", start, end);

            // Add employees (in an unsorted order)
            p1.addEmployee(e1); // Alice
            p1.addEmployee(e2); // Bob
            p1.addEmployee(e3); // Charlie
            p1.addEmployee(e4); // David

            System.out.println("Estimated Project Budget: " + p1.estimateBudget()); // Expected: 33600
            
            System.out.println("\n");

            System.out.println(p1.toString());

        } catch (ParseException e) {
            System.err.println("Error parsing dates: " + e.getMessage());
        }
    }
}