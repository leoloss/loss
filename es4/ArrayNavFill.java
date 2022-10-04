package Es4;

public class ArrayNavFill<E> extends AbstractNavFill<E> {

    private E arr[];
    private int indice;

    public ArrayNavFill(int dim) {
        arr = (E[]) new Object[dim];
    }

    @Override
    public int elementsCount() {
        int elementi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                elementi++;
            }
        }
        return elementi;
    }

    @Override
    public void moveFirst() throws EmptyConteinerException {
        if (elementsCount() == 0) {
            throw new EmptyConteinerException("l'array è vuoto");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    indice = i;
                    return;
                }
            }
        }

    }

    @Override
    public void moveLast() throws EmptyConteinerException {
        if (elementsCount() == 0) {
            throw new EmptyConteinerException("l'array è vuoto");
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != null) {
                    indice = i;
                    return;
                }
            }
        }
    }
    @Override
    public void addLast(E element) throws EmptyConteinerException {
        if (elementsCount() == 0) {
            arr[0] = element;
            return;
        }
        moveLast();
        if (indice != arr.length - 1) {
            arr[indice + 1] = element;
        }

    }

    @Override
    public void deleteCurrent() throws EmptyConteinerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getCurrentElement() throws EmptyConteinerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void next() throws EmptyConteinerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void previous() throws EmptyConteinerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
