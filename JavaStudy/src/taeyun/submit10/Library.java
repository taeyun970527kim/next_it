package taeyun.submit10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Library {

	private ArrayList<Book> bookList = new ArrayList<>();
	
	private Library() {
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
		String[] books = strBooks.split(",");
		for(int i = 0; i < books.length; i++) {
			bookList.add(new Book(bookList.size()+1, books[i].trim(), false));
		}
	}
	
	private static Library instance = new Library(); 
	
	public static Library getInstance() {
		return instance;
	}
	
	// 책 목록 메소드
	public void showBookList() {
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	
	// 책 대여 메소드
	public void rentalBook(int num) {
		for(int i = 0; i < bookList.size(); i++) {
			if(num == bookList.get(i).getNo()) {
				System.out.println(bookList.get(i).getTitle() + "을(를) 대여하셨습니다.");
				bookList.get(i).setRantal(true);
				}
			}
		}
	
	// 책 입고 메소드
	public void returnBook(int num) {
		for(int i = 0; i < bookList.size(); i++) {
			if(num == bookList.get(i).getNo()) {
				System.out.println(bookList.get(i).getTitle() + "을(를) 입고되었습니다.");
				bookList.get(i).setRantal(false);
				}
			}
		}
	
	// 책 이름 검색 메소드
	public void searchBookTitle(String name) {
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(name)) {
				System.out.println(bookList.get(i));
			}
		}
	}
	
	// @ 책 검색 + 검색된 책 목록 리턴
	public ArrayList<Book> searchBookList(String keyword) {
		ArrayList<Book> result = new ArrayList<>();
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				result.add(bookList.get(i));
				
			}
		}
		return result;
	}
	
	
	
	
	// @ 
//	Scanner scan = new Scanner(System.in);
//	public void rentBook(String title) {
//		ArrayList<Book> temp = new ArrayList<>();
//		for(int i = 0; i < bookList.size(); i++) {
//			if(bookList.get(i).getTitle().contains(title)) {
//				temp.add(bookList.get(i));
//				if(temp.size() > 1) {
//					System.out.println(bookList.get(i));
//					System.out.print("도서 번호를 입력해주세요: ");
//					int bookNum = Integer.parseInt(scan.nextLine());
//					if(bookNum == bookList.get(i).getNo()) {
//						System.out.println(bookList.get(i).getTitle() + "을(를) 대여하셨습니다.");
//						bookList.get(i).setRantal(true);
//					}
//				} else {
//					System.out.println(bookList.get(i).getTitle().contains(title) + "을(를) 대여하셨습니다.");
//				}
//			}
//		}
//	}
	
	
}
