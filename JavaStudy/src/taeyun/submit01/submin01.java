package taeyun.submit01;

public class submin01 {

	public static void main(String[] args) {

		String name = "김태윤";
		int age = 27;
		int height = 167;
		String phone = "010-5003-0008";
		String email = "taeyun970527kim@gmail.com";
		
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("연락처: " +phone);
		System.out.println("이메일: " + email);
		
		
		
		System.out.println("\n===========================================\n");
		
		String enigma = "너오구늘리뭐너먹구지";
		
		
		enigma = enigma.replace("너", "");
		enigma = enigma.replace("구", "");
		enigma = enigma.replace("리", "");
		
		System.out.println(enigma);
		
		
	
		
		
		System.out.println("\n===========================================\n");
		
		int example = 278;
		
		String strcast = Integer.toString(example);
		
		
		char alphaA = strcast.charAt(0);
		char alphaB = strcast.charAt(1);
		char alphaC = strcast.charAt(2);		
		
		System.out.println(alphaA);
		System.out.println(alphaB);
		System.out.println(alphaC);
		
		int a = alphaA - '0';
		int b = alphaB - '0';
		int c = alphaC - '0';
		
		int result = a + b + c;
		
		
		System.out.println("결과는: " + result );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
