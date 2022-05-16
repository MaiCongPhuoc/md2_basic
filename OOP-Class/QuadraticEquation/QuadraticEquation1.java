package QuadraticEquation;

public class QuadraticEquation1 {
    double a, b, c;

    QuadraticEquation1(double newA, double newB, double newC) {
        this.a = newA;
        this.b = newB;
        this.c = newC;
    }

    double getDiscriminant() {
        double delta;
        return delta = this.b * this.b - (4 * this.a * this.c);
    }
    double getRoot1() {
        double r1;
        return r1 = (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }
    double getRoot2() {
        double r2;
        return r2 = (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }
    double getdoubleSolution() {
        double x;
        return x = (- this.b) / 2 * this.a;
    }
}
