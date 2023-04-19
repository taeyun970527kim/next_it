package ch09_class.school;

import ch09_class.commons.UtillClass;

public class Student {
	// 1. 필드 변수 선언 
	// 접근제어자
	// public : 공개, 프로젝트 내부 어디서든 접근 가능
	// private : 비공개, 현재 클래스 내에서만 접근 가능
	// (default) : 기본값, 같은 폴더 내에 있는 클래스에서만 접근 가능
	// 캡슐화는 필드 변수 접근 제어자를 전부 private 로 만든다.
	private String name;
	private int gradeKor;
	private int gradeEng;
	private int gradeMath;
	private double avg;
	
	
	// 2. 생성자 만들기 ( + 기본 생성자)
	public Student() {
		
	}
	
	public Student(String name, int gradeKor, int gradeEng, int gradeMath) {
		this.name = name;
		this.gradeKor = gradeKor;
		this.gradeEng = gradeEng;
		this.gradeMath = gradeMath;
//		this.avg = UtillClass.weRound((gradeKor + gradeEng + gradeMath)/3.0, 1);
		setAvg();
	}
	
	public Student(String name, int gradeKor, int gradeEng, int gradeMath, double avg) {
	this.name = name;
	this.gradeKor = gradeKor;
	this.gradeEng = gradeEng;
	this.gradeMath = gradeMath;
	this.avg = avg;
	}
	
	// 변경된 점수에 대해 평균을 고치는 메소드
	// 현재 클래스 내부에서만 사용되므로 private으로 한다.
	private void setAvg() {
		avg = UtillClass.weRound((gradeKor + gradeEng + gradeMath) / 3.0, 1);
	}
	
	
	
	// 3. toString() 추가
	@Override
	public String toString() {
		return "[" + name + ", 국어: " + gradeKor + ", 영어: " + gradeEng + ", 수학: "
				+ gradeMath + ", 평균: " + avg + "]";
	}
	
	
	
	
	// private 으로 접근을 막은 필드변수에 대해 Getter and Setters로 접근을 허용한다.
	// 단축키 [Alt + Shift + S]
	// Generate Getters and Setters ..
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGradeKor() {
		return gradeKor;
	}
	
	public void setGradeKor(int gradeKor) {
		this.gradeKor = gradeKor;
		setAvg();
	}
	
	public int getGradeEng() {
		return gradeEng;
	}
	
	public void setGradeEng(int gradeEng) {
		this.gradeEng = gradeEng;
		setAvg();
	}
	
	public int getGradeMath() {
		return gradeMath;
	}
	
	public void setGradeMath(int gradeMath) {
		this.gradeMath = gradeMath;
		setAvg();
	}
	
	public double getAvg() {
		return avg;
	}
	
	
	
}