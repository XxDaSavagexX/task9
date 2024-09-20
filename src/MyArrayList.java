import java.util.Arrays;

public class MyArrayList {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(Object value) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size++] = value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }
}
