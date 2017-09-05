package com.github.diwakar1988.trees;

import com.github.diwakar1988.trees.binary.BinarySearchTree;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Start...");
//		System.out.println("End...");
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(15);
		tree.add(16);
		tree.add(20);
		tree.add(10);
		tree.add(13);
		tree.add(25);
		tree.add(5);
		
		System.out.println(tree.getPreOrder(true));
		
	}

}
