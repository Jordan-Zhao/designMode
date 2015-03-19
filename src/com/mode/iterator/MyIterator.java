package com.mode.iterator;

public class MyIterator implements Iterator {
	private IList list;
	private int pos = -1;

	public MyIterator(IList list) {
		this.list = list;
	}

	public Object pre() {
		if (pos > 0) {
			pos--;
		}
		return list.get(pos);
	}

	public Object next() {
		if (pos < (list.size() - 1)) {
			pos++;
		}
		return list.get(pos);
	}

	public boolean hasNext() {
		if (pos < list.size() - 1) {
			return true;
		} else {
			return false;
		}
	}
}
