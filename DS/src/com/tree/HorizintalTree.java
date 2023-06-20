package com.tree;

public class HorizintalTree {

	static Node root;
	public static void main(String[] args) {
		HorizintalTree t=new HorizintalTree();
		t.root=new Node(1);
		t.root.left=new Node(2);
		t.root.right=new Node(3);
		t.root.left.left=new Node(4);
		t.root.left.right=new Node(5);
		t.root.right.left=new Node(6);
		t.root.right.right=new Node(7);
		t.printlevel();
	}
	private void printlevel() {
		int h=hight(root);
		for(int i=1;i<=h;i++) {
			printlevel(root, i);
		}
		
	}
	private int hight(Node root) {
		{
	        if (root == null)
	            return 0;
	        else {
	             
	           
	            int lheight = hight(root.left);
	            int rheight = hight(root.right);
	 
	           
	            if (lheight > rheight)
	                return (lheight + 1);
	            else
	                return (rheight + 1);
	        }
		}
	}
	private void printlevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printlevel(root.left, level - 1);
            printlevel(root.right, level - 1);
        }
		
	

}
}
