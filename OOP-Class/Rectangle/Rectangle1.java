package Rectangle;

public class Rectangle1 {
    double width;
    double height;

    Rectangle1(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return (width + height) * 2;
    }

    String display() {
        return "Rectangle (" + "width: " + width + ", hieght: " + height + ")";
    }
}
