package ch05_controll;

public class LoopFor {

	public static void main(String[] args) throws InterruptedException {

		 // 콘솔창에 1부터 10까지 출력
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		int num = 1;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);

		System.out.println("\n=====================================================\n");
		
		// for문
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// for문 내에서 선언된 변수 i는 for문 종료 후 메모리에서 삭제된다. (변수의 scope)
		
		
		// for문 내 변수 i는 for문의 반복 횟수를 정하기 위함이 주 목적이므로
		// 꼭 i를 for문 내에서 사용하지 않아도 된다.
		int one = 1;
		for(int i = 0; i < 10; i++) { // 10번 반복 실행
			System.out.println(one++); // 위 실행한 num++와 똑같은 방식
		}
		
		
		// i는 for문 내에서 사용(선언)되는 변수명일뿐이므로
		// i가 아닌 다른 단어를 사용해도 된다.
		for(int x = 0; x < 5; x++) { // 5번 반복 실행
			System.out.println(x);
		}
		
		// for문 밖에 선언된 변수명은 사용할 수 없다
		
		System.out.println("\n=====================================================\n");
		
		// 1부터 20까지 더하기
		// 변수의 사용범위(Scope)
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 21부터 45까지 더하기
		sum = 0; // 초기화 해주어야함
		for(int i = 21; i <= 45; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 1부터 40까지 중에 짝수끼리만 더한 값
		sum = 0;
		for(int i = 1; i <= 40; i++) {
			// 현재 i가 짝수인지 확인
			if(i % 2 == 0) {
				//짝수라면 sum에 더한다
				sum += i;
			}
		}
		System.out.println(sum);
		
		// 다른 방법
		sum = 0;
		for(int i = 0; i <= 40; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		
		// 0부터 2까지 0.2마다 출력 (i++을 사용안했을때 1)
		for(double i = 0; i <= 2; i += 0.2) {
			System.out.println(i);
		}
		
		// i++을 사용안했을때 2
		for(int i = 0; i<= 20; i += 2) {
			System.out.println(i/10.0);
		}
		
		// 증감식에 i++로 두고 위의 코드와 결과가 같도록 출력하기
//		for(int i = 0; i <= 10; i++) {
//				System.out.println((i*2)/10.0);
//		}
		
		for(int i = 0; i <= 20; i++) {
			if(1 % 2 == 0) {
				System.out.println(i/10.0);
			}
		}
		
		// 규칙을 파악
		// syso가 11번 실행 -> i를 = 0; i <11
		// i = 0 -> 0
		// i = 1 -> 0.2
		// i = 2 -> 0.4
		// i = 3 -> 0.6
		// 규칙은 i에 2를 곱하고 10으로 나눈 값
		for(int i = 0; i <11; i++) {
			System.out.println((i * 2)/10.0);
		}
		
		System.out.println("\n=====================================================\n");
		
		// 구구단 2단 출력
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 4 = 8
		// 2 x 9 = 18
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("2 x "+ i + " = " + (i * 2));
		}
		
		System.out.println("\n=====================================================\n");
		
		// 아래의 5층 트리를 for문을 이용하여 구현
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		String star = "*";
		for(int i = 0; i < 5; i++) {
			System.out.println(star);
			star += "*";
		}
		
		for(String i = "*"; i.length() <= 5; i += "*") {
			System.out.println(i);
		}
		
		System.out.println("\n========================국수나무=============================\n");
		
		// 나머지 연산자(%)의 사용 예시
		// for문 내에서 순환하는 숫자에 대해 사용
		
		// 국수공장에서 면을 20cm 뽑고 있는데
		// 5cm마다 잘라주기
		for(int i = 0; i < 20; i++) {
			System.out.println("||||||||");
			
			// i 가 4, 9, 14일 때 면을 잘라준다
//			if(i == 4 || i == 9 || i == 14) {
			if(i == 4) {
				System.out.println("--------");
			} else if(i == 9) {
				System.out.println("--------");
			} else if(i == 14) {
				System.out.println("--------");
			} 
		}
		
		// i 가 4, 9, 14, 19, .... 일 때 면을 잘라준다
		// 규칙 찾기
		// i를 5로 나눈 나머지가 4인 애들
		for(int i = 0; i < 20; i++) {
			if(i % 5 == 4) {
			System.out.println("--------");
			}
		}
		
		System.out.println("\n========================신라면=============================\n");
		// 라면 공장에서 면을 30cm 뽑고 있는데
		// 6cm마다 잘라주어야 한다
		
		/*
		 //////////
		 \\\\\\\\\\
		 //////////
		 \\\\\\\\\\
		 //////////
		 \\\\\\\\\\
		 //////////
		 \\\\\\\\\\
		 //////////
		 \\\\\\\\\\
		 //////////
		
		for(int i = 0; i < 30; i++) {
			System.out.println("//////////");
			if( i % 2 == 0) {
				System.out.println("\\\\\\\\\\\\\\\\\\\\");
			} if( i % 6 == 0) {
				System.out.println("------------------");
			}
		}
		\ 역슬래쉬가 짤리는 이유 = 제어 문자이기 때문에 \ 2개를 써야 콘솔창에 1개 출력
		// 5 , 11 , 17
		// i를 6으로 나눈 나머지가 5일때 자른다
		*/
		
		for(int i = 0; i < 30; i++) {
			if(i % 2 == 0) {
				System.out.println("//////////");
			} else if(1 % 2 == 1) {
				System.out.println("\\\\\\\\\\\\\\\\\\\\");
			}
			if(i % 6 == 5) {
				System.out.println("----------");
			}
			
//			Thread.sleep(400); //컴퓨터가 0.4초 쉼(400은 밀리세컨드)
		}
		
		System.out.println("\n=====================================================\n");
		
		// 10부터 1까지 출력
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("\n=====================================================\n");
		
		// for문으로 string 가지고 놀기
		// submit01에서 했던 숫자의 각 자리수를 더한 결과를 출력을
		// for문을 이용하여 해결
		
		// Q.03 각 자리수 더하기
		
		int example = 47845932;
		
		// 숫자를 문자열로 변환
		String strEx = example + ""; // 문자열 "278"
		
		int result = 0;
		// 문자열의 길이만큼 반복되는 for문
		for(int i = 0; i < strEx.length(); i++) {
			String str = strEx.substring(i, i+1);
			int no = Integer.parseInt(strEx.substring(i, i+1));
			result += no;
		}
		System.out.println("각 자리수를 더한 값: " + result);
		
		// 1 문장으로 압축 가능 (이따 해보기)
		
		result = 0;
		for(int i = 0; i < strEx.length(); i++) {
			result += Integer.parseInt(strEx.substring(i, i+1));
		}
		
		System.out.println("각 자리수를 더한 값: " + result);
		
		// 문자열을 각 자리수마다 자른다.
		// substring 추천
		String str1 = strEx.substring(0, 1); // i = 0
		String str2 = strEx.substring(1, 2); // i = 1
		String str3 = strEx.substring(2, 3); // i = 2
		
		System.out.println("\n=====================================================\n");
		
		// 슈의 갯수 세기
		String syu = "슋규슈슈슛슈슉슈슈슈슛슈슈슈슉슋귯귯귯귯슉슈";
		
		// 1. syu를 한글자씩 자르고
		// 2. 자른 값이 "슈"인지 체크 하고
		// 3. "슈"가 맞다면 카운팅
		
		int count = 0; // 3. 카운트
		for(int i = 0; i < syu.length(); i++) {
			String str = syu.substring(i, i+1); // 1번 끝
			
			if(str.equals("슈")) /*2번 체크*/ {
				count++;
			}
		}
		System.out.println("슈의 갯수: " + count);
		
		System.out.println("\n=====================================================\n");
		
		// break 문
		// 반복문을 내에서 break문이 실행되면
		// 해당 반복문을 즉시 종료
		
		// 1부터 n까지 더한다고 했을때,
		// 더한 값이 100 이상이 되는 지점의 n을 구할 때
		sum = 0;
		for(int i = 1; i < 9999; i++) {
			sum += i;
			if(sum >= 100) {
				System.out.println(i);
				break;
			}
		}
		
		// continue 문
		// 구구단 6단을 출력하는데 ,
		// 너무 쉬운 1,2,3 부분은 출력하지 않기
		
		for(int i = 1; i <= 9; i++) {
			if(i < 4) {
				// continue가 실행되면
				// 이후 코드는 무시하고 바로 for문(증감식)으로
				continue;
			}
			System.out.println("6 x " + i + " = " + (6 * i));
		}
		
		// 1번부터 30번 까지 더하기
		sum = 0;
		for(int i = 1; i <= 30; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// $ 10번 구현
		String mony = "$";
		for(int i = 0; i < 10; i++) {
			System.out.println(mony);
			mony += "$";
		}
		
		String star1 = "*";
		for(int i = 0; i < 5; i++) {
			System.out.println(star1);
			star1 += "*";
		}
		
		System.out.println("\n=====================================================\n");
		
		// 이중 for문
		// 구구단 출력
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 9 = 18
		// 3 x 2 = 6
		// 3 x 3 = 9
		// 3 x 9 = 27
		// 9 x 9 = 81
		
		for(int left = 2; left <= 9; left++) {
			for(int right = 2; right <= 9; right++) {
				System.out.println(left + " x " + right + " = " + (left * right));
			}
		}
		
		/* 디버깅 모드
		 * 코드라인 좌측 연두색 부분을 더블 클릭하여
		 * breakpoint(초록점)를 만든 후 디버깅 실행
		 * breakpoint 생성/해제 단축키 [Ctrl + Shift + B)
		 * 디버깅 실행 [단축키 F11]
		 *  
		 */
		
		/* 디버깅 목적
		 * 코드를 한줄 한줄 실행 해보며, 변수에 어떤 값이 담기고 있는지 확인해 볼 수 있다. 
		 */
		
		/* 디버깅 실행 (상단 벌레 모양 아이콘 클릭)
		 * 처음에 디버깅 모드에 적합한 화면(perspective)
		 * 전환 여부 묻는 창이 뜬다. (전환하기)
		 * 
		 * 코드들이 쭉 실행되다가 breakpoint가 있는 지점에
		 * 멈춰서 실행 대기를 한다
		 * 
		 * 이후 상단의 Run - step over[단축키 F6]을 눌러
		 * 한줄한줄 코드를 실행해본다.
		 * 
		 * 디버깅 모드를 종료하려면 Terminate [단축키 Ctrl + F2] (콘솔창 쪽에 뜨는 빨간색 중지 버튼)
		 * 
		 * 이후 원래 화면(perspective)으로 돌아오려면
		 * 우측 상단에서 java perspective를 클릭
		 */
		
		System.out.println("\n=====================================================\n");
		
		// 트리
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		System.out.println("    " + "*");
		System.out.println("   " + "**");
		System.out.println("  " + "***");
		System.out.println(" " + "****");
		System.out.println("" + "*****");
		
		// i 는	 0,1,2,3,4,
		// 공백은	4,3,2,1,0 개
		// *은	1,2,3,4,5 개
		
		
		
//		for(String left = " "; left.length() < 5; left--) {
//			for(String right = "*"; right.length() < 5; right -= "*") {
//				System.out.println(left + right);
//			}
//		}
		
		for(int i = 0; i < 5; i++) {
			// 외부 for문의 변수 i를 이용하여
			// 내부 for문의 반복횟수를 조정할 수 있다.
			String space = "";
			for(int k = 0; k < 4-i; k++) {
				space += " ";
			}
			String stars = "";
			for(int k = 0; k < i+1; k++) {
				stars += "*";
			}
			System.out.println(space + stars);
		}
		
		System.out.println("\n=====================================================\n");
		
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
		// for문에 5번 실행
		// i가		 0, 1, 2, 3, 4 일때
		// 공백은	 4, 3, 2 ,1, 0
		// 별*은	 1, 3, 5, 7, 9 다
		
		for(int i = 0; i < 5; i++) {
			String space = "";
			for(int k = 0; k < 4-i; k++) {
				space += " ";
			}
			String stars = "";
			for(int k = 0; k < (i*2)+1; k++) {
				stars += "*";
			}
			System.out.println(space + stars);
		}
		
		//*********
		// *******
		//  *****
		//   ***
		//    *
		
		// for문에 5번 실행
		// i가		 0, 1, 2, 3, 4 일때
		// 공백은	 0, 1, 2, 3, 4
		// 별*은		 9, 7, 5, 3, 1 이다
		
		for(int i = 0; i < 5; i++) {
			String space = "";
			for(int k = 0; k < i; k++) {
				space += " ";
			}
			String stars = "";
			for(int k = 0; k < 9-(i*2); k++) {
				stars += "*";
			}
			System.out.println(space + stars);
		}
		
		
		
		// 탭 지우기 shift + tap
				// 단축키 [ctrl + shift + f] 자동 줄 맞
	}

}