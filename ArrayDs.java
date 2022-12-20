package assignments;

import java.util.Arrays;

public class ArrayDs<T> {
	Object[] data;
	int size;

	public ArrayDs() {
		size = 0;
		data = new Object[1];
	}

	public int getSize() {
		return data.length;
	}

	public T get(int index) {
		return (T) data[index];
	}

	public void insert(Object element) {
		// ensure capacity
		ensureCapacity(size + 1);
		data[size++] = element;
	}

	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			// when someone delete any element
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;

			data = Arrays.copyOf(data, newCapacity);
		}

	}

	public void display() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}

}
