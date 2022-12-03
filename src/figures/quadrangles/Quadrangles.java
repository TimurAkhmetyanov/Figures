package figures.quadrangles;

import figures.Calculations;
import figures.Figures;

public class Quadrangles extends Figures implements Calculations {
    private double a, b, c, d;
    private int angleA, angleB, angleC, angleD;

    public Quadrangles(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public int getAngleA() {
        return angleA;
    }

    public void setAngleA(int angleA) {
        this.angleA = angleA;
    }

    public int getAngleB() {
        return angleB;
    }

    public void setAngleB(int angleB) {
        this.angleB = angleB;
    }

    public int getAngleC() {
        return angleC;
    }

    public void setAngleC(int angleC) {
        this.angleC = angleC;
    }

    public int getAngleD() {
        return angleD;
    }

    public void setAngleD(int angleD) {
        this.angleD = angleD;
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

    @Override
    public void square() {

    }

    @Override
    public void perimeter() {

    }
}
