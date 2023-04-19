package taeyun.submit10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		
		Library library = Library.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 책 입고 | 2. 책 대여 | 3. 책 목록 | 4. 책 검색 | 5. 종료");
			System.out.print(">>> ");
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				// 책 입고
				System.out.println("책 번호를 입력해주세요");
				System.out.print(">>> ");
				int no = Integer.parseInt(scan.nextLine());	
				
				library.returnBook(no);
			} else if(command == 2) {
//				// 책 대여
//				System.out.println("책 번호를 입력해주세요");
//				System.out.print(">>> ");
//				int no = Integer.parseInt(scan.nextLine());
//				
//				library.rentalBook(no);
				
				// @
				System.out.println("책 이름을 입력해주세요: ");
				System.out.print(">>> ");
				String name = scan.nextLine();
				
				// name 을 포함하는 book 객체들을 찾아서 가져오기 
				
				ArrayList<Book> searchList = library.searchBookList(name);
				
				if(searchList.size() == 0) {
					System.out.println("해당 책이 존재하지 않습니다");
				} else if(searchList.size() == 1) {
					library.rentalBook(searchList.get(0).getNo());
				} else {
					library.searchBookTitle(name);
					System.out.println("책 번호를 입력해주세요");
					System.out.print(">>> ");
					
					int no = Integer.parseInt(scan.nextLine());
					
					library.rentalBook(no);
				}
					
			} else if(command == 3) {
				// 책 목록
				library.showBookList();
				
			} else if(command == 4) {
				// TODO 책 검색
				System.out.print("책 이름을 입력해주세요: ");
				String searchTitle = scan.nextLine();
				
				library.searchBookTitle(searchTitle);
			} else {
				// 종료
				System.out.println("종료");
				break;
			}
		} 
		
	}


}
