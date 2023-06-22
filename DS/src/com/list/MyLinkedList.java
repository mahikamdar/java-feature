package com.list;

public class MyLinkedList {
	static Node head;
	static int i = 0;

	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(500);
		l.printLs();
		l.delete(10);
		 l.printLs();

		l.fiendnthlast(5);
		l.fiendnthlastrecurtion(head, 4);

	}

	static void fiendnthlastrecurtion(Node head, int n) {

		if (head == null) {
			return;

		}

		fiendnthlastrecurtion(head.next, n);

		if (++i == n) {
			System.out.println("Result: " + head.data);
		}

	}

	public void fiendnthlast(int i) {
		Node temp = head;
		int n = 0;
		while (temp != null) {
			n++;
			temp = temp.next;
		}
		temp = head;
		n = n - i;
		while (n > 0) {
			n--;
			temp = temp.next;

		}
		if (n < 0) {
			System.out.println(" OUT OF LIST! wrong value of i : " + i);
		} else {
			System.out.println(temp.data);

		}
	}

	private void delete(int i) {
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			if (temp.data == i) {
				if (prev == null) {
					head = temp.next;
				} else {
					prev.next = temp.next;
				}
			}

			prev = temp;
			temp = temp.next;
		}

	}

	public void printLs() {
		Node temp = head;
		while (temp != null) {
			if (temp.next != null)
				System.out.print(temp.data + ", ");
			else {
				System.out.print(temp.data);
				System.out.println();
			}
			temp = temp.next;
		}

	}

	public void add(int i) {

		Node temp = new Node(i);
		if (head == null)
			head = temp;
		else {
			Node node = head;
			while (node.next != null)
				node = node.next;

			node.next = temp;
		}
	}

}
