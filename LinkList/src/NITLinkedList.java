public class NITLinkedList {
	private Node first;
	private Node last;
	private int size;

	public boolean add(Object obj) {
		if (last == null) {
			Node node = new Node(null, obj, null);
			first = node;
			last = node;
			size++;
			return true;
		} else {
			Node node = new Node(last, obj, null);
			last.next = node;
			last = node;
			size++;
			return true;
		}
	}

	public boolean remove(Object obj) {
		if (obj == null) {
			for (Node node = first; node != null; node = node.next) {
				if (node.item == null) {
					if (node.prev == null) {
						first = node.next;
						node.next.prev = null;
					} else if (node.next == null) {
						last = node.prev;
						node.prev.next = null;
					} else {
						node.prev.next = node.next;
						node.next.prev = node.prev;
					}
					node.next = null;
					node.prev = null;
					size--;
					return true;
				}
			}
			return false;
		} else {
			for (Node node = first; node != null; node = node.next) {
				if (obj.equals(node.item)) {
					if (node.prev == null) {
						first = node.next;
						node.next.prev = null;
					} else if (node.next == null) {
						last = node.prev;
						node.prev.next = null;
					} else {
						node.prev.next = node.next;
						node.next.prev = node.prev;
					}
					node.next = null;
					node.prev = null;
					size--;
					return true;
				}
			}
			return false;
		}
	}

	public boolean contain(Object obj) {
		if (obj == null) {
			for (Node node = first; node.next != null; node = node.next) {
				if (node.item == null) {
					return true;
				}
			}
			return false;
		} else {
			for (Node node = first; node.next != null; node = node.next) {
				if (obj.equals(node.item)) {
					return true;
				}
			}
			return false;
		}
	}

	public Object replace(Object oldObj, Object newObj) {
		if (oldObj == null) {
			for (Node node = first; node != null; node = node.next) {
				if (node.item == null) {
					node.item = newObj;
					return oldObj;
				}
			}
			return false;
		} else {
			for (Node node = first; node != null; node = node.next) {
				if (oldObj.equals(node.item)) {
					node.item = newObj;
					return oldObj;
				}
			}
			return false;
		}
	}

	public int size() {
		return size;
	}

	public int indexOf(Object obj) {
		int index = 0;
		if (obj == null) {
			for (Node node = first; node != null; node = node.next) {
				if (node.item == null)
					return index;
				index++;
			}
			return -1;
		} else {
			for (Node node = first; node != null; node = node.next) {
				if (node.item.equals(obj))
					return index;
				index++;
			}
			return -1;
		}
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (Node node = first; node != null; node = node.next) {
			builder.append(node.item);
			builder.append(", ");
		}
		int start = builder.lastIndexOf(", ");
		if (start != -1) {
			builder.delete(start, start + 2);
		}
		builder.append("]");
		return builder.toString();
	}

	public class Node {
		private Node prev;
		private Node next;
		private Object item;

		public Node(Node prev, Object item, Node next) {
			// TODO Auto-generated constructor stub
			this.prev = prev;
			this.item = item;
			this.next = next;
		}
	}

}
