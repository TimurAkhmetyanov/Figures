package figures.triangles.special;

import figures.Calculations;
import figures.triangles.Triangles;

public class Isosceles extends Triangles implements Calculations {
    public Isosceles(double a, double b) {
        super(a, b, b);
    }

    public Isosceles(int angleA, int angleB, int angleC, int a) {
        super(angleA, angleB, angleC, a);
    }

    @Override
    public double getP() {
        return super.getP();
    }

    @Override
    public void setP(double p) {
        super.setP(p);
    }

    @Override
    public double getS() {
        return super.getS();
    }

    @Override
    public void setS(double s) {
        super.setS(s);
    }
}
