package taeyun.submit11;

import java.util.Scanner;

public class DiskMain {

	public static void main(String[] args) {

		VideoDB videoDB = VideoDB.getInstance();
		MemberDB memberDB = MemberDB.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⣾⣷⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⡄⠀⠀⠀⠀⣿⣷⠀⠀⠀⣠⣾⣿⣿⣶⡀⣾⣿⡄⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⡀⠀⢀⠀⠀⠀⡀⠀⠀⠀⡀⠀⢉⠁⠀⠀⢀⣀⣿⣿⠀⣀⠀⣿⣿⣅⡸⣿⡗⣿⣿⡇⠀⢀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⣿⣿⣠⣾⣿⠇⣾⣿⠐⣿⣷⡀⣼⣿⣆⢀⣾⡿⢰⣿⣷⢠⣾⣿⣿⣿⣿⢸⣿⡇⢘⡿⣿⣿⣷⡄⣿⣿⣇⣴⣿⡿⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⣿⣿⣿⣿⣧⡀⣿⣿⠀⠘⣿⣿⣿⢿⣿⣿⣿⠃⢸⣿⣿⢿⣿⣇⣨⣿⡿⢸⣿⡇⣿⣿⣄⣼⣿⡟⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠻⠟⠁⠙⠿⠇⠻⠿⠀⠀⠘⠿⠏⠀⠻⠿⠃⠀⠘⠿⠏⠈⠛⠿⠿⠟⠁⠘⠿⠃⠈⠻⠿⠿⠛⠁⠻⠿⠋⠙⠿⠟⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		
		outer: while(true) {
			System.out.println("1. 로그인 | 2. 아이디 찾기 | 3. 비밀번호 찾기 | 4. 회원가입 | 5. 종료");
			System.out.print(">>>");
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				// 로그인 
				System.out.println("아이디를 입력해주세요.");
				System.out.print(">>> ");
				String id = scan.nextLine();
				
				System.out.println("비밀번호를 입력해주세요.");
				System.out.print(">>> ");
				String pw = scan.nextLine();
				
				Member login = memberDB.login(id, pw);
				if(login != null) {
					System.out.println(login.getName() + "님 환영합니다.");
					// TODO 드라마 영화 고르기, 추천 영화나 드라마
					inner: while(true) {
						System.out.println("시청할 장르를 선택해주세요.");
						System.out.println("1. 영화 | 2. 드라마 | 3. 로그아웃");
						System.out.print(">>> ");
						int select = Integer.parseInt(scan.nextLine());
						
						if(select == 1) {
							System.out.println("영화를 선택하셨습니다.");
							System.out.println("1. 영화 목록 보기 및 시청하기 | 2. 랜덤 추천 영화 보기 | 3. 장르 선택 돌아가기");
							System.out.print(">>> "); 
							int choice = Integer.parseInt(scan.nextLine());
							
							if(choice == 1) {
								videoDB.showMvList();
								
								System.out.println("시청할 영화의 번호를 선택해주세요");
								System.out.print(">>> ");
								int num = Integer.parseInt(scan.nextLine());
								
								videoDB.watchMv(num);
							} else if(choice == 2) {
								// 중복 제거
								videoDB.recommandMv();
								
								
							} else if(choice == 3) {
								continue inner;
							} 
							
						} else if(select == 2){
							System.out.println("드라마를 선택하셨습니다.");
							System.out.println("1. 드라마 목록 보기 및 시청하기 | 2. 랜덤 추천 드라마 보기 | 3. 장르 선택 돌아가기");
							System.out.print(">>> "); 
							int choice = Integer.parseInt(scan.nextLine());
							if(choice == 1) {
								videoDB.showDrList();
								
								System.out.println("시청할 드라마의 번호를 선택해주세요");
								System.out.print(">>> ");
								int num = Integer.parseInt(scan.nextLine());
								
								videoDB.watchDr(num);
							} else if(choice == 2) {
								videoDB.recommandDr();
								
							} else if(choice == 3) {
								continue inner;
							} 
						} else {
							continue outer;
						}
					}
					
				} else {
					System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
				}
				
			} else if(command == 2) {
				// 아이디 찾기
				System.out.println("이름을 입력해주세요.");
				System.out.println(">>> ");
				String name = scan.nextLine();
				
				
				System.out.println("본인인증을 위해 생년월일을 입력해주세요.");
				System.out.println("YYMMDD ex) 230410");
				System.out.print(">>> ");
				int birth = Integer.parseInt(scan.nextLine());
				
				memberDB.findId(name, birth);
				
			} else if(command == 3) {
				// 비밀번호 재설정
				System.out.println("비밀번호를 찾을 아이디를 입력해주세요.");
				System.out.println(">>> ");
				String id = scan.nextLine();
				
				System.out.println("본인 인증을 위해 생년월일을 입력해주세요.");
				System.out.println("YYMMDD ex) 230410");
				System.out.print(">>> ");
				int birth = Integer.parseInt(scan.nextLine());
				
				memberDB.resetPw(id, birth);
				
			} else if(command == 4) {
				// 회원가입 
				System.out.println("이름를 입력해주세요.");
				System.out.print(">>> ");
				String name = scan.nextLine();
				
				System.out.println("아이디를 입력해주세요.");
				System.out.print(">>> ");
				String id = scan.nextLine();
				
				System.out.println("비밀번호를 입력해주세요.");
				System.out.print(">>> ");
				String pw = scan.nextLine();
				
				System.out.println("생년월일 입력해주세요.");
				System.out.println("YYMMDD ex) 230410");
				System.out.print(">>> ");
				int birth = Integer.parseInt(scan.nextLine());
				
				Member mem = new Member(name, id, pw, birth);
				memberDB.registMember(mem);
			} else {
				System.out.println("정말 종료하시겠습니까?");
				System.out.println("종료하시려면 Y 또는 quit을 입력해주세요(대소문자 구분 없음)");
				System.out.print(">>>");
				String input = scan.nextLine();
				
				if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("quit")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			
			
			
		}
	}
	
}
