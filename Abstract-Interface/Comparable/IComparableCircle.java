package Comparable;

public class IComparableCircle extends Circle implements Comparable<IComparableCircle> {
    public IComparableCircle() {

    }

    public IComparableCircle(double radius) {
        super(radius);
    }

    public IComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public int compareTo(IComparableCircle o) {
        if (getRadius() > o.getRadius())
            return 1;
        else if (getRadius() < o.getRadius())
            return - 1;
        else
            return 1;
    }
}