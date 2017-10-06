package com.github.diwakar1988.trees;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.github.diwakar1988.trees.binary.BinarySearchTree;
import com.github.diwakar1988.trees.binary.BinaryTree;

public class BinaryTreeTest {

	@Test
	public void testLevelOrderTraversal() {
		BinaryTree tree = new BinarySearchTree();
		tree.add(15);
		tree.add(16);
		tree.add(20);
		tree.add(10);
		tree.add(13);
		tree.add(25);
		tree.add(5);
		
		final ArrayList<Integer> OUTPUT = new ArrayList<>();
		OUTPUT.add(15);
		OUTPUT.add(10);
		OUTPUT.add(16);
		OUTPUT.add(5);
		OUTPUT.add(13);
		OUTPUT.add(20);
		OUTPUT.add(25);

		ArrayList<Integer> list = tree.getLevelOrder();
		Assert.assertTrue(list.equals(OUTPUT));
		
	}

	@Test
	public void testInOrderRecursive() {
		BinaryTree tree = new BinarySearchTree();
		tree.add(15);
		tree.add(16);
		tree.add(20);
		tree.add(10);
		tree.add(13);
		tree.add(25);
		tree.add(5);
		
		final ArrayList<Integer> OUTPUT = new ArrayList<>();
		OUTPUT.add(5);
		OUTPUT.add(10);
		OUTPUT.add(13);
		OUTPUT.add(15);
		OUTPUT.add(16);
		OUTPUT.add(20);
		OUTPUT.add(25);

		ArrayList<Integer> list = tree.getInOrder(true);
		Assert.assertTrue(list.equals(OUTPUT));
		
	}

	@Test
	public void testInOrderIterative() {
		BinaryTree tree = new BinarySearchTree();
		tree.add(15);
		tree.add(16);
		tree.add(20);
		tree.add(10);
		tree.add(13);
		tree.add(25);
		tree.add(5);
		
		final ArrayList<Integer> OUTPUT = new ArrayList<>();
		OUTPUT.add(5);
		OUTPUT.add(10);
		OUTPUT.add(13);
		OUTPUT.add(15);
		OUTPUT.add(16);
		OUTPUT.add(20);
		OUTPUT.add(25);

		ArrayList<Integer> list = tree.getInOrder(false);
		Assert.assertTrue(list.equals(OUTPUT));
		
	}


	@Test
	public void testPreOrderRecursive() {
		BinaryTree tree = new BinarySearchTree();
		tree.add(15);
		tree.add(16);
		tree.add(20);
		tree.add(10);
		tree.add(13);
		tree.add(25);
		tree.add(5);
		
		//[15, 10, 5, 13, 16, 20, 25]
		final ArrayList<Integer> OUTPUT = new ArrayList<>();
		OUTPUT.add(15);
		OUTPUT.add(10);
		OUTPUT.add(5);
		OUTPUT.add(13);
		OUTPUT.add(16);
		OUTPUT.add(20);
		OUTPUT.add(25);

		ArrayList<Integer> list = tree.getPreOrder(true);
		Assert.assertTrue(list.equals(OUTPUT));
		
	}

	@Test
	public void testPreOrderIterative() {
		BinaryTree tree = new BinarySearchTree();
		tree.add(15);
		tree.add(16);
		tree.add(20);
		tree.add(10);
		tree.add(13);
		tree.add(25);
		tree.add(5);
		
		final ArrayList<Integer> OUTPUT = new ArrayList<>();
		OUTPUT.add(15);
		OUTPUT.add(10);
		OUTPUT.add(5);
		OUTPUT.add(13);
		OUTPUT.add(16);
		OUTPUT.add(20);
		OUTPUT.add(25);

		ArrayList<Integer> list = tree.getPreOrder(false);
		Assert.assertEquals(OUTPUT,list);
		
	}

	@Test
	public void testPostOrderRecursive() {
		BinaryTree tree = new BinarySearchTree();
		tree.add(15);
		tree.add(16);
		tree.add(20);
		tree.add(10);
		tree.add(13);
		tree.add(25);
		tree.add(5);
		
		//[5, 13, 10, 25, 20, 16, 15]
		final ArrayList<Integer> OUTPUT = new ArrayList<>();
		OUTPUT.add(5);
		OUTPUT.add(13);
		OUTPUT.add(10);
		OUTPUT.add(25);
		OUTPUT.add(20);
		OUTPUT.add(16);
		OUTPUT.add(15);

		ArrayList<Integer> list = tree.getPostOrder(true);
		Assert.assertTrue(list.equals(OUTPUT));
		
	}
	
	@Test
	public void testPostOrderIterative() {
		BinaryTree tree = new BinarySearchTree();
		tree.add(15);
		tree.add(16);
		tree.add(20);
		tree.add(10);
		tree.add(13);
		tree.add(25);
		tree.add(5);
		
		//[5, 13, 10, 25, 20, 16, 15]
		final ArrayList<Integer> OUTPUT = new ArrayList<>();
		OUTPUT.add(5);
		OUTPUT.add(13);
		OUTPUT.add(10);
		OUTPUT.add(25);
		OUTPUT.add(20);
		OUTPUT.add(16);
		OUTPUT.add(15);

		ArrayList<Integer> list = tree.getPostOrder(false);
		Assert.assertTrue(list.equals(OUTPUT));
		
	}
}
