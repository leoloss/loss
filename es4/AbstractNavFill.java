package Es4;

public abstract class AbstractNavFill<T> implements Fillable<T>, Navigable {

    public String toString() {
        String s = "";

        s = "[";
      //  moveFirst();
        for (int i = 0; i < elementsCount(); i++) {
        //    s += " " + getCurrentElement();
          //  next();
        }
        s += "]";
        return s;

    }

    @Override
 
    public void deleteLast() throws EmptyConteinerException {
        if (elementsCount() == 0) {
            throw new EmptyConteinerException("l'array è vuoto");
        }else{
            moveLast();
            deleteCurrent();
        }
    }
    
}
