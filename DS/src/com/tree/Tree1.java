package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree1 {
	Node root;
public static void main(String[] args) {

	Tree1 t=new Tree1();
	t.root=new Node(1);
	t.root.left=new Node(2);
	t.root.right=new Node(3);
	t.root.left.left=new Node(4);
	t.root.left.right=new Node(5);
	t.root.right.left=new Node(6);
	t.root.right.right=new Node(7);
	t.printtree(t.root);
	System.out.print("-->  \n");
	t.printsimoletree(t.root);
	

	
}


private void printsimoletree(Node root) {
	
	if(root==null) {return;}
	
	System.out.print(+root.data+"  ");
	
	if(root.left!=null ) {
		printsimoletree(root.left);
	}
	if(root.right!=null) {
		printsimoletree(root.right);
	}


}

















private void printtree(Node root2) {
	if(root==null) {
		return;
	}
	Stack<Node> currentLevel=new Stack<>();
	Stack<Node> nextLevel=new Stack<>();
	currentLevel.push(root);
	boolean flag=true;
	while(!currentLevel.isEmpty()) {
		Node node=currentLevel.pop();
		System.out.print(node.data+",  ");
		if(flag) {
			if(node.left!=null)nextLevel.add(node.left);
			if(node.right!=null)nextLevel.add(node.right);
		}else {
			if(node.right!=null)nextLevel.add(node.right);
			if(node.left!=null)nextLevel.add(node.left);
		}
		if(currentLevel.isEmpty()) {
			flag =!flag;
			Stack<Node> temp=currentLevel;
			currentLevel=nextLevel;
			nextLevel=temp;
		}
	}
	
	
}

}
