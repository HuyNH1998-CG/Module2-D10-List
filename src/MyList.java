import java.util.Arrays;

public class MyList<E> implements Cloneable {
    private int size = 0;
    private static final int defaultCapacity = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[defaultCapacity];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        if (elements.length - 1 - index >= 0)
            System.arraycopy(elements, index, elements, index + 1, elements.length - 1 - index);
        elements[index] = element;
    }

    public E remove(int index) {
        for (; index < elements.length - 1; index++) {
            elements[index] = elements[index + 1];
        }
        return (E) elements;
    }

    public int size() {
        return this.size;
    }

    public E clone() throws CloneNotSupportedException {
        return (E) super.clone();
    }

    public boolean contains(Object o) {
        for (Object element : elements) {
            if (element == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("indexL " + i + ", size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        elements = new Object[defaultCapacity];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
