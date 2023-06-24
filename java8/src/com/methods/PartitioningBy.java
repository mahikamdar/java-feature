package com.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {

	public static void main(String[] args) {
		List<BlogPost> list =	getList();
		//prepare separate list of likes less than 50 and vice-versa
		Map<Boolean, List<BlogPost>> part = list.stream().collect(Collectors.partitioningBy(x->x.likes<50));
		System.out.println(part);
		//
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
