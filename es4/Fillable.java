package Es4;

public interface Fillable<T> {

    public void addLast(T element) throws EmptyConteinerException;

    public void deleteLast() throws EmptyConteinerException;

    public void deleteCurrent() throws EmptyConteinerException;

    public int elementsCount();
}
