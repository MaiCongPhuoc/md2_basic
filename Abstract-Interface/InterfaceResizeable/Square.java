package InterfaceResizeable;

public class Square extends Shape implements IResizeable {
    private double width = 1.0;
    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return this.width * this.width;
    }
    public double getPeriangle() {
        return this.width * 4;
    }
    public double getResizeSquare() {
        return getArea();
    }

    @Override
    public String toString() {
        return "(1) A Circle with width:= "
                + getWidth()
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
