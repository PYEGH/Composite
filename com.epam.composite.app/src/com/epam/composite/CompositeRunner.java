package com.epam.composite;

public class CompositeRunner {

	/**
	 * Method simulates filling and printing of binary tree
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Tree leaves
		Leaf leaf20 = new Leaf(20);
		Leaf leaf21 = new Leaf(21);
		Leaf leaf31 = new Leaf(31);
		Leaf leaf32 = new Leaf(32);

		// Tree nodes
		Node node0 = new Node(0);
		Node node10 = new Node(10);
		Node node11 = new Node(11);
		Node node20 = new Node(20);
		Node node21 = new Node(21);

		// Tree filling
		node0.addLeftChild(node10);
		node0.addRightChild(node11);

		node10.addLeftChild(node20);
		node10.addRightChild(node21);

		node11.addLeftChild(leaf20);
		node11.addRightChild(leaf21);

		node20.addLeftChild(leaf31);
		node21.addRightChild(leaf32);

		// print binary tree
		System.out.println("binary tree:");
		node0.printValue();

		// print binary tree after removing of right child from top node(top
		// node means deep=0)
		System.out
				.println("\n\nbinary tree(right child were removed at top element):");
		node0.removeRightChild();
		node0.printValue();

	}

}
