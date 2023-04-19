package taeyun.submit03;

public class submit03 {

	public static void main(String[] args) {
		// Q. 01
		
		int num = 1;
		for(int i = 10; i >= 1; i--) {
			num *= i;
		}
		
		System.out.println(num);
		
//		num = 1;
//		for(int i = 1; i <= 10; i++) {
//			num *= i;
//		} 
//		
//		System.out.println(num);
		
		long result = 1l;
		for(long i = 15l; i >= 1l; i--) {
			result *= i;
			
		}
		
		System.out.println(result);
		
		System.out.println("\n===========================================================\n");
		
		// Q.02
		
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		
		int count = 0;
		for(int i = 0; i < findWally.length()-1; i++) {
			String wally = findWally.substring(i, i+2);
			if(wally.equals("월리")) {
				count++;
			}
		}
		
		System.out.println(count);
		
		System.out.println("\n===========================================================\n");
		
		// Q.03
		
		String stars = "*****";
		
		for(int i = 0; i < 5; i++) {
			System.out.println(stars.substring(0, 5-i));
		}
		
		System.out.println("\n==========================Solution==================================\n");
		
		// Q.01
		
		// 10 팩토리얼
		// 10 x 9 x 8 x 7 x ... x 1
		int rst = 1;
		for(int i = 10; i >= 1; i--) {
			rst *= i;
		}
		System.out.println(rst);
		
		long lrst = 1;
		for(int i = 15; i >= 1; i--) {
			lrst *= i;
		}
		System.out.println(lrst);
		
		// Q.02
		
		// 월리를 찾아라!!
		
		String findWally1 = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		
//		System.out.println(findWally1.length());
//		System.out.println(findWally1.substring(59,61));  오류 확인
		
		count = 0;
		for(int i = 0; i < findWally1.length()-1; i++){
//			System.out.print(i + ": ");
//			System.out.println(findWally1.substring(i, i+2)); 오류 확인
			String str = findWally1.substring(i, i+2);
			
			if(str.contentEquals("월리")) {
				count++;
			}
		}
		System.out.println("월리의 갯수: " + count);
		
		// Q.03
		
		// i가 		0, 1, 2, 3, 4 일때
		// stars 는 5, 4, 3, 2, 1 개
		// stars.substring(????)의 결과가 5, 4, 3, 2, 1개
		for(int i = 0; i< 5; i++) {
			System.out.println(stars.substring(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
