package com.list;

public class FindLastNthNode {
	 static Node head;
	 static int i=0;
	public static void main(String[] args) {
		MyLinkedList ml=new MyLinkedList();
		ml.add(10);
		ml.add(20);
		ml.add(30);
		ml.add(40);
		ml.add(50);
		ml.add(60);
		ml.printLs();
		FindLastNthNode.lastnthelement(MyLinkedList.head,4);
	}
	public static void lastnthelement(Node head,int n) {
		
		if(head==null) {
			return;
		
		}
		//System.out.println("Result: "+head.data);
		lastnthelement (head.next,n);
		
		if(++i==n) {
			System.out.println("Result: "+head.data);
		}
		
	}

}
