package InterfaceResizeable;

public class Circle extends Shape implements IResizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "(1) A Circle with radius= "
                + getRadius()
                + " (2) before Periangle: "
                + getArea()
                + " ,(3) after resize (1-100) area: "
                + resize(getArea());
    }

    @Override
    public double resize(double percent) {
        double reArea = getArea() + (Math.floor(Math.random() * 100) + 1);
        return reArea;
    }
}
