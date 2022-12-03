package figures.triangles;

import figures.Calculations;
import figures.Figures;

import static java.lang.Math.PI;
import static java.lang.Math.sin;

public class Triangles extends Figures implements Calculations {
    private double a, b, c, ha, hb, hc;
    private int angleA, angleB, angleC;

    public Triangles(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        setP(a + b + c);
        double p = getP() / 2;
        setS(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public Triangles(int angleA, int angleB, int angleC, double a) {
        if (angleA + angleB + angleC == 180 || angleA > 0 && angleB > 0 && angleC > 0) {
            this.angleA = angleA;
            this.angleB = angleB;
            this.angleC = angleC;
            this.a = a;
            this.b = (a * sin(angleB * PI) / 180) / sin(angleA * PI / 180);
            this.c = (a * sin(angleC * PI) / 180) / sin(angleA * PI / 180);
            setP(a + b + c);
            double p = getP() / 2;
            setS(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        }
        else{
            this.a = a;
            System.out.println("Треугольник не может существовать с такими углами");
        }
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

    public double getHa() {
        return ha;
    }

    public void setHa(double ha) {
        this.ha = ha;
    }

    public double getHb() {
        return hb;
    }

    public void setHb(double hb) {
        this.hb = hb;
    }

    public double getHc() {
        return hc;
    }

    public void setHc(double hc) {
        this.hc = hc;
    }

    public double getAngleA() {
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
