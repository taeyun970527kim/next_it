package kty.util;

public class KTYUtil {
	/**
	 *  
	 *  입력한 소수를 반올림하여 소수 n번째 자리로 리턴해주는 함수입니다.
	 * @param num 입력한 소수를 반올림하여 소수 n번째 자리로 리턴해주는 함수입니다.
	 * @param 반올림하고자 하는 소수
	 * @return 
	 */
	public static double weRound(double num, int n) {
		// 10의 n제곱 구하기
//		Math.pow(10, n) = 100 도 가능
		int ten = 1;
		for(int i = 0; i < n; i++) { // n회 반복하는 for문
			ten *= 10;
		}
		num = num * ten; // num *= ten도 가능
		long temp = Math.round(num);
		
		double result = (double)temp / ten;
		return result;
	}
}
