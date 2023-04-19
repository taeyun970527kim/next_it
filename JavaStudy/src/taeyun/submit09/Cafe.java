package taeyun.submit09;

import taeyun.submit09.Coffee;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

	private String cafeName; // 카페이름 
	private ArrayList<Coffee> menuList = new ArrayList<>(); // 음료 리스트
	
	
	public Cafe() {}
	
	public Cafe(String name) {
		this.cafeName = name;
	}
	
	public Cafe(String cafeName, ArrayList<Coffee> menuList) {
		this.cafeName = cafeName;
		this.menuList = menuList;
	}
	
	// 커피 메뉴를 추가한다
	public void addCoffee(Coffee cf) {
		menuList.add(cf);
	}	
	
	// 메뉴판을 출력하는 메소드
	public void showMenu() {
		for(int i = 0; i < menuList.size(); i++) {
			System.out.println((i+1) + "." + menuList.get(i));
			
		}
	}
	
	// 커피 구매
	public void buyCoffee(Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴를 선택해주세요 : ");
		int choice = Integer.parseInt(sc.nextLine());
		
		System.out.println(menuList.get(choice - 1).getName() + "를 " + menuList.get(choice - 1).getPrice() + "원에 구매했습니다.");
		
	}
	
	@Override
	public String toString() {
		return "Cafe [cafeName=" + cafeName + ", menuList=" + menuList + "]";
	}
	
	public String getCafeName() {
		return cafeName;
	}
	
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	
	public ArrayList<Coffee> getMenuList() {
		return menuList;
	}
	
	public void setMenuList(ArrayList<Coffee> menuList) {
		this.menuList = menuList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
