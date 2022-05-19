package Triangle;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private double p = (side1 + side2 + side3) / 2;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        if (getSide1() == getSide2() && getSide2() == getSide3()) {
            System.out.println("TAM GIAC CAN: " + getSide1());
            return (getSide1() * ((double) 1 / 2) * (getSide1() * (Math.sqrt(3) / 2)));
        } else {
            if (getSide1() == getSide2()) {
                return (getSide1() * ((double) 1 / 2) * (Math.sqrt(getSide1() * getSide1() - getSide3() / 2)));
            } else if (getSide2() == getSide3()) {
                return (getSide2() * ((double) 1 / 2) * (Math.sqrt(getSide2() * getSide2() - getSide1() / 2)));
            } else if (getSide3() == getSide1()) {
                return (getSide3() * ((double) 1 / 2) * (Math.sqrt(getSide3() * getSide3() - getSide2() / 2)));
            } else {
                return (getSide1() * ((double) 1 / 2) * (2 * (Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()))) / getSide1()));
            }
        }
    }

    public double getPerimeter() {
        return (side1 + side2 + side3) / 2;
    }

    @Override
    public String toString() {
        return "side1: " + getSide1()
                + " side2: " + getSide2()
                + " side3: " + getSide3()
                + " triangle area is: " +  (double) Math.round(getArea() * 1000) / 1000
                + " perimeter of triangle is: " + (double) Math.round(getPerimeter() * 1000) / 1000;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(2.1, 2.1, 2.1);
        System.out.println(triangle);
    }
}
