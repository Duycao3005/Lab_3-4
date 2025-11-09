package Bai_3B;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle rc1 = new ResizableCircle(10.0);

        System.out.println(rc1);
        

        System.out.println("Area: " + rc1.getArea());

        rc1.resize(50);
        System.out.println(rc1);
        
        rc1.resize(200);
        System.out.println(rc1);
    }
}