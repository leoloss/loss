package Es4;


public interface Navigable<T> {

    T getCurrentElement() throws EmptyConteinerException;

    void moveFirst() throws EmptyConteinerException;

    void moveLast() throws EmptyConteinerException;

    void next() throws EmptyConteinerException;

    void previous() throws EmptyConteinerException;

    int elementsCount();
}
