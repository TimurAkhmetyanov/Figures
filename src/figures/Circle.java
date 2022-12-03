package figures;

import static java.lang.Math.PI;

public class Circle extends Figures{
    private final int r;

    {
        n = 1;
    }

    public Circle(int r) {
        this.r = r;
        setS(PI * r * r);
        setP(2 * PI * r);
    }

    @Override
    public double getS() {
        return super.getS();
    }

    @Override
    public double getP() {
        return super.getP();
    }
}
