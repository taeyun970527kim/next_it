package taeyun.submit11;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberDB {

	private ArrayList<Member> memList = new ArrayList<>();
	
	private MemberDB() {
		memList.add(new Member("관리자", "admin", "admin0123", 1));
		memList.add(new Member("김태윤", "taeyun", "1234", 970527));
	}
	
	private static MemberDB instance = new MemberDB();
	
	public static MemberDB getInstance() {
		return instance;
	}
	
	
	Scanner scan = new Scanner(System.in);
	
	// 로그인 메소드
	public Member login(String id, String pw) {
		for(int i = 0; i < memList.size(); i++) {
			if(memList.get(i).getId().equals(id) && memList.get(i).getPassword().equals(pw)) {
				 return (memList.get(i));
			}
		} return null;
	}
	
	
	// 아이디 찾기 메소드
	public void findId(String name, int birth) {
		for(int i = 0; i < memList.size(); i++) {
			if(memList.get(i).getName().equals(name) && memList.get(i).getBirth() == birth) {
				System.out.println(name + "님의 아이디는 " + memList.get(i).getId() + "입니다.");
				return;
			}
		} System.out.println("존재하지 않는 이름이거나 입력하신 생년월일이 일치하지 않습니다.");
	}
	
	// 비밀번호 재설정 메소드
	public void resetPw(String id, int birth) {
		for(int i = 0; i < memList.size(); i++) {
			if(memList.get(i).getId().equals(id) && memList.get(i).getBirth() == birth) {
				System.out.println("새 비밀번호를 입력해주세요.");
				System.out.print(">>> ");
				String newPw = scan.nextLine();
				
				System.out.println("새 비밀번호를 다시 입력해주세요.");
				System.out.print(">>> ");
				String renewPw = scan.nextLine();
				

				if(newPw.equals(renewPw)) {
					memList.get(i).setPassword(renewPw);
					System.out.println("비밀번호가 재설정되었습니다.");
					return;
				} System.out.println("입력하신 재설정 비밀번호가 일치하지 않습니다.");
				return;
			}
		} System.out.println("존재하지 않는 아이디이거나 입력하신 생년월일이 일치하지 않습니다.");
	}
	
	
	// 회원가입 메소드 
	public void registMember(Member mem) {
		for(int i = 0; i < memList.size(); i++) {
			if(mem.getId().equals(memList.get(i).getId())) {
				System.out.println("중복된 아이디 입니다.");
				return;
			}
		}
		memList.add(mem);
		System.out.println(mem.getName()+ "님 환영합니다");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠟⠛⠛⠛⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠙⠛⠛⠻⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⢠⡀⢰⡄⢰⠀⢸⠋⠁⢸⡆⠀⢰⠋⠳⠀⡞⠙⡆⢰⡆⠀⣴⠀⣴⠶⠄⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⢧⣼⢷⣼⠀⢸⠖⠀⠀⡇⠀⢸⠀⠀⠀⡇⢰⡇⢸⢻⡾⣿⠀⣿⠄⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠋⠉⠁⠹⡆⠀⠀⠀⠘⣿⠈⡿⠀⠸⣤⡄⠀⠧⠤⠘⠦⠞⠀⠣⠼⠃⠸⠀⠁⡏⢰⣇⠀⠀⠀⠀⢠⠟⠉⠉⠙⠛⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣧⣀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣠⣤⣀⣀⣀⣀⣀⣀⣀⣀⠀⠉⠁⠀⠀⠀⠘⠀⠀⠀⠀⠀⠀⣀⣬⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⣀⣠⣤⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣤⣤⣀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
				"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("로그인 이후 다양한 컨텐츠들을 만나보세요~");
	}
	
}
