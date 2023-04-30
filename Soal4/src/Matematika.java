import java.lang.Math;
public class Matematika {

    private double a,b,c;

    // Inisialisasi Constructor
    public Matematika(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Default Constructor
    public Matematika() {
    }

    public double getDiskriminan() {
        return (Math.pow(this.b,2)) - (4 * this.a * this.c);
    }

    public double getresult1() {
        if (this.getDiskriminan() < 0) {
            return 0;
        } else {
            return (-this.b + Math.sqrt(this.getDiskriminan())) / (2 * this.a);
        }
    }

    public double getresult2() {
        if (this.getDiskriminan() < 0) {
            return 0;
        } else {
            return (-this.b - Math.sqrt(this.getDiskriminan())) / (2 * this.a);
        }
    }
}
