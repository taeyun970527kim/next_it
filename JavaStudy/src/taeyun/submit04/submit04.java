package taeyun.submit04;

import java.util.Scanner;

public class submit04 {

	public static void main(String[] args) {

//		// 로꾸꺼 로꾸꺼
//		// 사용자에게 문자열을 입력받으시고, 입력받은 문자열의 순서를 뒤집어서 출력해보세요.
//		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("거꾸로 뒤집을 문자열 입력");
//		System.out.print(">>> ");
//		
//		String input = scan.nextLine();
//		
//		String reverse = "";
//		for(int i = input.length(); i > 0; i--) {
//			String str = input.substring(i-1, i);
//			 reverse += str;
//		}
//		System.out.println(reverse);
//		
//		System.out.println("\n=====================================================\n");
		
		// 엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때, 한 대의 엘리베이터만 이동하는 프로그램을 구현해 봅시다.
        
		// 1. 사용자가 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
		// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
		// ex) 엘리베이터 A는 1층, B는 7층일때 사용자의 위치가 4층이면 엘리베이터 B가 내려온다. 
		// 3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
		// 4. 엘리베이터 프로그램을 종료하려면 q, exit 중 하나를 입력한다.
		
		// ((elevatorA-floor) < (elevatorB-floor)) ? (floor 층에서 엘레베이터A를 호출합니다) : (floor 층에서 엘레베이터B를 호출합니)
		//     9   <    3
		
	
//		int elevatorA = 10;
//		int elevatorB = 4;
//		
//		while(true) {
//			System.out.println("승강기 A의 현재 위치: " + elevatorA + "층");
//			System.out.println("승강기 B의 현재 위치: " + elevatorB + "층");
//			System.out.println("몇층에 계시나요? | [종료하시려면 q 또는 exit 입력");
//			System.out.print(">>> ");
//			
//			String command = scan.nextLine();
//			int floor = Integer.parseInt(command);
//			
//			if(Integer.parseInt(command) == floor) {
//				while(true) {
//					if((elevatorA - floor) < (elevatorB - floor) || (elevatorA - floor) == (elevatorB -floor)) {
//						System.out.println(floor + "층에서 엘레베이터를 호출합니다.");
//						elevatorA = floor;
//						System.out.println("승강기 A가 " + floor + " 층으로 이동하였습니다");
//						
//						} else if((elevatorA - floor) < (elevatorB - floor)) {
//						System.out.println(floor + "층에서 엘레베이터를 호출합니다");
//						elevatorB = floor;
//						System.out.println("승강기 B가 " + floor + " 층으로 이동하였습니다");
//				}
//				
//			}
//			
//			} else if(command.equals("q") || command.equals("exit")) {
//				System.out.println("프로그램이 종료되었습니다");
//				break;
//			}
//			
//			
//		}
		
		System.out.println("\n========================Solution=============================\n");
		 // Q. 01
		
//		Scanner scan = new Scanner(System.in);
		
		System.out.print("거꾸로 뒤집을 문자열 입력: ");
		String input1 = scan.nextLine();
		
		
		// 한글자씩 잘라보기
		String result1 = "";
		// 로꾸꺼 -> 글자 길이
		// substring(2, 3) -> 꺼
		// substring(1, 2) -> 꾸
		// substring(0, 1) -> 로
		
		// 글자 길이부터 시작 1까지 
		 
		for(int i = input1.length(); i <= 0; i--){
			String str = input1.substring(i-1, i);
			System.out.println(str);
			result1 += str;
		}
		System.out.println("뒤집은 문자열: " + result1);
		
		
		System.out.println("\n=====================================================\n");
		
		int elevatorA = 10; // 엘레베이터 A의 위치는 10층
		int elevatorB = 4; // 엘레베이터 B의 위치는 4층
		
		while(true) {
			System.out.println("\n=============== 희영빌딩 엘레베이터 ===============\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA);
			System.out.println("승강기 B의 현재 위치: " + elevatorB);
			System.out.print("몇층에 계시나요? [종류는 q 또는 exit]: ");
			
			String inputText = scan.nextLine();
			
			if(inputText.equals("q")||inputText.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			int floor = Integer.parseInt(inputText);
			
			// 층수차이 계산
			int differentA = Math.abs(elevatorA - floor); // 10 - 9 = 1
//			int differentB = elevatorB - floor; // 4 - 9 = -5 -> 5로 바꿔줘야함 3가지 방법 (math.abs , if문 보정, 삼항연산자)
			int differentB = (elevatorB < floor) ? (floor - elevatorB) : (elevatorB - floor);	
			
//			if(differentB < 0) {
//				differentB *= -1;
//			} 
			if(differentA > differentB) {
				System.out.println("엘레베이터 B가 " + floor + "층으로 이동하였습니다.");
				elevatorB = floor;
			} else if(differentA < differentB) {
				System.out.println("엘레베이터 A가 " + floor + "층으로 이동하였습니다.");
				elevatorA = floor;
			} /* else if(differentA == differentB) 도 사용가능하지만 남은 결과가 == 밖에 없으므로 else 사용*/
			else {
				if(elevatorA > elevatorB) {
					System.out.println("엘레베이터 A가 " + floor + "층으로 이동하였습니다.");
				elevatorA = floor;
				} else {
					System.out.println("엘레베이터 B가 " + floor + "층으로 이동하였습니다.");
				elevatorB = floor;	
				}
					
					
			}
			
			
		}
		
		
		
		
		
		
		
		
	}
}
