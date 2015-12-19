package com.epam.composite;

public interface Component {
	int getDeep();

	void setDeep(int value);

	void setParent(Component parent);

	void printValue();
}
