package com.epam.composite;

public class Node implements Component {

	private int value;
	private int deep;
	private Component leftChild;
	private Component rightChild;
	private Component parent;

	public Node(int value) {
		this.value = value;

		if (parent == null) {
			this.deep = 0;
		} else {
			this.deep = parent.getDeep() + 1;
		}

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Component getLeftChild() {
		return leftChild;
	}

	public void addLeftChild(Component leftChild) {
		leftChild.setParent(this);
		leftChild.setDeep(this.deep + 1);
		this.leftChild = leftChild;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public Component getRightChild() {
		return rightChild;
	}

	public void addRightChild(Component rightChild) {
		rightChild.setParent(this);
		rightChild.setDeep(this.deep + 1);
		this.rightChild = rightChild;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	@Override
	public void printValue() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < this.deep; i++) {
			sb.append(" - ");
		}
		System.out.println(sb.toString()  + "deep " + this.deep + "   value(node) "
				+ this.value);

		if (this.leftChild != null) {
			System.out.println(sb.toString()  + "left value: ");
			this.leftChild.printValue();
		}

		if (this.rightChild != null) {
			System.out.println(sb.toString()  + "right value: ");
			this.rightChild.printValue();
		}
	}

	public void setParent(Component parent) {
		this.parent = parent;
	}

	public int getDeep() {
		return deep;
	}

	public void setDeep(int deep) {
		this.deep = deep;
	}
}
