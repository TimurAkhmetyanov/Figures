package figures.quadrangles.special;

import figures.quadrangles.Quadrangles;

public class Square extends Quadrangles {
    public Square(double a) {
        super(a, a, a, a);
        setAngleA(90);
        setAngleB(90);
        setAngleC(90);
        setAngleD(90);
    }
}
