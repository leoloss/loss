
package Es1;

public class UsaPennarelli {

    public static void main(String[] args) throws Exception {
        
        Pennarello p = new Pennarello("verde");
        
        //usa il pennarello dell'1%
        System.out.println(p.colora());
        
        //da le informazioni su quanto è usato un determinato pennarello
        System.out.println(p.toString());
        
        
        //ritorna true se il pennarello è terminato
        System.out.println(p.terminato());
        
        
        //sostituisce il pennarello se la sua usura è maggiore di 90%
        p=p.sostituisciSeTerminato("giallo");
        
         System.out.println(p.toString());
        
        
    }
    
}
