package Es1;

public class Pennarello {
   
    public String colore;
    public int livello;

    public Pennarello(String colore) {
        this.colore = colore;
        this.livello = 0;
        
    }
    
    public String colora(){
        String s;
        if(this.livello== 100){
            s="";
        }else{
            this.livello+=1;
            s="il pennarello di colore " +colore+ " è stato usato per l'1%";
        }
       
        return s;
    }
    
    @Override
    public String toString(){
        String s;
        if(this.livello == 100){
            s="Pennarello di colore: " +colore+ " – TERMINATO";
        }else{
            s="Pennarello di colore: " +colore+ " – Stato di usura: " +this.livello+ "%";
        }
        
        return s;
    }
    
    public Boolean terminato(){
        Boolean c=false;
        
        if(this.livello == 100){
            c=true;
        }
        return c;
    }   
    
    public Pennarello sostituisciSeTerminato(String colore){
            if(this.livello <= 90){
                return this;
            }else{
               return new Pennarello(colore);
            }
    }
}
  
