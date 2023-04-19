package taeyun.submit12;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Board board = Board.getInstance();
		ArrayList<Board> boardList = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.print(">>> ");
			int num = Integer.parseInt(scan.nextLine());
			
			if(num == 1) {
				// 글 목록
				for(int i = 0; i < boardList.size(); i++) {
					System.out.print(boardList.get(i)+ "\n");
				}
				
			} else if(num == 2) {
				// 글 쓰기
				System.out.print("글 제목을 입력해주세요: ");
				String title = scan.nextLine();
				System.out.print("글 내용을 입력해주세요: ");
				String content = scan.nextLine();
				
				boardList.add(new Board(boardList.size() + 1, title, content, ""));
				
			} else {
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
	} 
	
}
