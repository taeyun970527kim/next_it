package ch13_thread;

public class ThreadMain {

	public static void main(String[] args) {
		// 10
		// 11
		// 12
		// 13
		// 14
		int num = 10;
		for(int i = 0; i < 5; i++) {
			System.out.println(num ++);
		}
		
		// 50
		// 51
		// 52
		// 53
		// 54
		num = 50;
		for(int i = 0; i < 5; i++) {
			System.out.println(num ++);
		}
		
		System.out.println("\n====================================================================\n");
		
//		ThreadMain thread = new ThreadMain(); // static 안 붙히면 객체 생성을 해주어야함
//		thread.printNumber(50);

//		ThreadMain.printNumber(10); // main문에서 사용하려면 static 붙여야함
//		printNumber(50); 
		
		
		// 기본적으로 쓰레드를 나눠주지 않으면 메인 쓰레드 하나만 일을 해서 위에서부터 차례대로 코드가 실행된다.
		
		System.out.println("\n====================================================================\n");
		
		// 1. Thread를 상속받는 클래스를 만들어서 멀티 쓰레드를 구현하기
		// 멀티 스레드를 구현하기
		
		MyStaff junho = new MyStaff(10, "준호"); // 쓰레드 B
		MyStaff yujung = new MyStaff(50, "유정"); // 쓰레드 C
		
		// .start() 를 해주면 해당 쓰레드의 run 메소드가 실행된다
		
		junho.start();
		yujung.start();
		
		// 다른 쓰레드에게 일을 줄때 인지해야하는 것은
		// 해당 쓰레드들이 언제 일이 끝날지 모른 상태로 일을 준다
		System.out.println("[메인 쓰레드] 업무 분담 끝");
		
		System.out.println("\n====================================================================\n");
		
		// 2. Runnable 인터페이스를 구현(implements)한 클래스를 이용
		
		RunStaff donguk = new RunStaff("동욱", 80);
		Thread dongukT = new Thread(donguk);
		dongukT.start(); // RunStaff 내 run 메소드가 실행된다
		
		
		// 간략하게
		Thread dongyun = new Thread(new RunStaff("동윤", 100));
		dongyun.start();
		
		// 람다식 사용
		
		Thread jihye = new Thread(() ->  {
			int num2 = 140;
			for(int i = 0; i < 5; i++) {
				System.out.println("지혜: " + num2++);
				
				try {
					// 현재 이 코드를 실행중인 쓰레드가 멈추는 것
					// 다른 쓰레드는 영향을 받지 않는다.
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		jihye.start();
		
		System.out.println("[메인 쓰레드] 전 이만 퇴근~");
		
	} // main 끝
	
	public static void printNumber(int num) {
		for(int i = 0; i < 5; i++) {
			System.out.println(num ++);
			
			try {
				// 현재 이 코드를 실행중인 쓰레드가 멈추는 것
				// 다른 쓰레드는 영향을 받지 않는다.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}