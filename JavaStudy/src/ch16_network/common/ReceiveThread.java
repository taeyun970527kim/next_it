package ch16_network.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

// 연결된 소켓의 InputSteramd으로 들어온 텍스트 콘솔에 출력
public class ReceiveThread extends Thread {
	private Socket socket;
	
	public ReceiveThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			// 연결된 소켓의 InputStream으로 부터 데이터를 읽어온다.
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				// SendThread의 PrintWriter가 flush할떄까지 대기함
				String msg = reader.readLine();
				System.out.println(msg);
				
				if(msg.equals("대화가 종료되었습니다.")) {
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
}
