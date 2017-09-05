package com.github.diwakar1988.trees.binary;

import com.github.diwakar1988.trees.Node;

public class BinarySearchTree extends BinaryTree{

	@Override
	public Node add(int data) {
		Node node = add(root, data);
		if (root == null) {
			root = node;
		}
		return node;
	}

	private Node add(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		} else if (data <= root.data) {
			root.left = add(root.left, data);
		} else {
			root.right = add(root.right, data);
		}
		return root;
	}

}
