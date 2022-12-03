package figures.quadrangles.special;

import figures.quadrangles.Quadrangles;

public class Rectangle extends Quadrangles {

    public Rectangle(double a, double b) {
        super(a, b, a, b);
        setAngleA(90);
        setAngleB(90);
        setAngleC(90);
        setAngleD(90);
    }
}
