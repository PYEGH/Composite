package com.epam.composite;

public class Node implements Component {

	private int value;
	private int deep;
	private Component leftChild, rightChild;

	public Node(int value) {
		this.value = value;
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

	public Component add(Component root, Component x) {
		if (root == null) {
			Component temp = new Node(x.getValue());
			temp.setValue(x.getValue());
			temp.setDeep(0);
			return temp;
		}

		if (root.getValue() < x.getValue()) {
			Component temp = add(root.getRightChild(), x);
			temp.setDeep(root.getDeep() + 1);
			root.setRightChild(temp);
		}
		if (root.getValue() > x.getValue()) {
			Component temp = add(root.getLeftChild(), x);
			temp.setDeep(root.getDeep() + 1);
			root.setLeftChild(temp);
		}
		return root;
	}

	public Component getRightChild() {
		return rightChild;
	}

	/**
	 * Comment to version2: At first version comment about StringBuilder and
	 * StringBuffer was added. The difference between SBuilder and SBuffer is
	 * that SBuffer is threadsafety and SBuilder not. At our app there just one
	 * thread so that is why it is better to use SBuilder, because it is faster
	 * than StringBuffer. So at our situation SBuilder is more preferable.
	 */
	@Override
	public void printValue() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.deep; i++) {
			sb.append(" - ");
		}
		System.out.println(sb.toString() + "deep " + this.deep
				+ "   value(node) " + this.value);

		if (this.leftChild != null) {
			System.out.println(sb.toString() + "left value: ");
			this.leftChild.printValue();
		}

		if (this.rightChild != null) {
			System.out.println(sb.toString() + "right value: ");
			this.rightChild.printValue();
		}
	}

	@Override
	public void setLeftChild(Component component) {
		this.leftChild = component;

	}

	@Override
	public void setRightChild(Component component) {
		this.rightChild = component;

	}

	public int getDeep() {
		return deep;
	}

	public void setDeep(int deep) {
		this.deep = deep;
	}
}
