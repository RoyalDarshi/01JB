
public class TableCollection {
	private Object[] elementkeyData;
	private Object[] elementvalueData;
	private int elementCount;

	public TableCollection() {
		// TODO Auto-generated constructor stub
		elementkeyData = new Object[10];
		elementvalueData = new Object[10];
	}

	public int size() {
		return elementCount;
	}

	public int capacity() {
		return elementkeyData.length;
	}

	public void grow() {
		Object[] nextKey = new Object[capacity() * 2];
		Object[] nextValue = new Object[capacity() * 2];
		for (int i = 0; i < nextValue.length; i++) {
			nextKey[i] = elementkeyData[i];
			nextValue[i] = elementvalueData[i];
		}
		elementkeyData = nextKey;
		elementvalueData = nextValue;
	}

	public void add(Object key, Object value) {
		if (size() == capacity()) {
			grow();
		}
		elementkeyData[elementCount] = key;
		elementvalueData[elementCount] = value;
		elementCount++;
	}

	public Object remove(Object obj) {
		if (obj == null) {
			for (int i = 0; i < elementCount; i++) {
				if (elementvalueData == null) {
					elementvalueData[i] = elementvalueData[i + 1];
					elementkeyData[i] = elementkeyData[i + 1];
					return obj;
				}
			}
			return false;
		} else {
			for (int i = 0; i < elementCount; i++) {
				if (obj.equals(elementvalueData)) {
					elementvalueData[i] = elementvalueData[i + 1];
					elementkeyData[i] = elementkeyData[i + 1];
					return obj;
				}
			}
			return false;
		}
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("{");
		for (int i = 0; i < elementCount; i++) {
			builder.append(elementkeyData[i]);
			builder.append("=");
			builder.append(elementvalueData[i]);
			builder.append(", ");
		}
		int start = builder.lastIndexOf(", ");
		if (start > 0) {
			builder.delete(start, start + 2);
		}
		builder.append("}");
		return builder.toString();
	}

}
