package InterfaceResizeable;

public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "(1) A Circle with width:= "
                + getWidth()+ "length:= " + getLength()
                + " (2) before area: "
                + getArea()
                + " ,(3) after resize (1-100) area: "
                + resize(getArea());
    }

    @Override
    public double resize(double percent) {
        double reArea = getArea() + Math.floor(Math.random() * 99) + 1;
        return reArea;
    }
}
