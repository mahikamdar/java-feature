package com.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerEx {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> b = (x,y)->System.out.println(x+y);
	//	b.accept(10, 20);
		
		//check list is equal or not
		
		 // Create the first list
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(1);
        lista.add(2);      
 
        // Create the second list
        List<Integer> listb = new ArrayList<Integer>();
        listb.add(2);
        listb.add(1);
        listb.add(2);
        
        BiConsumer<List<Integer>,List<Integer>> bc =
        		(l1,l2)->{
        			
        			if(l1.size()!= l2.size()) {
        				System.out.println("false");
        				return;
        				}
        			else {
        				for(int i =0; i<l1.size();i++) {
        					if(!l1.get(i).equals(l2.get(i))) {
        						System.out.println("false");
                				return;	
        					}
        				}
        				System.out.println("true");
        				return;
        				
        			}
        		
        			
        		};
        		
        		
        		bc.accept(lista, listb);
        		
        		
	}
}
