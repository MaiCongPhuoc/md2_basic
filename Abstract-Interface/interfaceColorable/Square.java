package interfaceColorable;

public class Square implements IColorable {
    private double width = 1.0;
    private String color;

    public Square() {
    }
    public Square(double width, String color) {
        this.width = width;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
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
        return "here is toString";
    }

    @Override
    public void howToColor() {
        System.out.println("Color "+ getColor() +" all four sides " + getWidth());
    }
}
