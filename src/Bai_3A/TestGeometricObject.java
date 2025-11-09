package Bai_3A;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geom1 = new Circle(5.0);
        GeometricObject geom2 = new Rectangle(4.0, 6.0);

        System.out.println(geom1);
        System.out.println("Area: " + geom1.getArea());
        System.out.println("Perimeter: " + geom1.getPerimeter());

        System.out.println();

        System.out.println(geom2);
        System.out.println("Area: " + geom2.getArea());
        System.out.println("Perimeter: " + geom2.getPerimeter());
    }
}
