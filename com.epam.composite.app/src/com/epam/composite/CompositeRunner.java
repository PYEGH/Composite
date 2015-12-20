package com.epam.composite;

public class CompositeRunner {

	/**
	 * Method simulates filling and printing of binary tree
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Tree nodes
		Component root = new Node(15);
		Component node0 = new Node(0);
		Component node10 = new Node(10);
		Component node11 = new Node(11);
		Component node20 = new Node(20);
		Component node21 = new Node(21);

		root.add(root, node0);
		root.add(root, node10);
		root.add(root, node11);
		root.add(root, node20);
		root.add(root, node21);

		// print binary tree
		System.out.println("binary tree:");
		root.printValue();
	}

}
