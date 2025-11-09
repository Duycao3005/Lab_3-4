package Bai_2B;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        
        // DÒNG NÀY LỖI:
        // System.out.println(s1.getRadius());
        // GIẢI THÍCH LỖI:
        // 's1' được khai báo là kiểu 'Shape'. Lớp 'Shape' không có phương thức 'getRadius()'.
        // Trình biên dịch chỉ nhìn vào kiểu ('Shape') chứ không phải đối tượng thực tế ('Circle').

        Circle c1 = (Circle)s1; // Downcast về Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // DÒNG NÀY LỖI:
        // Shape s2 = new Shape();
        // GIẢI THÍCH LỖI:
        // 'Shape' là một lớp trừu tượng (abstract class). Bạn không thể tạo đối tượng
        // ('new') trực tiếp từ một lớp trừu tượng.
        
        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
        System.out.println(s3); // in ra Rectangle.toString()
        System.out.println(s3.getArea()); // chạy getArea() của Rectangle
        System.out.println(s3.getPerimeter()); // chạy getPerimeter() của Rectangle
        System.out.println(s3.getColor());

        // DÒNG NÀY LỖI:
        // System.out.println(s3.getLength());
        // GIẢI THÍCH LỖI:
        // Giống như lỗi s1.getRadius(), 's3' là kiểu 'Shape' và 'Shape' không có
        // phương thức 'getLength()'.

        Rectangle r1 = (Rectangle)s3; // Downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        
        // DÒNG NÀY LỖI:
        // System.out.println(s4.getSide());
        // GIẢI THÍCH LỖI:
        // 's4' là kiểu 'Shape', và 'Shape' không có phương thức 'getSide()'.
        
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        
        // DÒNG NÀY LỖI:
        // System.out.println(r2.getSide());
        // GIẢI THÍCH LỖI:
        // 'r2' là kiểu 'Rectangle'. Mặc dù đối tượng thực tế là 'Square',
        // trình biên dịch chỉ biết 'r2' là 'Rectangle', và 'Rectangle' không có 'getSide()'.
        
        System.out.println(r2.getLength());
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
