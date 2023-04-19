package taeyun.submit02;

import java.util.Scanner;

public class submit02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>> ");
		
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>> ");
		
		int gradeKorean = Integer.parseInt(scan.nextLine());
		
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>> ");
		
		int gradeEnglish = Integer.parseInt(scan.nextLine());
		
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>> ");
		
		int gradeMath = Integer.parseInt(scan.nextLine());
		
//		float gradeSum = (gradeKorean + gradeEnglish + gradeMath) / 3f;
//		double gradeSum = (gradeKorean + gradeEnglish + gradeMath) / 3;
		double gradeSum = (gradeKorean + gradeEnglish + gradeMath) / 3d;
		
//		String sumGrade = (gradeSum) >= 90 ? ("A") : ((gradeSum) > 80) ? ("B") : ("C");
		
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + gradeKorean);
		System.out.println("영어: " + gradeEnglish);
		System.out.println("수학: " + gradeMath);
		System.out.println("평균: " + String.format("%.2f", gradeSum));
//		System.out.println("등급: " + sumGrade);
		int sumGrade = (int)(Math.round(gradeSum));
		if(sumGrade >= 90) {
			System.out.println("등급: " + "A");
		} else if(90 > sumGrade && sumGrade >= 80) {
			System.out.println("등급: " + "B");
		} else {
			System.out.println("등급: " + "C");
		}
		
		System.out.println("\n============== Q. 02 =================\n");
		
		String idBack = "131476";
		
		String str1 = idBack.substring(0,1);
		
		int Int1 = Integer.parseInt(str1);
		
		String check = ((Int1 % 2) == 1) ? "남성" : "여성";
		
		System.out.println(check);
		
//		System.out.println("\n============== Solution =================\n");
//		
//		 // Q. 01
//		Scanner scan1 = new Scanner(System.in);
//		
//		System.out.println("이름을 입력해주세요");
//		System.out.print(">>> ");
//		String name1 = scan.nextLine();
//		
//		System.out.println("국어 점수를 입력");
//		System.out.print(">>> ");
//		int kor = Integer.parseInt(scan.nextLine());
//		
//		System.out.println("영어 점수를 입력");
//		System.out.print(">>> ");
//		int eng = Integer.parseInt(scan.nextLine());
//		
//		System.out.println("수학 점수를 입력");
//		System.out.print(">>> ");
//		int math = Integer.parseInt(scan.nextLine());
//		
//		System.out.println("이름: " + name1);
//		System.out.println("국어: " + kor);
//		System.out.println("영어: " + eng);
//		System.out.println("수학: " + math);
//		
//		double avg = (double)(kor + eng + math) / 3;
////		double avg = (kor + eng + math) / (double)3;
////		double avg = (kor + eng + math) / 3.0;
//		System.out.println("평균: " + avg);
//		
//		// @ 
//		// 소수점 ?자리는 printf로 실행
//		System.out.printf("평균: %.2f\n" , avg); // 줄바꿈 해주어야함
//		
//		
//		String grade = (avg >= 90) ? ("A") : ( (avg >= 80) ? ("B") : ("C") );
//		System.out.println("등급: " + grade);
//		
//		// Q.02
//		
//		String idBackN = "1231487";
//		
//		String first = idBackN.substring(0, 1);
//		System.out.println(first);
//		
////		char start = idBackN.charAt(0); // char 타입으로 바꾸면 문자열로 다시 변환해야함
////		System.out.println(start);
////		String strStart = start + ""; // char + "" 문자를 문자열로 바꿀때 사용
////		System.out.println(strStart);
//		
//		int num = Integer.parseInt(first);
////		int num = Integer.parseInt(strStart);
//		
//		String gender = (num % 2 == 1) ? ("남") : ("여");
////		String gender = (num % 2 == 0) ? ("여") : ("남");
//		System.out.println(gender);
		
		
		
		
		
		
	}

}
