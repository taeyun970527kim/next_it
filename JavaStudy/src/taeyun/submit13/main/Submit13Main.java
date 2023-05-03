package taeyun.submit13.main;

import java.util.ArrayList;
import java.util.Scanner;

import taeyun.submit13.service.BoardService;
import taeyun.submit13.service.MemberService;
import taeyun.submit13.vo.BoardVO;
import taeyun.submit13.vo.MemberVO;

public class Submit13Main {

	public static void main(String[] args) {
		MemberService memService = MemberService.getInstance();
		BoardService boardService = BoardService.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>> ");
			
			int command = 0;
			
			try {
				command = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}
			
			if(command == 1) {
				// 회원가입
				
				System.out.print("아이디를 입력해주세요: ");
				String id = scan.nextLine();
				
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = scan.nextLine();
				
				memService.registMember(id, pw);
				
			} else if(command == 2) {
				// 로그인
				System.out.print("아이디를 입력해주세요: ");
				String id = scan.nextLine();
				
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = scan.nextLine();
				
				MemberVO member = new MemberVO(id, pw);
				
				MemberVO login = memService.login(member);
				
				if(login.getMemId() != null) {
					// 로그인 성공
					System.out.println("로그인 되었습니다.");
					
					// 글쓰기
					while(true) {
						System.out.println("행동을 선택해주세요.");
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.print(">>> ");
						int select = Integer.parseInt(scan.nextLine());
						
						if(select == 1) {
							// 글쓰기
							System.out.print("글 제목을 입력해주세요: ");
							String title = scan.nextLine();
							
							System.out.print("글 내용을 입력해주세요: ");
							String content = scan.nextLine();
							
							BoardVO board = new BoardVO(title, content, login.getMemId());
							boardService.writeBoard(board);
							
							// 게시글 목록
							ArrayList<BoardVO> boardList = boardService.getBoardList();
							for(int i = 0; i < boardList.size(); i++) {
								System.out.println(boardList.get(i));
							}
							
							
						} else if(select == 2) {
							// 글조회
							System.out.print("글 번호를 입력해주세요:");
							int boardNum = Integer.parseInt(scan.nextLine());
							ArrayList<BoardVO> boardList = boardService.getBoardList();
							
							if(boardNum <= boardList.size()) {
								for(int i = 0; i < boardList.size(); i++) {
									if(boardList.get(i).getBoardNum() == boardNum) {
										System.out.println("\n=========================================\n");
										System.out.println("제목: " + boardList.get(i).getBoardTitle());
										System.out.println("작성자: " + boardList.get(i).getBoardArthor());
										System.out.println("작성일: " + boardList.get(i).getBoardDate());
										System.out.println("글내용: " + boardList.get(i).getBoardContent());
										System.out.println("\n=========================================\n");
									}
								}
								for(int i = 0; i < boardList.size(); i++) {
								System.out.println(boardList.get(i));
								}
							} else {
								System.out.println("입력하신 번호의 게시글이 존재하지 않습니다.");
							}
						} else if(select == 3) {
							// 로그아웃
							System.out.println("로그아웃 하였습니다.");
							break;
						} else {
							System.out.println("다시 입력해주세요.");
						}
						
					}
					
				} else {
					// 로그인 실패
					System.out.println("회원 정보가 올바르지 않습니다.");
				}
			} else if(command == 3) {
				// 종료
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
			
		}
		
		
		
		
		
		
		
	}

}
