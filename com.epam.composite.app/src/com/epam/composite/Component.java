package com.epam.composite;

public interface Component {
	void printValue();

	int getValue();

	void setValue(int value);

	void setLeftChild(Component component);

	void setRightChild(Component component);

	int getDeep();

	void setDeep(int deep);

	Component getLeftChild();

	Component getRightChild();

	Component add(Component root, Component component);

}
