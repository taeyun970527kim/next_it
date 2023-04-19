package taeyun.submit05;

public class submit05 {

	public static void main(String[] args) {
		// Q. 01
		// n층 짜리 트리를 출력할 수 있는 makeTree(int n) 메소드를 만들어서 실행시켜 주세요.
		makeTree(5);
		makeTree(6);
		makeTree(7);
		
		//    *
		//   ***
		//  *****
		// *******
		//*********
		//       *
		//      *** 6
		//     ***** 5
		//    ******* 4
		//   ********* 3
		//  *********** 2
		// ************* 1
		
		// for문에 n번 실행
		// num이	 1, 2, 3, 4, 5, 6, 7 일때
		// 공백은	 7, 6, 5, 4, 3, 2, 1
		// 별*은	 1, 3, 5, 7, 9, 11, 13 다
		
		System.out.println("\n===========================================================\n");
		
		// Q.02
//		로꾸꺼를 메소드로 만들어서
//		파라미터로 들어온 String 문자열에 대해 뒤집은 결과를 리턴하는 메소드를 만들어보세요.
		
		String example ="로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);
		
				
		System.out.println("\n===========================================================\n");
		
		// Q. @
		// 10진수를 2진수(String 타입)로 리턴해주는 makeBinary(int 타입) 함수를 만들어보세요.
		// 자바에서 2진수, 16진수 등등은 문자열
		// exp) 17 -> "10001"
//		String binaryString = Integer.toBinaryString(17); -> 2진수로 바꿔주는 함수
//		System.out.println(binaryString);
		
		String myBinaryStr = makeBinary(23);
		System.out.println(myBinaryStr);
		
//		hint
//		문자열 변수를 하나 선언해서 
//		입력받은 정수를 2로 나눈 나머지를 문자열 변수에 더한다.
//		그 다음 입력받은 정수를 2로 나눈 몫을 이용하여 위 과정을 반복한다.
//		2로 나눈 몫이 1이 된다면 반복을 종료한다.
//		이진수로 만들어진 문자열 변수를 거꾸로(로꾸꺼) 뒤집은 다음 리턴한다.
		
	} // 메인문 끝

	public static void makeTree(int num) {
		for(int i = 1; i <= num; i++) {
			String space = "";
			for(int k = 0; k < num-i; k++) {
				space += " ";
			}
			String stars = "";
			for(int k = 0; k < (i*2)-1; k++) {
				stars += "*";
			}
			System.out.println(space + stars);
		}
	}
	public static String reverseStr(String example) {
		
		String result = "";
		
		for(int i = example.length(); i > 0; i--){
			String str = example.substring(i-1, i);
			result += str;
		}
		return result;
	}
	
	public static String makeBinary(int num) {
		// num에 17이 들어왔다.
		// 17을 2로 나눠서 나머지 1 / 몫은 8
		// 8을 2로 나눠서 나머지 0 / 몫은 4
		// 4를 2로 나눠서 나머지 0 / 몫은 2
		// 2를 2로 나눠서 나머지 0 / 몫은 1
		// 1을 2로 나눠서 나머지 1 / 몫은 0 (스탑)
		// 몇번 반복할지 애매하면 while
		
		// 반복횟수와 기준이 애매하면 while(true)
		String result = "";
		
		while(true) {
			result += num % 2;
			num = num / 2;
			
			if(num == 0) { // 조건이 명확해지면 true를 조건으로 바꿔주기
				break;
			}
		}
		
		String rst = reverseStr(result); // 메소드 안에 다른 메소드를 넣어도 된다.
		return rst; // return = reverseStr(result);도 됨
//		String rst = "";
//		while(num >= 1) {
//			rst += (num%2); 
//			num /= 2;
//		} 
//		String result = "";
//		for(int i = rst.length(); i > 0; i--) {
//			String str = rst.substring(i-1, i);
//			result += str;
//		}
//			return result;
			
				
			 
		} 
			
	
}
