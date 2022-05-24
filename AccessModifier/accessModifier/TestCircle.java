package accessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir1 = new Circle();
        System.out.println("cir1: " + cir1.getRadius());
        System.out.println("cir1: " + cir1.getArea());

        Circle cir2 = new Circle(3);
        System.out.println("cir2: " + cir2.getRadius());
        System.out.println("cir2: " + cir2.getArea());
    }
}
