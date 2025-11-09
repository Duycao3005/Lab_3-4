package Bai_2A;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter
    public double getSide() {
        return getWidth();
    }

    // Setter
    public void setSide(double side) {
        // Sets both width and length
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}