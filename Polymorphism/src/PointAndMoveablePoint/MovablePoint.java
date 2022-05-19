package PointAndMoveablePoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint is: (" +
                "x =" + super.getX() +
                ", y =" + super.getY() +
                "), Speed = ("+ xSpeed
                +", "+ ySpeed +")";
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("piont: " + point);

        point = new Point(3.0f, 4.5f);
        System.out.println("point x, y: " + point);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println("movablePoint: " + movablePoint);

        movablePoint = new MovablePoint(3.5f,4.1f);
        System.out.println("movablePoint xSpeed, ySpeed:" + movablePoint);

        movablePoint = new MovablePoint(1.0f,2.0f,3.5f,4.5f);
        System.out.println("movablePoint x, y, xSpeed, ySpeed: " + movablePoint);

        Point[] points = new Point[2];

    }
}
