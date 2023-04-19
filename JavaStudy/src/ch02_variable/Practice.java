package ch02_variable;

public class Practice {

	public static void main(String[] args) {
		
		char na = '나'; // 한글자용이고 유니코드 짝꿍 숫자랑 호환 가능
		System.out.println(na);
		
		int myBday = 960106;
		System.out.println(myBday);
		
		double myWt = 53.7;
		System.out.println(myWt);
		
		String haRu = "하루 보고싶어 ㅜㅡㅜ";
		System.out.println(haRu);
		
//		int myLen; // 이건 오류값 나올거고
		
		int myLen;
		myLen = 168;
		System.out.println(myLen);  // 일케하면 됨
		
		int myAge = 28;                // 값을 한번에 주는 방법 / 이게 더 편함
		double any = 18.8;
		System.out.println(myAge);
		System.out.println(any);
		
		// 절대 값이 변하지 않는 상수는 final double 인데 항상 스네이크 방식으로 쓴다. 약속임.
		final double pi = 3.14;
		System.out.println(pi);
		
		// 슬래쉬 그어보장
		
		System.out.println("\n-----------------------------------------\n");
		
		String myWish = "치킨 먹고싶당"; // 값만 바꾸면 콘솔창 내용 바꾸기 쌉가능
		System.out.println(myWish);
		System.out.println(myWish);
		System.out.println(myWish);
		System.out.println(myWish);
		System.out.println(myWish);
		
		// 스트링 가보자아ㅏㅏ
		
		String topGun = "bob, hangman, maverick";  // 총 길이 22 
		System.out.println(topGun);
		
		// .length() 해당 문자열의 길이를 데꼬옴
		
		int leng = topGun.length();
		System.out.println(leng);
		
		// .charAt(인덱스)  * 인덱스란 배열을 의미, 즉 해당 수를 입력하면 그 배열에 있는 단어 데꼬옴
		// 첫번째는 0
		
		char voca = topGun.charAt(2);
		System.out.println(voca);
		
		// .indexOf(문자열) 해당 문자열에서 괄호안에 있는 문자열의 인덱스를 데꼬옴
		// 대소문자를 구분 해야함, 안그러면 오류나서 존재하지 않는다고 생각해 -1을 데려옴
		
		System.out.println(topGun.indexOf("hangman"));
		System.out.println(topGun.indexOf("m"));   // m 이 두개라 앞에 m 인덱스 데꼬옴
		
		// .substring(첫인덱스,끝인덱스)  
		// 문자열의 첫인덱스~끝인덱스 앞 까지 잘라줌
		// 끝인덱스 없이 쓰면 첫인덱스~끝까지 잘라줌
		System.out.println(topGun.substring(0,12));
		System.out.println(topGun.substring(5));
		
		// .replace(바뀔문자열,바꾸꼬싶은문자열)
		System.out.println(topGun.replace("hangman", "rooster"));
		
		System.out.println(topGun);  // 원본에 영향은 주지 않음
		
		// if 원본을 바꾸고 싶다면
		
		topGun = topGun.replace("hangman", "rooster");
		
		System.out.println(topGun);  //바뀜
		
		// .trim() 양옆에 있는 공백 제거
		String toDo = "   하루 산책 가기   ";
		System.out.println(toDo);
		System.out.println(toDo.replace("   ", ""));  // 근데 이렇게도 지워지넹 ㅎㅅㅎ/가독성이 안좋아서 안씀
		System.out.println(toDo.trim());  // 이게 더 간편하기는 하당
		
		// .toUppercase() 문자열 안에 모든 알파벳을 대문자로 바꿔줌
		// .toLowercase() 문자열 안에 모든 알파벳을 소문자로 바꿔줌
		System.out.println(topGun.toUpperCase());
		System.out.println(topGun.toLowerCase());
		
		// 문자열에 문자열 더하기  .concat 이 있는데 + 쓰면 돼서 굳이 안
		System.out.println(topGun + ", fritz");
		System.out.println("출연진: " + topGun);  // 역시 원본은 안바뀌고
		
		topGun = "콜사인: " + topGun + ", frits";  // 바꾸려면 이렇게!
		System.out.println(topGun);
		
		String empty = "";
		String sNull = null;
		System.out.println(empty);  // 그냥 공백 나오고
		System.out.println(sNull);  // 문자열로 null 나오는데 이유를 까먹어따 ㅇㅁㅇ!!
		System.out.println(empty + "공백없애기이이");
		// 여튼 null은 존재하지 않는 값이고 공백은 존재하는 값임
		
		// 위에 말했듯이 char는 문자 하나 쓰는건데 유니코드 호환 숫자도 사용 가능
		char a = 'A';
		char uni = 65;
		System.out.println(a);
		System.out.println(uni);
		char ga = '가';
		char unii = 44032;
		System.out.println(ga);
		System.out.println(unii);
		
		ga++; //+1 하는거라 ga에 적용하면 각 만들어줌 44033 된거임
		System.out.println(ga);
		
		// byte는 -128~127까지 담을 수 잇음
		byte nuumm = 125;
		nuumm++;
		System.out.println(nuumm);  // 이건 126ㅇㅣ라 되지만
		
		byte numb = 127;
		numb++;
		System.out.println(numb);   // 이러면 오류라서 걍 -128부터 나옴
		
		// 형변환
		// double * int 는 자동으로 double 로 형변환
		int aaa = 111;
		double bbb = 12.1;
		System.out.println(aaa * bbb);
		
		// float 도 마찬가지
		float fff = aaa * 11.1f;
		System.out.println(fff);
		
		// long 1135858 이라고 쓰면 원래는 l이 안붙어서 int이지만 자동으로 long으로 형변환됨
		long lll = 1135858;
		System.out.println(lll);
		
		// 문자열 + 숫자는 자동으로 문자열로 형변환 
		String jh = "여자";
		String jhAge = jh + 28;
		System.out.println(jhAge);
		
		// 강제 형변환은 가능한 경우에 대해 (타입)값 으로 변환 가능
		int chg = (int)158.54852;
		System.out.println(chg);
		int chg2 = (int)(125*11.18);
		System.out.println(chg2);
		double test = 125*11.18;
		System.out.println(test);

		// 더블 어쩌구 = 10 / 3이면 소수 나와여ㅑ되는데 정수 나누기 정수라 인트로 인식해 소수 안나옴 그땐 하나를 더블(10.0)로 만들기
		double lulu = (double)10 / 3;
		System.out.println(lulu);
		//아니면
		double lala = 10.0 / 3;   //일케도 가능
		System.out.println(lala);
		
		String kiki = "1111";
		String mimi = kiki+222;
		System.out.println(mimi);   // 이럼 숫자가 문자열로 변환돼서 연산 아니라 옆에 붙음 그냥
		
		// 반대로는 Integer.parseInt(숫자문자열) 기억해두깅
		int mumu = Integer.parseInt("8888");
		System.out.println(mumu + 2);
		
		int nunu = Integer.parseInt(kiki);
		System.out.println(nunu + 89);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		

	}

}
