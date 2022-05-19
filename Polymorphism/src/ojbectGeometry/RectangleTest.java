package ojbectGeometry;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.3);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 3.8, "orrange", true);
        System.out.println(rectangle);
    }
}
