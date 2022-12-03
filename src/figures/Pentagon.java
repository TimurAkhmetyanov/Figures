package figures;

import static java.lang.Math.PI;
import static java.lang.Math.tan;
//import static java.lang.Math.ct;

public class Pentagon extends Figures {
    private double a, b, c, d, e;

    {
        n = 5;
    }

    public Pentagon(double a, double b, double c, double d, double e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        setP(a + b + c + d + e);
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

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
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
    public double getP() {
        return super.getP();
    }

    @Override
    public void setP(double p) {
        super.setP(p);
    }
}

class RightPentagon extends Pentagon implements Calculations{

    {
        n = 5;
    }

    public RightPentagon(double a, double b, double c, double d, double e) {
        super(a, a, a, a, a);
    }

    @Override
    public void square() {
        setS((n/4) * getA() * getA() * (1 / tan(PI / n)));
    }

    @Override
    public void perimeter() {
        setP(getA() * 5);
    }
}
