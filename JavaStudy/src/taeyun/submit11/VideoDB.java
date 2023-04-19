package taeyun.submit11;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoDB {

	private ArrayList<Video> mvList = new ArrayList<>();
	private ArrayList<Video> drList = new ArrayList<>();
	
	private VideoDB() {
		String video = "영화: 길복순, 영화: 스위치, 영화: 코드8, 영화: 킹덤, 영화: 헝거, 영화: 옆집사람,영화: 머더 미스터리, 영화: 내 친구 추파카브라, 영화: 티켓 파라다이스, 영화: 압꾸정, 영화: 독전, 영화: 맨 인 블랙 인터내셔널, 영화: 레지던트 이블, 영화: 새벽의 저주, 영화: 승리호, 영화: 터널, 영화: 모범시민, 영화: 익스펜더블, 영화: 공조2 인터내셔널, 영화: 레드 노티스, 영화: 데시벨, 영화: 코어, 영화: catch me if you can, 영화: 쥬라기공원, 영화: 루시, 영화: 한산, 영화: 스파이더맨 노 웨이 홈, 영화: 크리미널 스쿼드, 영화: 수어사이드 스쿼드, 영화: 버드박스, 영화: 원티드, 영화: 킬러의 보디가드, 영화: 베놈2, 영화: 지아이조, 영화: 야차, 영화: 스마트폰을 떨어뜨렸을 뿐인데, 영화: 쥬라기월드, 영화: 기생충, 영화: 사냥의 시간, 드라마: 성난 사람들, 드라마: 환혼, 드라마: 철인왕후, 드라마: 재벌집 막내아들, 드라마: 더글로리, 드라마: 신성한 이혼, 드라마: 지정생존자, 드라마: 대행사, 드라마: 경이로운 소문, 드라마: 시지프스, 드라마: 슬기로운 의사생활, 드라마: 도깨비, 드라마: 사랑의 불시착, 드라마: 이태원 클라쓰, 드라마: 미씽, 드라마: 굿 걸스, 드라마: 루시퍼, 드라마: 위쳐, 드라마: 왕이 된 남자, 드라마: 왕의 남자, 드라마: 결혼백서, 드라마: 악의 꽃, 드라마: DP, 드라마: 사생활, 드라마: 삼국지, 드라마: 소년심판, 드라마: 유성화원, 드라마: 비밀의 숲, 드라마: 시그널, 드라마: 슈룹, 드라마: 장야, 드라마: THE K2, 드라마: 모범형사, 드라마: 아는 와이프, 드라마: 나의 해방일지, 드라마: 빈센조, 드라마: 화유기, 드라마: 오징어게임, 드라마: 인사이더, 드라마: 검사내전";
		String[] videosplit = video.split(",");
		for(int i = 0; i < videosplit.length; i++) {
			if(videosplit[i].contains("영화")) {
				String[] temp = videosplit[i].split(":");
				mvList.add(new Video(i+1, temp[0].trim(), temp[1].trim()));
			} else {
				String[] temp2 = videosplit[i].split(":");
				drList.add(new Video(((i+1)-mvList.size()), temp2[0].trim(), temp2[1].trim()));
				}
			}
		}
	
	private static VideoDB instance = new VideoDB(); 
	
	public static VideoDB getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	
	// 영화 리스트
	public void showMvList() {
		for(int i = 0; i < mvList.size(); i+= 3) {
			int end = Math.min(i + 3, mvList.size());
			System.out.println(mvList.subList(i, end));
		}
		
	}
	
	// 드라마 리스트
	public void showDrList() {
		for(int i = 0; i < drList.size(); i+= 3) {
			int end = (i + 3) <= drList.size() ? (i + 3) : (drList.size());
			System.out.println(drList.subList(i, end));
		}
	}
	
	// 영화 시청 메소드
	public void watchMv(int num) {
		for(int i = 0; i < mvList.size(); i++) {
			if(mvList.get(i).getNum() == num) {
				System.out.println(mvList.get(i).getTitle() + "을(를) 재생하시겠습니까?");
				System.out.println("재생하시려면 \"예\" 혹은 Y를 대소문자 구분 없이 입력해주세요");
				System.out.print(">>> ");
				String answer = scan.nextLine();
				
				if(answer.equalsIgnoreCase("예") || answer.equalsIgnoreCase("y")) {
					System.out.println(mvList.get(i).getTitle() + "을(를) 재생합니다");
					System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
							"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
							"⠀⠀⠀⠀⠀⠀⠀⣀⣴⣾⣿⣿⣿⣿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀\n" + 
							"⠀⠀⠀⠀⠀⢠⣾⣿⠟⠋⢁⠀⠀⠈⠙⠻⣿⣷⡄⠀⠀⠀⠀⠀\n" + 
							"⠀⠀⠀⠀⠀⣾⣿⠃⢠⣿⣿⣿⣶⣤⣀⠀⠘⣿⣷⠀⠀⠀⠀⠀\n" + 
							"⠀⠀⠀⠀⢸⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⡆⠀⢸⣿⡇⠀⠀⠀⠀\n" + 
							"⠀⠀⠀⠀⠈⣿⣷⡀⢸⣿⣿⣿⣿⠟⠋⠁⠀⣼⣿⠁⠀⠀⠀⠀\n" + 
							"⠀⠀⠀⠀⠀⠸⣿⣷⣄⠙⠛⠋⠁⠀⠀⣠⣾⣿⠇⠀⠀⠀⠀⠀\n" + 
							"⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣶⣶⣶⣶⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀\n" + 
							"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
							"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
					break;
				}
			}
		}
	}
	
	// 드라마 시청 메소드
	public void watchDr(int num) {
		for(int i = 0; i < drList.size(); i++) {
			if(drList.get(i).getNum() == num) {
				System.out.println(drList.get(i).getTitle() + "을(를) 재생하시겠습니까?");
				System.out.println("재생하시려면 \"예\" 혹은 Y를 대소문자 구분 없이 입력해주세요");
				System.out.print(">>> ");
				String answer = scan.nextLine();
				
					if(answer.equalsIgnoreCase("예") || answer.equalsIgnoreCase("y")) {
						System.out.println(drList.get(i).getTitle() + "을(를) 재생합니다");
						System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
								"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
								"⠀⠀⠀⠀⠀⠀⠀⣀⣴⣾⣿⣿⣿⣿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀\n" + 
								"⠀⠀⠀⠀⠀⢠⣾⣿⠟⠋⢁⠀⠀⠈⠙⠻⣿⣷⡄⠀⠀⠀⠀⠀\n" + 
								"⠀⠀⠀⠀⠀⣾⣿⠃⢠⣿⣿⣿⣶⣤⣀⠀⠘⣿⣷⠀⠀⠀⠀⠀\n" + 
								"⠀⠀⠀⠀⢸⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⡆⠀⢸⣿⡇⠀⠀⠀⠀\n" + 
								"⠀⠀⠀⠀⠈⣿⣷⡀⢸⣿⣿⣿⣿⠟⠋⠁⠀⣼⣿⠁⠀⠀⠀⠀\n" + 
								"⠀⠀⠀⠀⠀⠸⣿⣷⣄⠙⠛⠋⠁⠀⠀⣠⣾⣿⠇⠀⠀⠀⠀⠀\n" + 
								"⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣶⣶⣶⣶⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀\n" + 
								"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
								"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
						break;
				}
			}
		}
	}
	
	// 랜덤 영화 추천 메소드
	public void recommandMv() {
		for(int i = 0; i < 1; i++) {
			int random = (int)(Math.random() * mvList.size());
			Video temp = mvList.get(random);
			System.out.println("오늘의 추천 영화는 " + temp.getTitle() + " 입니다.");
	
			System.out.println("추천 받은 영화를 시청하시겠습니까?");
			System.out.println("시청하시려면 \"예\" 혹은 Y를 대소문자 구분 없이 입력해주세요");
			System.out.print(">>> ");
			String answer = scan.nextLine();
			if(answer.equalsIgnoreCase("예") || answer.equalsIgnoreCase("y")) {
				System.out.println(temp.getTitle() + "을(를) 재생합니다");
				System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠀⠀⣀⣴⣾⣿⣿⣿⣿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⢠⣾⣿⠟⠋⢁⠀⠀⠈⠙⠻⣿⣷⡄⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⣾⣿⠃⢠⣿⣿⣿⣶⣤⣀⠀⠘⣿⣷⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⢸⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⡆⠀⢸⣿⡇⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠈⣿⣷⡀⢸⣿⣿⣿⣿⠟⠋⠁⠀⣼⣿⠁⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠸⣿⣷⣄⠙⠛⠋⠁⠀⠀⣠⣾⣿⠇⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣶⣶⣶⣶⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
				break;
			} 
			
		}
	}
	
	// 랜덤 드라마 추천 메소드
	public void recommandDr() {
		for(int i = 0; i < 1; i++) {
			int random = (int)(Math.random() * drList.size());
			Video temp = drList.get(random);
			System.out.println("오늘의 추천 영화는 " + temp.getTitle() + " 입니다.");
	
			System.out.println("추천 받은 영화를 시청하시겠습니까?");
			System.out.println("시청하시려면 \"예\" 혹은 Y를 대소문자 구분 없이 입력해주세요");
			System.out.print(">>> ");
			String answer = scan.nextLine();
			if(answer.equalsIgnoreCase("예") || answer.equalsIgnoreCase("y")) {
				System.out.println(temp.getTitle() + "을(를) 재생합니다");
				System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠀⠀⣀⣴⣾⣿⣿⣿⣿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⢠⣾⣿⠟⠋⢁⠀⠀⠈⠙⠻⣿⣷⡄⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⣾⣿⠃⢠⣿⣿⣿⣶⣤⣀⠀⠘⣿⣷⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⢸⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⡆⠀⢸⣿⡇⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠈⣿⣷⡀⢸⣿⣿⣿⣿⠟⠋⠁⠀⣼⣿⠁⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠸⣿⣷⣄⠙⠛⠋⠁⠀⠀⣠⣾⣿⠇⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣶⣶⣶⣶⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
						"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
				break;
			} 
			
		}
		
	}
	
	
	
}
