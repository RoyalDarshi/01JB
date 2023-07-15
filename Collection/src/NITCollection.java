public class NITCollection {
	private Object[] elementData;
	private int elementCount;

	public NITCollection() {
		// TODO Auto-generated constructor stub
		elementData = new Object[10];
	}

	public int size() {
		return elementCount;
	}

	public int capacity() {
		return elementData.length;
	}

	public void remove(int index) {
		checkIndex(index);
		for (; index < elementCount - 1; index++) {
			elementData[index] = elementData[index + 1];
		}
		elementData[elementCount] = null;
		elementCount--;
	}

	public void checkIndex(int index) {
		if (index < 0 || index > elementCount - 1) {
			throw new IndexOutOfBoundsException(index);
		}
	}

	private void grow() {
		Object[] nextArray = new Object[capacity() * 2];
		for (int i = 0; i < elementCount; i++) {
			nextArray[i] = elementData[i];
		}
		elementData = nextArray;
	}

	public void add(Object obj) {
		if (size() == capacity()) {
			grow();
		}
		elementData[elementCount] = obj;
		elementCount++;
	}

	public void add(Object obj, int index) {
		checkIndex(index);
		for (int i = elementCount - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = obj;
		elementCount++;
	}

	public void replace(Object obj, int index) {
		checkIndex(index);
		elementData[index] = obj;
	}

	public int indexOf(Object obj) {
		if (obj == null) {
			for (int index = 0; index < elementData.length; index++) {
				if (elementData[index] == null) {
					return index;
				}
			}
			return -1;
		}
		for (int index = 0; index < elementData.length; index++) {
			if (obj.equals(elementData[index])) {
				return index;
			}
		}
		return -1;
	}

	public int lastIndexOf(Object obj) {
		if (obj == null) {
			for (int index = elementData.length - 1; index >= 0; index--) {
				if (elementData[index] == null) {
					return index;
				}
			}
			return -1;
		}
		for (int index = elementCount - 1; index >= 0; index--) {
			if (obj.equals(elementData[index])) {
				return index;
			}
		}
		return -1;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < elementCount; i++) {
			builder.append(elementData[i]);
			builder.append(", ");
		}
		int start = builder.lastIndexOf(", ");
		if (start != -1) {
			int end = start + 2;
			builder.delete(start, end);
		}
		builder.append("]");
		return builder.toString();
	}
}
