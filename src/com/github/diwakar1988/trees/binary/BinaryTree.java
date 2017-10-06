package com.github.diwakar1988.trees.binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.github.diwakar1988.trees.Node;

public abstract class BinaryTree {
	protected Node root;

	public abstract Node add(int data);

	public Node getRoot() {
		return root;
	}

	public boolean isLeafNode(Node node) {
		return node.left == null && node.right == null;
	}

	// BFS example
	public ArrayList<Integer> getLevelOrder() {
		ArrayList<Integer> output = new ArrayList<>();
		if (root != null) {
			Queue<Node> queue = new LinkedList<>();
			queue.add(root);
			while (!queue.isEmpty()) {
				Node node = queue.poll();
				output.add(node.data);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
		}
		return output;
	}

	// DFS example
	public ArrayList<Integer> getInOrder(boolean resursive) {
		ArrayList<Integer> output = new ArrayList<>();
		if (resursive) {
			inorder(root, output);
		} else {
			inorderIterative(root, output);
		}
		return output;
	}

	// LEFT->ROOT->RIGHT
	private void inorderIterative(Node root, ArrayList<Integer> output) {
		// 1) Create an empty stack S.
		// 2) Initialize current node as root
		// 3) Push the current node to S and set current = current->left until
		// current is NULL
		// 4) If current is NULL and stack is not empty then
		//// a) Pop the top item from stack.
		//// b) Print the popped item, set current = popped_item->right
		//// c) Go to step 3.
		// 5) If current is NULL and stack is empty then we are done.

		if (root == null) {
			return;
		} else {
			Stack<Node> stack = new Stack<>();
			Node n = root;
			while (n != null) {
				stack.push(n);
				n = n.left;
			}
			while (!stack.isEmpty()) {
				n = stack.pop();
				output.add(n.data);
				n = n.right;
				while (n != null) {
					stack.push(n);
					n = n.left;
				}
			}
		}
	}

	// LEFT->ROOT->RIGHT
	private void inorder(Node root, ArrayList<Integer> output) {
		if (root == null) {
			return;
		}
		inorder(root.left, output);
		output.add(root.data);
		inorder(root.right, output);
	}

	// DFS example
	public ArrayList<Integer> getPreOrder(boolean resursive) {
		ArrayList<Integer> output = new ArrayList<>();
		if (resursive) {
			preOrder(root, output);
		} else {
			preOrderIterative(root, output);
		}
		return output;
	}

	// ROOT->LEFT->RIGHT
	private void preOrderIterative(Node root, ArrayList<Integer> output) {
		// 1) Create an empty stack S.
		// 2) Initialize current node as root
		// 3) iterate while stack is not empty and do follwing
		//// a) Pop the top item from stack.
		//// b) Print the popped item,
		//// c) Push root->right
		//// d) Push root->left

		if (root == null) {
			return;
		} else {
			Stack<Node> stack = new Stack<>();
			stack.push(root);
			while (!stack.isEmpty()) {
				Node n = stack.pop();
				output.add(n.data);
				if (n.right != null) {
					stack.push(n.right);
				}
				if (n.left != null) {
					stack.push(n.left);
				}
			}
		}
	}

	// ROOT->LEFT->RIGHT
	private void preOrder(Node root, ArrayList<Integer> output) {
		if (root == null) {
			return;
		}
		output.add(root.data);
		preOrder(root.left, output);
		preOrder(root.right, output);
	}

	// DFS example
	public ArrayList<Integer> getPostOrder(boolean resursive) {
		ArrayList<Integer> output = new ArrayList<>();
		if (resursive) {
			postOrder(root, output);
		} else {
			postOrderIterative(root, output);
		}
		return output;
	}

	// LEFT->RIGHT-->ROOT
	private void postOrderIterative(Node root, ArrayList<Integer> output) {
		Node current = root;
		Stack<Node> stack = new Stack<>();
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				Node temp = stack.peek().right;
				if (temp == null) {
					temp = stack.pop();
					output.add(temp.data);
					while (!stack.isEmpty() && stack.peek().right == temp) {
						temp = stack.pop();
						output.add(temp.data);
					}
				} else {
					current = temp;
				}
			}
		}
	}

	// LEFT->RIGHT-->ROOT
	private void postOrder(Node root, ArrayList<Integer> output) {
		if (root == null) {
			return;
		}
		postOrder(root.left, output);
		postOrder(root.right, output);
		output.add(root.data);
	}
}
