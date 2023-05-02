package ch15_file;

import java.io.File;

public class TraesureHunter {

	public static void main(String[] args) {
		String path = "/home/pc11/today/treasure";
		
		// treasure 폴더 내 파일을 먼저 찾기!!
		// 선착순 3명
		
		File folder = new File(path);
		
		findFile(folder);
		
		
	} // main 끝
	
	public static void findFile(File folder) {
		File[] inner = folder.listFiles();
		for(int i = 0; i < inner.length; i++) {
			if(inner[i].isDirectory()) {
				// 폴더
				findFile(inner[i]); // 재귀함수
			} else {
				// 파일
				System.out.println(inner[i]);
			}
		}
		
		
	}
	
}
