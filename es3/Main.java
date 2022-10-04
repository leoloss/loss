/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es3;

/**
 *
 * @author yurim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayIndexList<String> l = new ArrayIndexList<String>();
        System.out.println("Elementi nella lista: " + l);
        //provo il metodo add
        System.out.println("*** Verifica metodo add ***");
        l.add(0, "el.0");
        System.out.println(l);
        l.add(0, "el.1");
        System.out.println(l);
        l.add(2, "el.2");
        System.out.println(l);
        l.add(2, "el.3");
        System.out.println("Elementi nella lista: " + l);
        //provo il metodo get
        System.out.println("*** Verifica metodo get ***");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(i + ": " + l.get(i));
        }
        //provo il metodo remove
        System.out.println("*** Verifica metodo remove ***");
        System.out.println(l.remove(0) + " dropped!");
        System.out.println(l.remove(0) + " dropped!");
        System.out.println(l.remove(l.size() - 1) + " dropped!");
        System.out.println(l.remove(l.size() - 1) + " dropped!");
        System.out.println("Elementi nella lista: " + l);

        //Ripopolo la lista
        l.add(0, "el.0");
        l.add(0, "el.1");
        l.add(2, "el.2");
        l.add(2, "el.3");
        System.out.println("Elementi nella lista: " + l);
        //provo il metodo set
        System.out.println("*** Verifica metodo set ***");
        System.out.println("Sostituisco: " + l.set(0, "NuovoPrimo"));
        System.out.println("Sostituisco: " + l.set(l.size() - 1, "NuovoUltimo"));
        System.out.println("Elementi nella lista: " + l);
    }
    }
    

