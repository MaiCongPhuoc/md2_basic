package CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;
    public Circle() {

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "red");
        System.out.println(circle.getRadius());
    }

    @Override
    public String toString() {
        return "Radius is: " + getRadius() + " color is: " + getColor();
    }
}
