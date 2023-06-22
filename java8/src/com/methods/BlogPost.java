package com.methods;

import java.util.Objects;

public class BlogPost {

	 String title;
	    String author;
	    BlogPostType type;
	    Integer likes;
		public BlogPost(String title, String author, BlogPostType type, Integer likes) {
			super();
			this.title = title;
			this.author = author;
			this.type = type;
			this.likes = likes;
		}
		@Override
		public int hashCode() {
			return Objects.hash(author, likes, title, type);
		}

		@Override
		public String toString() {
			return "BlogPost [title=" + title + ", author=" + author + ", type=" + type + ", likes=" + likes + "]";
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public BlogPostType getType() {
			return type;
		}
		public void setType(BlogPostType type) {
			this.type = type;
		}
		public Integer getLikes() {
			return likes;
		}
		public void setLikes(Integer likes) {
			this.likes = likes;
		}

		
}
