package Bai_1A;

public class Animal {
    // Private field
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // toString method
    @Override
    public String toString() {
        // Returns in the format: Animal[name="..."]
        return "Animal[name=\"" + name + "\"]";
    }
}