package Es4;

public class Main {
    
    public static void main(String[] args) throws EmptyConteinerException {
        ArrayNavFill<String> anf = new ArrayNavFill<>(10);
        
        ArrayNavFill<Integer> anf1 = new ArrayNavFill<>(10);
        
        anf.addLast("Ciao");
        anf.addLast("Mondo");
        
        System.out.println(anf.elementsCount());
        
        
        
        
    }
    
}
