package ch02_variable;

public class VariableType {
	// 변수의 타입 (기본 타입)
	
	// 정수 타입
	byte byteVar = 1;
	short shortVar = 2;
	int intVar = 3;
	// 롱타입은 엘 붙여야돼서 귀찮아서 인트 더 많이 씀
//	long longVar = 40000000000; 
//	long longVar = 40000000000l;
	// l 안붙인 롱은 그냥 인트로 인식됨
	long longVar2 = 4l;
	
	// 정수이면서 문자에 해당(많이는 안씀)
	char charVar = 44032; // 문자 '가'와 같다.
	char ga = '가'; // 44032 와 같다.
	// 두개가 같은거임 / 문자는 한글자 문자열은 두글자부터
	
	// 소수 타입
	double doubleVar = 3.14; // 더블이 용량 더 큰데 f 안붙여도 돼서 더 많이 씀
	float floatVar = 3.14f;
	
	// 불리언 타입 (참/거짓, true/false)
	boolean boolVar = true;
	boolean boolVar2 = false;
	
	// 문자열 타입 (문자, char는 한글자 / 문자열은 0글자 이상)
	String strToday = "오늘은 3월 21일"; // 글자 수 제한은 없다고 봐도 무방
	
	
	

}
