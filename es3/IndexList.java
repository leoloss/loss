package Es3;

public interface IndexList<E> {
//Restituisce il numero di elementi nella lista

    public int size();
//Restituisce true se la lista è vuota

    public boolean isEmpty();
//Inserisce un elemento nella lista all'indice i (se i>=0 && i<size)
//Gli eventuali elementi successivi a i vengono riposizionati all'indice successivo
//se i = size viene aggiunto l'elemento come ultimo della lista
//se i > size || i < 0 viene sollevata un'eccezione

    public void add(int i, E e) throws IndexOutOfBoundsException;
//Restituisce l'elemento della lista con indice i
//se i >= size || i < 0 viene sollevata un'eccezione

    public E get(int i) throws IndexOutOfBoundsException;
//Viene rimosso l'elemento con indice i.
//Gli eventuali elementi successivi vengono riposizionati all'indice precedente
//se i>=size || i < 0 viene sollevata un'eccezione
//restituisce un riferimento all’elemento rimosso

    public E remove(int i) throws IndexOutOfBoundsException;
//Sostituisce l'elemento i-esimo con l'elemento e
//se i>=size || i < 0 viene sollevata un'eccezione
//restituisce un riferimento all’elemento sostituito

    public E set(int i, E e) throws IndexOutOfBoundsException;
}
