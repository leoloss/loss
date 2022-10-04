package Es2;

public class Quadrato {

    private Punto p1;
    private Punto p2;
    private Punto p3;
    private Punto p4;

    public Quadrato(Punto p1, Punto p2, Punto p3, Punto p4) {
        this.p1 = new Punto(p1);
        this.p2 = new Punto(p2);
        this.p3 = new Punto(p3);
        this.p4 = new Punto(p4);
    }

    public float Perimetro() {
        float lato1, perimetro;
        lato1 = p1.distP(p2);

        perimetro = lato1 * 4;

        return perimetro;
    }

    public float Area() {
        float lato1, area;

        lato1 = p1.distP(p2);

        area = lato1 * lato1;

        return area;
    }

    public void traslaQuadrato(float X, float Y) {
        p1.trasla(X, Y);
        p2.trasla(X, Y);
        p3.trasla(X, Y);
        p4.trasla(X, Y);
    }

    public String toString() {
        String s = "";

        s = "il punto 1 è in coordinate x:" + p1.getX() + " e in coordinate y : " + p1.getY() + " \n"
                + "il punto 2 è in coordinate x: " + p2.getX() + " e in coordinate y : " + p2.getY() + " \n"
                + "il punto 3 è in coordinate x: " + p3.getX() + " e in coordinate y : " + p3.getY() + " \n"
                + "il punto 4 è in coordinate x: " + p4.getX() + " e in coordinate y : " + p4.getY() + " \n";

        return s;
    }

}
