package Es2;

public class Punto {

    private float x;
    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;

    }

    public Punto() {
        this(0,0);
    }
    
     public Punto(Punto p1) {
        x = p1.x;
        y = p1.y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void trasla(float X, float Y) {
        this.x+=X;
        this.y+=Y;
    }

    public float distP(Punto p) {
        float distX;
        float distY;
        float distP;

        distX = p.getX() - this.x;
        distY = p.getY() - this.y;
        distP = (float) Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));

        return distP;
    }
    
    @Override
    public String toString() {
        String s;
        s = "(" + x + " ; " + y + ")";

        return s;
    }
}
