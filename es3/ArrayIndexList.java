package Es3;

import java.lang.reflect.Array;

public class ArrayIndexList<T> implements IndexList<T> {

    private T[] Array;
    private int size;

    public ArrayIndexList() {
        Array = (T[]) new Object[3];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        Boolean c = false;
        if (size == 0) {
            c = true;
        }
        return c;
    }

    @Override
    public void add(int i, T e) throws IndexOutOfBoundsException {
        int pos;
        if (i >= 0 && i < size) {
            if (Array[i] == null) {
                Array[i] = e;
                size++;
            } else {
                pos = i;
                if (size == Array.length) {
                    Array = redim(Array, Array.length * 2);
                }
                while (Array[i] != null) {
                    i++;
                }
                
                while (i != pos) {
                    Array[i] = Array[i - 1];
                    i--;
                }
                Array[pos] = e;
                size++;
            }
        } else if (i == size) {
            Array[size] = e;
            size++;
        } else {
            throw new IndexOutOfBoundsException("i non valida");
        }

    }

    @Override
    public T get(int i) throws IndexOutOfBoundsException {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("i non valida");
        }
        return Array[i];
    }

    @Override
    public T remove(int i) throws IndexOutOfBoundsException {
        T salva;
        if (i >= 0 && i < size) {
            salva = Array[i];
            while (i < size - 1) {
                Array[i] = Array[i + 1];
                i++;
            }
            Array[size - 1] = null;
            size--;
        } else {
            throw new IndexOutOfBoundsException("i non valida");
        }
        return salva;
    }

    @Override
    public T set(int i, T e) throws IndexOutOfBoundsException {
        T salva;
        if (i >= 0 && i < size) {
            salva = Array[i];
            Array[i]= e;
        } else {
            throw new IndexOutOfBoundsException("i non valida");
        }
        return salva;
    }

    private T[] redim(T[] v, int newPhisicalSize) {
        T[] tmp = (T[]) new Object[newPhisicalSize];
        int maxLen = (v.length < newPhisicalSize) ? v.length : newPhisicalSize;
        for (int i = 0; i < maxLen; i++) {
            tmp[i] = v[i];
        }
        return tmp;
    }
    
    public String toString (){
        String s = "";
        
        s="[" ;
        for(int i =0; i<size; i++){
            s+=" "+Array[i];
        }
        s+="]";
        
        return s;
    }

}
