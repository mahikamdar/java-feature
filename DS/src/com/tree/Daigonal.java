package com.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Daigonal {
 static Node root;
	public static void main(String[] args) {
		Daigonal d=new Daigonal();
		d.root=new Node(1);
		d.root.left=new Node(2);
		d.root.right=new Node(3);
		d.root.left.left=new Node(4);
		d.root.left.right=new Node(5);
		d.root.right.left=new Node(6);
		d.root.right.right=new Node(7);
		diagnoalPrint(root);
	}
	public static void diagnoalPrint(Node root) {
		TreeMap<Integer, List<Integer>> map=new TreeMap<>();
		
		int hd=0;
		
		printrightroot(root, hd, map);
		System.out.println(map);
		
		
		
	}
	public static  void printrightroot(Node root2, int hd, TreeMap<Integer, List<Integer>> map) {
		if(root==null)return;
		List<Integer> l=null;
		if(!map.containsKey(hd)) {
			l=new ArrayList<Integer>();
			l.add(root.data);
			map.put(hd, l);
		}else {
			map.get(hd).add(root.data);
		}
		printrightroot(root.left,hd,map);
		printrightroot(root.right,hd+1,map);
	}

}
