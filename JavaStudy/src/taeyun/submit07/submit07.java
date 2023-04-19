package taeyun.submit07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class submit07 {

	public static void main(String[] args) {

		// Q.01

//		정수를 담을 수 있는 ArrayList 객체를 생성하고, 10부터 20 사이의 랜덤 숫자를 10개 담으시오. (10도 나오고 20도 나올 수 있어야 함)
//		
//		10번 반복하는 for문에서 매번 10부터 20 사이의 랜덤 숫자를 얻어서(randInt) 해당 
		ArrayList<Integer> intList = new ArrayList<>();
		
			for(int i = 0; i < 10; i++) {
				int randint = (int)((Math.random() * 11) +10);
				intList.add(randint);
			}
			
			System.out.println(intList);
			
//			해당 정수형 리스트에서 중복된 숫자들을 제거한 후 출력하시오.
//			새로운 빈 리스트 만드시고, 거기에 중복되지 않게끔 값들을 옮기세요.
			
		ArrayList<Integer> result = new ArrayList<>();
			for(int i = 0; i < intList.size(); i++) {
				if(!result.contains(intList.get(i))) {
					result.add(intList.get(i));
				}
			}
			System.out.println(result);
			
//		ArrayList<Integer> newList = new ArrayList<>();
//			for(int i = 0; i < intList.size(); i++) {
//				// newList안에 현재의 inList.get(i)가 존재하지 않는 경우에만 추가해주기
//				if(!newList.contains(intList.get(i))) {
//					newList.add(intList.get(i));
//				}
//				System.out.println(newList);
			
			// 중복 제거 두번째 방법
			for(int i = 0; i < intList.size(); i++) {
				
				for(int k = intList.size()-1; k > i; k--) {
					if(intList.get(i) == intList.get(k)) {
						intList.remove(k);
					}
				}
			}
			System.out.println(intList);
			
//			중복을 제거한 정수형 리스트를 오름차순으로 정렬하여 출력하시오.
			
			Collections.sort(result);
			System.out.println(result);
			
//			중복을 제거한 정수형 리스트를 내림차순으로 정렬하여 출력하시오.
			
			Collections.sort(result,Collections.reverseOrder());
			System.out.println(result);
			
			System.out.println("\n=====================================================\n");
			
		// Q. 02
		
//		아내가 사고 싶은 물건  ["냉장고", "로봇청소기", "세탁기", "에어컨"] 을 리스트에 담아주세요.
		
		ArrayList<String> wife = new ArrayList<>(Arrays.asList("냉장고", "로봇청소기", "세탁기", "에어컨"));
		
//		남편이 사고 싶은 물건 ["노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"] 을 다른 리스트에 담아주세요.
		
		ArrayList<String> husband = new ArrayList<>(Arrays.asList("노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"));
		
//		1. 서로 사고 싶은 물건 목록을 새로운 리스트에 담아 콘솔에 출력해주세요(교집합)
		
		ArrayList<String> coincides = new ArrayList<>();
		for(int i = 0; i < wife.size(); i++) {
			if(husband.contains(wife.get(i))) {
				coincides.add(wife.get(i));
			}
		} System.out.println(coincides);
		
		// 교집합을 위한 메소드 .retainAll()
		coincides.clear();
		coincides.addAll(wife); // 아내의 구매목록 전부를 담기
		coincides.retainAll(husband);
		System.out.println(coincides);
		
//		2. 사고 싶은걸 다 산다고 했을때의 구매 목록을 새로운 리스트에 담아 콘솔에 출력해주세요(합집합)
		
		ArrayList<String> bothOfThemNeeds = new ArrayList<>();
		bothOfThemNeeds.addAll(wife);
		for(int i = 0; i < husband.size(); i++) {
			if(!bothOfThemNeeds.contains(husband.get(i))) {
				bothOfThemNeeds.add(husband.get(i));
			}
		} System.out.println(bothOfThemNeeds);
		
//		@. 숫자 a부터 b 사이의 랜덤 정수를 리턴해주는 메소드를 만들어보세요
		
		int rand = makeRandom(10, 20);
		System.out.println(rand);
		
		
		// 15부터 30 사이의 랜덤 숫자를 10개 담기
				// (int)(Math.random) * ? + ?
				// 0 ~ 16 =>> (int)(Math.random * 16) 
				// 15 ~ 30 =>> (int)(Math.random * 16) + 15
				// 10 ~ 20 =>> (int)(Math.random * 11) + 10
		
	}
	public static int makeRandom(int A, int B) {
		int rand = 0;
		for(int i = 0; i <= 1; i++) {
			int random = (int)((Math.random() * ((B-A) + 1)) + A);
			rand = random;
		} return rand;
		
	} 
	
//	public static int makeRandom(int a, int b) {
//		return (int)((Math.random() * ((B-A) + 1)) + A);
//	}
	
	
}
