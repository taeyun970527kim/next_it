package taeyun.submit09;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMain {

	public static void main(String[] args) {
		// Q.01
		
		
		
		// 2. Product 클래스를 이용하여 객체들을 만들어주세요.
		Product refrigerator = new Product("냉장고", 2000000);
		Product tv = new Product("TV", 1000000);
		Product airConditioner = new Product("에어컨", 800000);
		Product computer = new Product("컴퓨터", 1300000);
//		Product fan = new Product("선풍기", 100000);
		
		// 3. 전자제품들을 ArrayList 객체에 담은 후 가격별로 정렬하여 출력해주세요.
		
		ArrayList<Product> productList = new ArrayList<>();
		
		productList.add(refrigerator);
		productList.add(tv);
		productList.add(airConditioner);
		productList.add(computer);
		productList.add(new Product("선풍기", 100000));
		
//		Collections.sort(productList, (productA, productB) -> productA.getPrice() - productB.getPrice());
		
		for(int k = 0; k < productList.size()-1; k++) {
			for(int i = 0; i < productList.size()-1; i++) {
				if(productList.get(i).getPrice() > productList.get(i+1).getPrice()) {
					Product temp = productList.get(i);
						productList.set(i, productList.get(i+1));
						productList.set(i+1, temp);
				}
			}
		}
		for(int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
		
		// 4. 정렬이 완료된 리스트에서 TV가 몇번째 인덱스인지 찾아내어 출력하시오.
		//    (ArrayList를 순회하면서 담겨져 있는 객체의 name이 TV인 경우 그때의 인덱스를 출력)
		
		for(int i = 0; i < productList.size()-1; i++) {
			if(productList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		
		
		
		
	}

}
