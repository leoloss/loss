package Es2;

import java.util.*;

public class Cerchio {

    private float raggio;
    private Punto centro;
    private float PI = 3.14f;

    public Cerchio(float raggio, Punto centro) {
        this.raggio = raggio;
        this.centro = new Punto(centro);
    }

    public float Circonferenza() {
        float circonferenza;

        circonferenza = 2 * PI * raggio;

        return circonferenza;
    }

    public float Area() {
        float area;

        area = (float) (PI * Math.pow(raggio, 2));

        return area;
    }
    
    public void traslaCerchio(float X, float Y){
        centro.trasla(X, Y);
    }
    
    public String toString(){
        String s="";
        
        s="il centro ha coordinate x: " +centro.getX()+ "y: " +centro.getY()+ " di raggio: " +raggio;
        
        return s;
    } 

}
