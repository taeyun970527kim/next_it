package ch02_variable;

public class VariableMain {

	public static void main(String[] args) {
		// 변수의 선언
		// [변수 타입] [변수명] 의 형태
		int myMoney;
		
		// 값을 담지 않은 경우 사용할 수 없다.
		// 해당 커서 주석처리
		// 단축키 [Ctrl+/]
//		System.out.println(myMoney); // 값이 없기때문에 에러 // 이건 주석처리 해놈
		
		// 변수에 값 할당
		// 변수 초기화 (Initialization = init)라고 한다.
		// 등호(=)를 이용하여 변수에 값을 담을 수 있다.
		// 등호 오른쪽의 값을 왼쪽에 담는다.
		myMoney = 10000;
		System.out.println(myMoney);
		
		// 변수의 값을 변경 할 수 있다.
		// (그러니까 변수라고 부름, 값이 변할 수 있는 녀석)
		myMoney = 1_000_000; // 가시성을 좋게 하기 위해 언더바로 표시 해줘도 됨
		System.out.println(myMoney);
		
		// 변수의 선언과 함께 값을 할당
		int numOne = 1;
		double pi = 3.14;
		
		System.out.println(numOne);
		System.out.println(pi);
		
		// 상수(Conctant)의 선언
		// 값이 항상 같은 녀석
		// 값이 바뀌면 안되는 녀석에 대해 상수로 선언
		final double MATH_PI = 3.14; // pi에 오류 난 이유는 위에 변수에 이미 파이에 변수를 담고 있는데 또 같은 이름으로 상수를 만들어서 그럼
		// 상수든 변수는 메모리에 저장되는 값이 같으면 안됨 그래서 이르 ㅁ바꿨고 
		// 상수는 값을 바꿀 수 없으며 스네이크 방식으로 쓴다. 그게 약속임
//		MATH_PI = 4.55 는 오류
		
		System.out.println("\n=============================\n");
		// 슬래쉬 긋는 법
		
		// 변수를 사용하는 이유
		
		// 콘솔창에 10을 10번 출력
		
		int numTen = 10; // 이 방법은 숫자만 바꾸면 결과가 바뀌기 때문에 수정이 용이하다.
		System.out.println(numTen);
		System.out.println(numTen);
		System.out.println(numTen);
		System.out.println(numTen);
		System.out.println(numTen);
		System.out.println(numTen);
		System.out.println(numTen);
		System.out.println(numTen);
		System.out.println(numTen);
		System.out.println(numTen);
		
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		// 이건 숫자를 전부 바꾸거나 새로 만들어야됨.
		
		// 변수 사용하면 값에 이름을 부여 할 수 있다.
		// 변수명은 길이에 제한이 없기 때문에 직관적으로 보면 알 수 있게 짓는것이 좋음
		
		int myAge = 31;
		
		System.out.println(myAge);
		
		
		System.out.println("\n================== String 메소드 ====================\n");
	
		// 문자열 String 
		// 문자열은 클래스이므로, 다양한 메소드를 내장하고 있다.
		String fruits = "Apple, Banana, Cherry";
		
		// .length()
		// 해당 문자열의 길이를 리턴(데꼬온다)
		int len = fruits.length();
		System.out.println(len);
		
		// .charAt(인덱스)
		// 인덱스는 배열, 문자열에서 몇 번째에 해당하는 숫자를 의미 (예 Apple 의 A는 0 P는 1)
		// 인덱스는 0부터 시작 (첫 번쨰 = 인덱스 0)
		// 해당 문자열에서 해당 인덱스에 해당하는
		// 문자(char)를 리턴한다.
		fruits.charAt(3);
		System.out.println(fruits.charAt(3));
		// char 를 활용하면 아래처럼 가능
		char alphaL = fruits.charAt(3);
		System.out.println(alphaL);
		

	
	// .indexOf(문자열)
	// 해당 문자열에서 괄호 안에 있는 문자열의 인덱스를 리턴
	System.out.println(fruits.indexOf("Banana"));
	// 대소문자를 구분한다.
	// 괄호 안 문자열이 존재하지 않으면 -1 리턴
	System.out.println(fruits.indexOf("banana"));
	// 대소문자를 구분하기 떄문에 소문자 b 로 시작하는 바나나는 없어서 -1을 리턴하는거
	
	// 처음 발견된 녀석의 인덱스만 리턴
	System.out.println(fruits.indexOf("p"));
	// p는 두개지만 처음꺼만 리턴해서 결과가 1임
	
	// .substring(시작 인덱스, 끝 인덱스)
	// 해당 문자열을 시작 인덱스부터 끝 인덱스 전까지 자른다. (원하는 문자 다음꺼까지 써줘야 그 앞에서 잘림.)
	System.out.println(fruits.substring(7,13));
	
	// 자른 값을 리턴, 실제로 해당 문자열을 잘라버리진 않는다. 그대로임
	System.out.println(fruits);
	// .substring(시작 인덱스) *끝 인덱스 없이 쓰면
	// 해당 문자열을 시작 인덱스부터 끝까지 자른다.
	System.out.println(fruits.substring(15));
	System.out.println(fruits.substring(7));
	
	// .replace(바뀔 문자열, 바꾸고 싶은 문자열)
	System.out.println(fruits.replace("Cherry", "Chamwui"));
	// 마찬가지로 원본이 바뀌지는 않음
	System.out.println(fruits); // 그대로임
	
	// 원본을 바꾸고 싶다면??
	fruits = fruits.replace("Cherry", "Chamwui");
	
	System.out.println(fruits);
	
	// .trim()
	// 해당 문자열의 양끝에 존재하는 모든 공백문자를 제거해준다.
	String world = "  The New world!  ";
	System.out.println(world.replace(" ", "")); // 이렇게 하면 제거는 되지만 모든 띄어쓰기가 제거됨
	System.out.println(world.trim()); // 양 옆 공백만 제거됨
	
	// .toUpperCase()
	// .toLowerCase()
	// 해당 문자열에 존재하는 알파벳들을
	// 전부 대문자/소문자로 바꿔준다.
	System.out.println(fruits.toUpperCase());
	System.out.println(fruits.toLowerCase());
	
	// 설치하시겠습니까? [Y/N] 이런거
	// y , Y 둘 다 먹히게 쓸때 씀
	
	// .concat(문자열)
	// 해당 문자열 뒤에 괄호 안에 있는 문자열을 붙인다.
	System.out.println(fruits.concat(", Durian"));
	
	// 문자열은 더하기 기호를 통해 추가 가능해서 굳이 concat 안써도 됨
	// + 사용하면 앞에다가도 붙일 수 있음 
	System.out.println(fruits + ", Durian");
	// 둘 다 원본은 바뀌지 않음
	
	// 바꾸려면 
	fruits = "Apple, Banana, ChamWui" + ", Durian"; // 잘못해서 다시 씀 ㅠ 위에꺼 참조  
	
	
	fruits = "과일 목록: " + fruits;
	System.out.println(fruits);
	
	System.out.println("\n==========================================\n");
	
	// string 은 기본타입이 아닌 참조타입 이므로
	// null 값을 가질 수 있다.
	// 참조타입의 변수를 객체(instance)라고 부른다.
	String empty = "";  // 빈 문자열을 empty라고 부른다 실제로
	System.out.println(empty); // 걍 공백이 뜨고  
	
	String strNull = null; // 문자열로 null 이  뜸  
	System.out.println(strNull);
	
	System.out.println(empty.concat("채웠음"));
//	System.out.println(strNull.concat("채우기")); 이건 에러남. 걍 존재하지 않는 값
	
	System.out.println("\n================== char ======================\n");
	
	// 문자(char)
	// 작은 따옴표('') 안에 한 문자를 담을 수 있으며
	// 숫자 또한 담을 수 있다.
	// 이때의 숫자는 유니코드에 등록된 각 문자들에 대한 넘버링이다.
	
	// A는 유니코드에서 65번째에 위치 
	char wordA = 'A';
	char numA = 65;
	System.out.println(wordA);
	System.out.println(numA);
	
	// 한글 '가'는 유니코드에서 44032번째 위치
	char hangul = 44032;
	System.out.println(hangul);
	
	hangul++; // 1을 더한다
	System.out.println(hangul);
	
	// byte는 -128부터 127까지만 담을 수 있다.
	byte byteNum = 127;
	byteNum++;
	System.out.println(byteNum); // 128이 되어야하지만 바이트가 담을 수 있는 수를 초과하면 -128부터 순회하며 값이 나온다. 
	
	System.out.println("\n============ 형변환 =============\n");
	
	// 형 변환(Casting)
	// 형 변환이 가능한 경우에는 형 변환을
	// 이용해서 상황에 맞게 적절히 사용할 수 있다.
	
	int intVal = 15;
	double douVal = 1.23;
	
	// int(정수) 곱하기 double(소수)은 double 타입으로 자동 형변환이 된다. 
	
	System.out.println(intVal * douVal);
	
	double mulResult = intVal * douVal;
	
	// int 곱하기 float을 해도 float 타입으로 자동 형변환 된다.
	float flotRst = intVal * 1.23f;
	
	// int 20000이 long 타입으로 자동 형변환 되어 담긴것이다 (원래 롱타입은 20000l 일케 써줘야됨)
	long longVal = 20000;
	
	// 숫자 더하기 문자열(String)을 하면
	// 숫자가 문자열로 자동 형변환이 되어 
	// 문자열 더하기(이어붙이기)가 된다.
	String name = "찬웅";
	String age = name + 31;
	System.out.println(age);
	
	// 강제 형변환
	// (타입) 값
	// 형변환이 가능한 경우에 대해, 해당 값이 괄호 안 타입으로 
	// 변환 된다.
	int intCast =  (int)3.3333;  // 소수점 아래 다 날라감. 반올림 없음.
	System.out.println(intCast);
	
	// 주의해야할 점
//	int mulVal = (int)10 * 3.333; - 이 경우엔 바로 옆에 있는 10 정수와만 짝이 되는 거기 때문에 이미 정수라 오류임
	
	int mulVal = (int)(10 * 3.333); 
	System.out.println(mulVal);
	// 이렇게 해야됨
	
	// 많이 하는 실수
	double result = 10 / 3;  // 3.3333.. 이 나와야 되는데
	System.out.println(result);  // 3.0이 나옴
	// int / int 의 연산결과는 int 이기 때문에 정수인데 그걸 더블로 형변환 하라고 하니까 .0이 붙은거임
	
	// result가 3.33333 으로 출력되도록 바꿔보세요.
	result = (double)10 / 3;  // 하나만 더블로 바꾸면 자동으로 더블로 형변환 되니까 10만 더블로 해줌
	// 10.0 / 3 만들어주는거임
	// 꼼수로 더블 안쓰고 10 / 3.0 도 가능 1.0 * 10 * 3 도 가능
	System.out.println(result);   // 무한소수는 용량때문에 정확도가 떨어짐
	
	// 숫자 문자열과 숫자간의 형변환
	String strNum = "1324";
	System.out.println(strNum + 2); 
	// 이러면 연산이 되서 1326이 되는게 아니고 그냥 문자열로 되서 13242 되는거임
	
	// 문자열을 정수 타입으로 형변환
	
	// Integer.parseInt(숫자 문자열) ****기억해놓기
	int intNum = Integer.parseInt(strNum);
	System.out.println(intNum + 2);
	// 이건 정수로 형변환 된거라 연산이 돼서 1326
	
	// 정수 타입을 문자열로 형변환
	// Integer.toString(숫자) *얘는 안중요함 
	// 문자열 + 숫자 하면 숫자가 알아서 문자열로 형변환 되니까 굳이 바꿀 필요 없음
	String strCast = intNum + "";
	System.out.println(strCast + 2);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
