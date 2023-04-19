package taeyun.submit01;

public class Submit01 {

	public static void main(String[] args) {

		// Q.01
		
		String name = "김태윤";
		int age = 30;
		double height = 168.9;
		String phone = "01050030008";
		String email = "taeyun970527kim@gmail.com";
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("연락처: " + phone);
		System.out.println("이메일: "+ email);
		
		// Q.02
		
		String enigma = "너오구늘리뭐너먹구지리";
		
		// 너, 구, 리 제거
		
		// 너 제거
		String tryOne = enigma.replace("너", "");
		System.out.println(tryOne);
		
		// 구 제거
		String tryTwo = tryOne.replace("구", "");
		System.out.println(tryTwo);
		
		// 리 제거 
		String tryThree = tryTwo.replace("리", "");
		System.out.println(tryThree);
		
		
		enigma = enigma.replace("너", "").replace("구", "").replace("리", "");
		System.out.println(enigma);
		
		// Q.03 각 자리수 더하기
		
		int example = 278;
		
		// 숫자를 문자열로 변환
		String strEx = example + ""; // 문자열 "278"
		
		// 문자열을 각 자리수마다 자른다.
		// substring 추천
		String str1 = strEx.substring(0, 1); // "2"
		String str2 = strEx.substring(1, 2); // "7"
		String str3 = strEx.substring(2, 3); // "8"
		
		// 자리를 숫자로 변환
		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		int int3 = Integer.parseInt(str3);
		
//		int result = int1 + int2 + int3;
//		System.out.println(result);
		
		// 한줄로 끝내기 도전!!
		int result = Integer.parseInt(strEx.substring(0, 1))
				+ Integer.parseInt(strEx.substring(1, 2))
				+ Integer.parseInt(strEx.substring(2, 3));
		System.out.println(result);
		
		
		
		
		
	}

}
