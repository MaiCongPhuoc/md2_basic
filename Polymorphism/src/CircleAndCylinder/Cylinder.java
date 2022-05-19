package CircleAndCylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder() {

    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getCanxilanh() {
        return Math.PI * super.getRadius() * super.getRadius() * height;
    }

    @Override
    public String toString() {
        return "Can-xi-lanh is: " + getCanxilanh() + ", " + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.0, "red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5.0, "blue", 2.0);
        System.out.println(cylinder);
    }
}
