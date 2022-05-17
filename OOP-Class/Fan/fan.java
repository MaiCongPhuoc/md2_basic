package Fan;

public class fan {
    public static void main(String[] args) {
        fan1 fan1 = new fan1(3, true, 10, "yellow");
        fan1 fan2 = new fan1(2, false, 5, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
