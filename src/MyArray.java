import java.util.Arrays;

public class MyArray<E> {
    E e;
    private Object[] array = new Object[0];
    private int size = 0;

    public Object get(int index) {
        return array[index];
    }

    public void add(E arr) {
        if (size == array.length)
            maxSize();
        array[size++] = arr;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void maxSize() {
        Object[] te = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            te[i] = array[i];
        }
        array = te;
    }

}
