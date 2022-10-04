package Es2;

public class Main {
    public static void main(String[] args) {
        Punto p = new Punto(1, 1);
        Punto p2 = new Punto(3, 2);
        Punto p3 = new Punto(3, 3);
        Punto p4 = new Punto(2, 3);
        Punto centro = new Punto(0, 0);
        p.trasla(1, 1);
        
        Quadrato q = new Quadrato(p, p2, p3, p4);
        
        System.out.println(q.Perimetro());
        System.out.println(q.Area());
        System.out.println(q.toString());
        
        
        System.out.println(p.toString());
        
        Cerchio c = new Cerchio(1,centro);
        
        System.out.println(c.Area());
        System.out.println(c.Circonferenza());
        System.out.println(c.toString());
        
        
        
    }
    
}
