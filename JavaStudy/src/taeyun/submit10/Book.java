package taeyun.submit10;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
	private int no;
	private String title;
	private boolean rental = false;
	
	
		
	public Book() {}
	

	
	

	public Book(int no, String title, boolean rental) {
		super();
		this.no = no;
		this.title = title;
		this.rental = rental;
	}


	
	@Override
	public String toString() {
//		if(this.rental) {
//		return "[책번호: " + no + ", 책 제목: " + title + ", 대여상태: 대여중]";
//		} else {
//			return "[책번호: " + no + ", 책 제목: " + title + ", 대여상태: 입고중]";
//		}
		String rent = (rental) ? ("대여중") : ("입고중");
		return "[책번호: " + no + ", 책 제목: " + title + ", 대여상태: " + rent +  "]";
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isRental() {
		return rental;
	}


	public void setRantal(boolean rental) {
		this.rental = rental;
	}
	
	
	
	
	
	
}
