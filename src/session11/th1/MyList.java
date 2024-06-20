package session11.th1;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object [] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements, newSize);

    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i]).append(", ");
        }
        sb.append(elements[size - 1]).append("]");
        return sb.toString();
    }
}
