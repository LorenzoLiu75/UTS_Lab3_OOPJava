import java.lang.Math;
public class Fisika extends Matematika {

    private static final double k = 9 * Math.pow(10,9);
    private double q1, q2, r;

    // Constructor overloading
    public Fisika(double q1, double q2, double r) {
        super();
        this.q1 = q1;
        this.q2 = q2;
        this.r = r;
    }

    // method overriding dari class Matematika
    public double getResult1() {
        double f;

        f = k * this.q1 * this.q2 / Math.pow(r,2);

        return f;
    }
}

