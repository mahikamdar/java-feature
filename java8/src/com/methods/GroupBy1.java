package com.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupBy1 {
	public static void main(String[] args) {
		
		List<BlogPost> list =	getList();
	//Getting the likes Maximum or Minimum from Group by type
		
		Comparator<BlogPost> c = (a,b)->{
			return a.likes.compareTo(b.likes);
		};
		
	 Map<BlogPostType, Optional<BlogPost>> max = list.stream().collect(Collectors.groupingBy(x->x.type,Collectors.maxBy(c)));
	 
	 
		//System.out.println(max);
		
		Map<BlogPostType, Optional<BlogPost>> min = list.stream().collect(Collectors.groupingBy(x->x.type,Collectors.minBy(c)));
		 
		 
		System.out.println(min);
//		Map<BlogPostType, Optional<BlogPost>> maxLikesPerPostType = list.stream()
//				  .collect(Collectors.groupingBy(BlogPost::getType,
//						  Collectors.maxBy(Comparator.comparing(BlogPost::getLikes))));
//		
//		System.out.println(maxLikesPerPostType);
		
		

	}

	private static List<BlogPost> getList() {
		
		BlogPost bp = new BlogPost("java 8","mahi",BlogPostType.GUIDE,180);
		BlogPost bp1 = new BlogPost("java 9","durga",BlogPostType.GUIDE,10);
		BlogPost bp2 = new BlogPost("java 10","sadanand",BlogPostType.NEWS,50);
		BlogPost bp3 = new BlogPost("java 11","sadanand",BlogPostType.NEWS,0);
		BlogPost bp4 = new BlogPost("java 8","neeraj",BlogPostType.REVIEW,100);
		BlogPost bp5 = new BlogPost("AWS","neeraj",BlogPostType.REVIEW,180);
		BlogPost bp6 = new BlogPost("java 8 v1","mahi",BlogPostType.REVIEW,2);
		BlogPost bp7 = new BlogPost("java 8 v2","mahi",BlogPostType.NEWS,50);
		BlogPost bp8 = new BlogPost("java 8 v3","mahi",BlogPostType.GUIDE,180);
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
