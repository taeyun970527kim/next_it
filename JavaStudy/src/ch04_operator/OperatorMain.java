package ch04_operator;

public class OperatorMain {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);
		
		// 증감 연산자
		number++; // 1 증가
		System.out.println(number); //
		
		number--; // 1 감소
		System.out.println(number);
		
		++number; // 1 증가
		System.out.println(number);
		
		// 앞, 뒤에 따라 실행 순서가 다르다
		System.out.println(number++); // 현재 수치로 실행이 끝남 그 이후에 증가함		
		System.out.println(number); // 다음 구현때 확인 가능
		
		System.out.println(++number); // 덧셈이 먼저 실행되어 증가한 수치 표현
		
		System.out.println("\n===============대입 연산자================\n");
		
		number = 10;
		
		number += 1;
		System.out.println(number); // 11
		
		number += 34; // 원하는 수치만큼 증가 가
		System.out.println(number); // 45
		
		number -= 20;
		System.out.println(number); // 25
		
		number *= 3;
		System.out.println(number); // 75
		
		number /= 5;
		System.out.println(number); // 15
		
		number /= 2;
		System.out.println(number); // 7 나누기의 몫이 되버린다
		
		number %= 3;
		System.out.println(number); // 1 나누기의 나머지가 되버린다.
		
		System.out.println("\n================산술 연산자===============\n");
		
		int numA = 10;
		int numB = 3;
		
		numA = numA + 1;
		System.out.println(numA);
		
		System.out.println("numA: 11, numB: 3");
		System.out.println("더하기: " + (numA + numB));
		System.out.println("빼기: " + (numA - numB));
		System.out.println("곱하기: " + (numA * numB));
		System.out.println("나누기: " + (numA / numB));
		System.out.println("나머지: " + (numA % numB));
		
		
		System.out.println("\n===============================\n");
		
		// 먼저 계산할 부분에 대해 괄호는 필수!!
		int temp = 1 + (2 * 3);
		System.out.println(temp);
		
		System.out.println("\n================나머지 연산자 사용 예시===============\n");
		
		// 홀수, 짝수 판별
		int anyNum = 5436;
		// anyNum을 2로 나눈 나머지가 1이면 홀수, 0이면 짝수
		System.out.println(anyNum % 2);
		
		// 게시판 페이징 구현
		int totalCountGul = 33; // 게시판에 글이 총 33개 있다.
		int showCountOnePage = 10; // 한 페이지에서 보여줄 글의 수가 10개다.
		
		// 총 페이지수의 수
		// 33 / 10 = 3.3 -> 올림처리 4가 필요
		// 대문자 Ctrl+Space 시 자동완성 exp) showCOP = showCountOnePage
		int countPage = (int)Math.ceil((double)totalCountGul / showCountOnePage);
		System.out.println(countPage);
		
		// 마지막 페이지에 있는 글의 수
		// 33 을 10으로 나눈 나머지 = 3
		// 즉 값은 33 % 10
		int countLastPageGul = totalCountGul % showCountOnePage;
		System.out.println(countLastPageGul);
		
		System.out.println("\n=============문자열 더하기==================\n");
		
		String subway = "반석역";
		subway = subway + " 지족역";
		System.out.println(subway);
		
		// 대입 연산자로도 문자열 더하기(이어붙히기) 가능
		// 하지만 뒤에만 추가된다.
		subway += " 노은역";
		System.out.println(subway);
		
		subway = "종점 " + subway + " 월드컵경기장역";
		System.out.println(subway);
		
		System.out.println("\n==============비교 연산자=================\n");
		
		int numFive = 5;
		double pi = 3.14;
		int numOne = 1;
		
		// 비교 결과에 따라 true/false가 리턴된다.
		System.out.println(numFive > numOne);
		
		boolean result = numFive < numOne;
		System.out.println(result);
		
		// 타입이 다른 숫자도 비교 가능
		System.out.println(numFive >= pi);
		
		// == 는 왼쪽과 오른쪽이 같은지 비교하는 연산
		// (같다면 true / 다르면 false 리턴)
		System.out.println(1 + 2 == 3);
		System.out.println(numOne == numFive);
		
		// != 는 왼쪽과 오른쪽이 다른지 비교하는 연산
		// (다르면 true / 다르면 false 리턴)
		System.out.println(numOne != numFive);
		
		// 문자에 대해서도 비교 연산이 가능하다.
		System.out.println('가' > '나'); // 문자에 해당한 유니코드의 숫자를 비교
		
		// 문자열을 정렬하는 로직을 만들때
		// 문자열 앞글자만 char 타입으로 꺼낸 후 비교하여 정렬하면 된다
		String stuA = "고동욱";
		String stuB = "김대일";
		System.out.println(stuA.charAt(0) > stuB.charAt(0));
		
		// 문자열이 서로 같은지 비교
		// .equals(문자열) !! 중요
		// 해당 문자열이 괄호 안 문자열과 같은지 비교 가능
		String ship = "배";
		String pear = "배";
		String bae = new String("배");
		
		System.out.println(ship == pear); // true
		System.out.println(ship == bae); // false
		System.out.println(ship.equals(bae)); // true
		
		// 예시
		// 서버에서 데이터를 가져오는데 문제가 생기면
		// null 값으로 넘어온다.
		// 데이터를 받아오는 쪽에서 null 체크
		String serverData = null;
		System.out.println(serverData != null); // false
		
		// 사용자의 입력을 가지고 왔더니
		// 입력하지 않은 데이터가 empty로 온다.
		String inputData = "";
		System.out.println(inputData.equals(""));
		System.out.println(inputData.length() == 0);
		System.out.println(inputData.isEmpty()); // empty check는 3가지 다 가능 아무거나 사용
		
		System.out.println("\n==============삼항 연산자=================\n");
		
		String inputId = "taeyun970527kim";
		
		// inputId의 길이가 7 이상이면 통과, 아니면 재입력
		String check = (inputId.length() >= 7) ? ("통과") : ("재입력");
		System.out.println(check); // true
		
		// inputId가 empty가 아니라면 1, 맞다면 0
		int checkInt = (inputId.length() > 0) ? 1 : 0; // 괄호 없어도 가능,, 가시성을 위해 조건문만 괄호.
		
