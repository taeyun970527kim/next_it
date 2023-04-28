package ch15_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) {
		// 자바에서 파일에 내용 쓰기
		String filePath = "/home/pc11/today/test.txt";
		
		File test = new File(filePath);
		
		// FileOutPutStream(test) -> 기존 파일 내용에 덮어씀
		// FileOutPutStream(test, true) -> 기존 파일 내용에 이어씀
		try(FileOutputStream fos = new FileOutputStream(test, true)) {
			
			String temp = "오늘은 토요일~~~~";
			
			// String 에 .getBytes() 하면 byte[] 로 바꿔줌
			byte[] tempByte = temp.getBytes();
			
//			fos.write(tempByte);
			fos.write("\n월요일도 쉬지롱~~~".getBytes());
			System.out.println("작성 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		// finally {fos.close} 를 해야하는데 try 블록 안에 선언되있어
		// tryWithResouce로 try 소괄호 칸에 close할 변수 선언
		
		
		
	}

}
