package Fan;

public class fan1 {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }
    public int getMEDIUM() {
        return MEDIUM;
    }
    public int getFAST() {
        return FAST;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void setSpeed (int newSpeed) {
        this.speed = newSpeed;
    }
    public void setOn (boolean newOn) {
        this.on = newOn;
    }
    public void setRadius (double newRadius) {
        this.radius = newRadius;
    }
    public void setColor (String newColor) {
        this.color = newColor;
    }
    public fan1() {

    }
    public fan1(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    @Override
    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("fan is on \n");
            state += ("Speed: " + this.speed + "\n");
        } else {
            state += ("fan is off");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }
}
