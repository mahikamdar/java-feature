package com.tree;

public class Baundarytree {
	Node root;
	public static void main(String[] args) {
		
		Baundarytree bt= new Baundarytree();
		bt.root=new Node(10);
		
		bt.root.left=new Node(20);
		bt.root.left.left=new Node(30);
		bt.root.left.right=new Node(40);
		bt.root.left.right.left=new Node(50);
		bt.root.left.right.right=new Node(60);
		
		bt.root.left=new Node(70);
		bt.root.left.left=new Node(80);
		
		bt.printbaundery();
		
		
		
	}
	private void printbaundery() {
		if(root==null) {
			return;
		}
		 printbaundery();
	}

}
