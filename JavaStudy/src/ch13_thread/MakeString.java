package ch13_thread;

public class MakeString {

	public static void main(String[] args) {
		// 문자열을 아주 길~~~게 만들어보자
//		StringBuffer strBuff = new StringBuffer();
//		
//		Thread jonghyun = new Thread(() -> {
//			for(int i = 0; i < 50000000; i++) {
//				strBuff.append("1");
//			}
//			System.out.println(strBuff.length());
//		});
//		
//		Thread seoyoung = new Thread(() -> {
//			for(int i = 0; i < 50000000; i++) {
//				strBuff.append("1");
//			}
//			System.out.println(strBuff.length());
//		});
//		
//		jonghyun.start();
//		seoyoung.start();
//		
//		System.out.println(strBuff.length());
		
		System.out.println("\n====================================================================\n");
		
		StringBuilder strBuild = new StringBuilder();
		
		Thread jonghyun2 = new Thread(() -> {
			for(int i = 0; i < 50000000; i++) {
				strBuild.append(1);
			}
			System.out.println(strBuild.length());
		});
		
		Thread seoyoung2 = new Thread(() -> {
			for(int i = 0; i < 50000000; i++) {
				strBuild.append(1);
			}
			System.out.println(strBuild.length());
		});
		
		jonghyun2.start();
		seoyoung2.start();
		
		System.out.println(strBuild.length());
		
		
		
	}

}
