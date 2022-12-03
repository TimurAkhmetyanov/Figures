package figures;

import static java.lang.Math.PI;

public class Ellipse extends Figures {
    private final int a, b;

    public Ellipse(int a, int b) {
        this.a = a;
        this.b = b;
        setS(PI * a * b);
        setS(4 * (PI * a * b + (a - b)) / (a + b));
    }

    @Override
    public double getP() {
        return super.getP();
    }

    @Override
    public double getS() {
        return super.getS();
    }
}