//		(조건문) ? (true 일때 값) : (false 일때 값)
		System.out.println(checkInt);
		
		// 이중 삼항 연산자
		int score = 93;
		
		//score가 90점보다 크면 grade는 "A"
		//80점보다 크면 "B", 나머지는 "C"
		String grade = (score > 90) ? ("A") : (  (score > 80) ? ("B") : ("C")  );
		System.out.println(grade);
		
		System.out.println("\n==============논리 연산자=================\n");
		
		// 조건 체크를 여러번 하지 않고, 한번에 끝낼 수 있도록 도와줌
		int inputAge = 24;
		String inputPhone = "01050030008";
		
		// 나이는 14세 이상, 휴대폰 번호는 11자리 체크
		System.out.println(inputAge >= 14); 
		System.out.println(inputPhone.length() == 11); // 논리연산자를 사용 안할시
		
		// &&
		// 좌우 조건이 전부 참(true)이어야만 true 리턴
		// 좌우 둘 중 하나라도 false라면 false 리턴
		System.out.println(inputAge >= 14 && inputPhone.length() == 11); // true
		System.out.println(inputAge >= 14 && inputPhone.length() == 10); // false
		
		// 휴대폰 번호는 10자리 혹은 11자리 여야 한다.
		// 10 <= x <= 11
//		System.out.println(10 <= inputPhone.length() <= 11); // java에서는 안됨
		System.out.println(10 <= inputPhone.length() && inputPhone.length() <=11); // true
		
		// ||
		// or  좌우 조건 중 하나라도 참(true)이면 true 리턴
		// 둘 다 false일 때만 false 리턴
		
		// x == 10 or x == 11
		System.out.println(inputPhone.length() == 10 || inputPhone.length() == 11); // true
		
		// 회원가입 예시
		String name = "차무식";
		String phone = "01050030008";
		int age = 50;
		
		// name은 empty면 안되고 .isEmpty() 쓰면 안됨
		// phone은 10자리 또는 11자리
		// age는 14세 이상
		boolean checkName = name.length() > 0;
		boolean checkPhone = phone.length() == 10 || phone.length() == 11;
		boolean checkAge = age >= 14; 
		
		System.out.println(checkName && checkPhone && checkAge); // true
		
		// isEmpty()를 쓰려면 ??
		// boolean 타입 안에 !를 붙이면 true/false가 바뀐다
		checkName = !name.isEmpty();
		System.out.println(checkName);
		System.out.println(!checkName); // checkName 앞에 ! 지우고 syso 앞에 ! 붙여도 가능
		
		System.out.println("\n==============비트 연산자=================\n");
		
		// 2진수
		int bitTen = 10; // 1010
		int bitNine = 9; // 1001
		                 // 1000 AND 연산값 = 8
		                 // 1011 OR  연산값 = 11
		                 //   11 XOR 연산값 = 3
		
		// & AND
		// 이진수 기준으로 각 자리수를 비교해서 
		// 같은 자리의 숫자가 둘 다 1이어야 1로 계산한다
		System.out.println(bitTen & bitNine);
		
		// | OR
		// 이진수 기준으로 각 자리수를 비교해서
		// 한 자리의 숫자라도 1이면 1로 계산한다
		System.out.println(bitTen | bitNine);
		
		// ^ XOR
		// 이진수 기준으로 각 자리가 서로 다를때만 1로 계산
		System.out.println(bitTen ^ bitNine);
		
		// 2진수 사용 예시
		// 4가지 취미를 보관하기 위해 숫자로 저장
		// 0 0 0 1 : 농구를 좋아함
		// 0 0 1 0 : 배구를 좋아함
		// 0 1 0 0 : 야구를 좋아함
		// 1 0 0 0 : 축구를 좋아함
		
		// 1 1 0 1
		int jonghyunLike = 13;
		
		// 리눅스에서 파일, 폴더의 권한을 설정하는 명령어 chmod
		
		// 16진수
		// RGB (255, 0 , 0) = #ff0000 = Red
		// RGB (0, 0, 255) = #0000ff = Blue
		
		System.out.println("\n==============비트 연산자=================\n");
		
		// 면접에서 물어본 2진수, 16진수 문제
		// A. 16진수 12f를 십진수로 바꾼 후 2진수로 변환
		// B. 10진수 147을 2진수로 변환
		// C. A와 B에 대해 비트연산자 AND 적용 (2진수)
		// D. C를 10진수로 표현
		
		
		
		
		
		
	}

}
