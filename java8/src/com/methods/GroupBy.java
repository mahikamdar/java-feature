package com.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupBy {
	public static void main(String[] args) {
		List<BlogPost> list =	getList();
		
		//get mahi blogs   Collector<Map<K,List()>>   groupingBy(Function)
//		Map<String, List<BlogPost>> map = list.stream().filter(y->y.author=="mahi").collect(Collectors.groupingBy(x->x.author));
//		    System.out.println(map);
		    
		    // List of BlogPosts first by author and then by type:   Collector<Map<K,List()>>   groupingBy(Function,Collector)
		    Map<String, Map<BlogPostType, List<BlogPost>>> collect = list.stream()
		    		.collect(Collectors.groupingBy(x->x.author,Collectors.groupingBy(x->x.type)));
		  //  System.out.println(collect);
		    //Or
//		 Map<String, Map<BlogPostType, List<BlogPost>>> collect = list.stream()
//		    		  .collect(Collectors.groupingBy(BlogPost::getAuthor, Collectors.groupingBy(BlogPost::getType)));
//		 System.out.println(collect);
		    
		    //group by author and then type and then likes
		     Map<String, Map<BlogPostType, Map<Integer, List<BlogPost>>>> collect2 = list.stream()
		    		.collect(Collectors.groupingBy(x->x.author,
		    				Collectors.groupingBy(x->x.type,Collectors.groupingBy(x->x.likes))));
		    // System.out.println(collect2);
		     
		   Stream.of(collect2).flatMap(y->Stream.of(y)).flatMap(z->Stream.of(z)).forEach(w->System.out.println(w));
		   
		   
		   
		   
	}
	
private static List<BlogPost> getList() {
		
		BlogPost bp = new BlogPost("java 8","mahi",BlogPostType.GUIDE,100);
		BlogPost bp1 = new BlogPost("java 9","durga",BlogPostType.GUIDE,10);
		BlogPost bp2 = new BlogPost("java 10","sadanand",BlogPostType.NEWS,50);
		BlogPost bp3 = new BlogPost("java 11","sadanand",BlogPostType.NEWS,0);
		BlogPost bp4 = new BlogPost("java 8","neeraj",BlogPostType.REVIEW,100);
		BlogPost bp5 = new BlogPost("AWS","neeraj",BlogPostType.REVIEW,180);
		BlogPost bp6 = new BlogPost("java 8 v1","mahi",BlogPostType.REVIEW,2);
		BlogPost bp7 = new BlogPost("java 8 v2","mahi",BlogPostType.NEWS,50);
		BlogPost bp8 = new BlogPost("java 8 v3","mahi",BlogPostType.GUIDE,100);
		BlogPost bp9 = new BlogPost("JS","sadanand",BlogPostType.NEWS,50);
		BlogPost bp10 = new BlogPost("CSS","sadanand",BlogPostType.NEWS,0);
		BlogPost bp11 = new BlogPost("Git","neeraj",BlogPostType.REVIEW,100);
		BlogPost bp12 = new BlogPost("HTML","neeraj",BlogPostType.REVIEW,180);
		BlogPost bp13 = new BlogPost("Data Structure","mahi",BlogPostType.REVIEW,2);
		BlogPost bp14 = new BlogPost("LLD","mahi",BlogPostType.NEWS,50);
		BlogPost bp15 = new BlogPost("HLD","mahi",BlogPostType.GUIDE,100);
		
		List<BlogPost> list = Arrays.asList(bp,bp1,bp2,bp3,bp4,bp5,bp6,bp7,bp8,bp9,bp10,bp11,bp12,bp13,bp14,bp15);
		return list;
	}
}
