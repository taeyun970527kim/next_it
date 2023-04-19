package ch09_class.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ch09_class.commons.UtillClass;

public class SchoolMain {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학, 평균 점수를 가지는 학생 객체
		Student yesl = new Student("예슬", 85, 80, 87, (85 + 80 + 87)/3.0);
		System.out.println(yesl);
		
		// 캡슐화 적용
		// 같은 폴더 내에 있는 클래스라면 private 빼곤 다 접근 가능
		
		// avg에 대한 Setter를 지워서 평균은 수정할 수 없도록 한다.
//		yesl.setAvg(100);
		System.out.println(yesl);
		
		System.out.println(yesl.getGradeKor());
		System.out.println(yesl.getAvg());
		
		// 국어 점수 바꾸기
		yesl.setGradeKor(93);
		System.out.println(yesl);
		
		System.out.println("\n=====================================================\n");
		
		Student taeyun = new Student("태윤", 90, 80, 84, UtillClass.weRound((90 + 80 + 84)/3.0, 1));
		System.out.println(taeyun);
		
		taeyun.setGradeEng(86);
		System.out.println(taeyun);
		
		// 평균을 넣지 않아도 적용되도록 생성자 추가 
		Student kim = new Student("김", 90, 89, 76);
		System.out.println(kim);
		
		System.out.println("\n=====================================================\n");
		
		ArrayList<Student> stuList = new ArrayList<>();
		
		stuList.add(yesl);
		stuList.add(taeyun);
		stuList.add(new Student("동윤", 80, 82, 88));
		stuList.add(new Student("지혜", 89, 88, 92));
		stuList.add(new Student("준호", 80, 82, 77));
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		System.out.println("\n=====================================================\n");
		
		// 학생들의 평균을 이용해서 정렬
		// 1등. 이름 ----
		// 2등. 이름 ----
		// ...
		
		for(int i = 0; i < stuList.size()-1; i++) {
			for(int k = 0; k < stuList.size()-1; k++) {
				if(stuList.get(k).getAvg() < stuList.get(k+1).getAvg()) {
					Student temp = stuList.get(k);
						stuList.set(k,stuList.get(k+1));
						stuList.set(k+1, temp);
				}
			}
		}
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등. " + stuList.get(i));
		}
		
		System.out.println("\n=====================================================\n");
		
		//Collections.sort()
		Collections.sort(stuList, new Comparator<Student>() {
			@Override
			public int compare(Student stuA, Student stuB) {
				double diff = stuB.getAvg() - stuA.getAvg();
				// 양의 소수, 음의 소수
				if(diff < 0) {
					// 음의 정수를 리턴
					return -1;
				}
				return 1;
				
				
			}
		});
		
		// 람다식
		Collections.sort(stuList, (stuA, stuB) -> (stuB.getAvg() - stuA.getAvg() > 0) ? (1) : (-1));
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등. " + stuList.get(i));
		}
		
		
		
		
	}

}
