package figures.triangles.special;

import figures.Calculations;
import figures.triangles.Triangles;

public class Equilateral extends Triangles implements Calculations {
    public Equilateral(double a) {
        super(a, a, a);
        setAngleA(60);
        setAngleB(60);
        setAngleC(60);
    }

    public Equilateral(double a, int angleA) {
        super(angleA, angleA, angleA, a);
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
