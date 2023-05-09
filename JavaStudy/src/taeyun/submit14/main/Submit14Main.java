package taeyun.submit14.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import taeyun.submit14.service.ExplanationService;
import taeyun.submit14.service.NextStudentService;
import taeyun.submit14.service.QuestionService;
import taeyun.submit14.vo.ExplanationVO;
import taeyun.submit14.vo.NextStudentVO;
import taeyun.submit14.vo.QuestionVO;

public class Submit14Main {

	public static void main(String[] args) {
		
		NextStudentService NextService = NextStudentService.getInstance();
		QuestionService questionService = QuestionService.getInstance();
		ExplanationService explanationService = ExplanationService.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>>");
			int command = 0;
			try {
				command = Integer.parseInt(scan.nextLine());
				System.out.println("");
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
			
			if(command == 1) {
				// 회원가입
				System.out.print("이름을 입력해주세요: ");
				String name = scan.nextLine();
				System.out.println("");
				
				System.out.print("아이디를 입력해주세요: ");
				String id = scan.nextLine();
				System.out.println("");
				
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = scan.nextLine();
				System.out.println("");
				
				NextService.registStudent(name, id, pw);
				
			} else if(command == 2) {
				// TODO 로그인
				System.out.print("아이디를 입력해주세요: ");
				String id = scan.nextLine();
				System.out.println("");
				
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = scan.nextLine();
				System.out.println("");
				
				NextStudentVO student = new NextStudentVO(id, pw);
				
				NextStudentVO login = NextService.login(student);
				
				ArrayList<QuestionVO> wrongList = new ArrayList<>();
				ArrayList<QuestionVO> sub1WrongList = new ArrayList<>();
				ArrayList<QuestionVO> sub2WrongList = new ArrayList<>();
				ArrayList<QuestionVO> sub3WrongList = new ArrayList<>();
				ArrayList<QuestionVO> sub4WrongList = new ArrayList<>();
				ArrayList<QuestionVO> sub5WrongList = new ArrayList<>();
				
				if(login.getStuId() != null) {
					// 성공
					System.out.println("로그인 되었습니다.");
					while(true) {
						System.out.println("행동을 선택해주세요");
						System.out.println("1. 문제 풀기 | 2. 오답노트 보기 | 3. 로그아웃");
						System.out.print(">>> ");
						System.out.println("");
						
						int select = 0;
						try {
							select = Integer.parseInt(scan.nextLine());
							System.out.println("");
						} catch (NumberFormatException e) {
							System.out.println("숫자만 입력해주세요.");
						}
						
						
						
						if(select == 1) {
							// TODO 문제풀기
							System.out.println("어떤 과목 문제를 푸시겠습니까?");
							System.out.println("1. 소프트웨어 설계 | 2. 소프트웨어 개발 | 3. 데이터베이스 구축 | 4. 프로그래밍 언어 활용 | 5. 정보시스템 구축관리");
							System.out.print(">>> ");
							System.out.println("");
							int subject = 0;
							try {
								subject = Integer.parseInt(scan.nextLine());
								System.out.println("");
							} catch (NumberFormatException e) {
								e.printStackTrace();
							}
							
							
							if(subject == 1) {
								// 소프트웨어 설계 문제
								ArrayList<QuestionVO> sub1List = questionService.q_sub1();
								
								Collections.shuffle(sub1List);
								
								for(int i = 0; i < 20; i++) {
									QuestionVO question = sub1List.get(i);
									System.out.println(question);
									
									System.out.print("정답을 입력해주세요: ");
									int answer = 0;
									try {
										answer = Integer.parseInt(scan.nextLine());
										System.out.println("");
										
									} catch (NumberFormatException e) {
										System.out.println("숫자만 입력해주세요.");
									}
									
									ExplanationVO exp = explanationService.getExplain(question);
									
									if(answer == exp.getAnswer()) {
										// 정답
										
									} else if(answer != exp.getAnswer()) {
										// 틀림
										wrongList.add(question);
										
									}
								}
							} else if(subject == 2) {
								// 소프트웨어 개발 문제
								ArrayList<QuestionVO> sub2List = questionService.q_sub2();
								
								Collections.shuffle(sub2List);
								
								for(int i = 0; i < sub2List.size(); i++) {
									QuestionVO question = sub2List.get(i);
									System.out.println(question);
									
									System.out.print("정답을 입력해주세요: ");
									int answer = 0;
									try {
										answer = Integer.parseInt(scan.nextLine());
										System.out.println("");
									} catch (NumberFormatException e) {
										System.out.println("숫자만 입력해주세요.");
									}
									
									ExplanationVO exp = explanationService.getExplain(question);
									
									if(answer == exp.getAnswer()) {
										// 정답
									} else if(answer != exp.getAnswer()) {
										// 틀림
										wrongList.add(question);
									}
								}
							} else if(subject == 3) {
								// TODO 데이터베이스 구축 문제
								
							} else if(subject == 4) {
								// TODO 프로그래밍 언어 활용 문제
								
							} else if(subject == 5) {
								// TODO 정보시스템 구축 문제
							}
							
						} else if(select == 2) {
							 // 오답노트 보기
//							System.out.println("오답노트를 보실 과목을 선택해주세요.");
//							System.out.println("1. 소프트웨어 설계 | 2. 소프트웨어 개발 | 3. 데이터베이스 구축 | 4. 프로그래밍 언어 활용 | 5. 정보시스템 구축관리");
//							System.out.print(">>> ");
//							System.out.println("");
//							int subject = 0;
//							try {
//								subject = Integer.parseInt(scan.nextLine());
//								System.out.println("");
//							} catch (NumberFormatException e) {
//								e.printStackTrace();
//							}
								ArrayList<ExplanationVO> wrongExpList = new ArrayList<>();
								System.out.println("총 " + wrongList.size() + "개 틀리셨습니다.");
								for(int i = 0; i < wrongList.size(); i++) {
									wrongExpList.add(explanationService.getExplain(wrongList.get(i)));
									}
								for(int i = 0; i < wrongList.size(); i++) {
									System.out.println(wrongList.get(i).getNum() + "번 문제, " + wrongList.get(i).getQuestion());
								}
								
								System.out.print("해설을 보시려면 해당 문제 번호를 입력해주세요: ");
								int q_num = 0;
								try {
									q_num = Integer.parseInt(scan.nextLine());
								} catch (NumberFormatException e) {
									System.out.println("숫자만 입력해주세요.");
								}
								
									for(int i = 0; i < wrongList.size(); i++) {
										if(q_num == wrongList.get(i).getNum()) {
											System.out.println(wrongList.get(i));
											System.out.println("해설: " + wrongExpList.get(i).getExplain());
										} else {
											
										}
									}
							
						} else if(select == 3) {
							// 로그아웃
							break;
						} else {
							System.out.println("다시 입력해주세요.");
						}
						
					} 
				} else {
					// 실패
					System.out.println("회원 정보가 올바르지 않습니다.");
				}
			} else if(command == 3) {
				// 종료
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
			
		}
		
	} // 메인문


}
