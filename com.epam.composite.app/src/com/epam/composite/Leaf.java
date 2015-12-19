package com.epam.composite;

public class Leaf implements Component {
	private int value;
	private int deep;
	private Component parent;

	public Leaf(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void printValue() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < this.deep; i++) {
			sb.append(" - ");
		}
		System.out.println(sb.toString()  + "deep " + this.deep + "   value(leaf) "
				+ this.value);

	}

	@Override
	public void setParent(Component parent) {
		this.parent = parent;
	}

	@Override
	public int getDeep() {
		return this.deep;
	}

	@Override
	public void setDeep(int deep) {
		this.deep = deep;

	}

}
