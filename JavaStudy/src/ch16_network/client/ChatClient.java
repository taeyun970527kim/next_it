package ch16_network.client;

import java.io.IOException;
import java.net.Socket;

import ch16_network.common.ReceiveThread;
import ch16_network.common.SendThread;

public class ChatClient {

	public static void main(String[] args) {
		// 소켓 통신의 클라이언트
		
		// 서버소켓에 연결한 소켓 객체 생성
		// 생성자에 서버소켓의 ip와 포트번호를 넣어준다
		try {
			Socket clientSocket = new Socket("192.168.1.39", 5001);
			System.out.println("접속 성공");
			System.out.println(clientSocket.getRemoteSocketAddress());
			
			SendThread send = new SendThread(clientSocket);
			send.start();
			ReceiveThread receive = new ReceiveThread(clientSocket);
			receive.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 네트워크 -> 데이터 교환을 목적으로 연결되는 컴퓨터의 구조
		// IP -> 인터넷 주소이며 각각의 컴퓨터에 부여되는 고유주소
		// 포트 -> 각각의 프로그램에 부여되는 주소이며 1~1023 예약된 시스템 포트 주소를 제외한 65000까지의 포트번호를 부여해줄수있다
		// 프로토콜 -> 클라이언트와 서버간의 통신규약
		// 클라이언트 -> 서버에 요청을 보내고 데이터를 받아오는 컴퓨터
		// 서버 -> 클라이언트로부터 요청이오면 요청에 맞는 데이터를 보낼 준비가 되어있는 컴퓨터
		// 소켓 -> 서버 프로그램으로 연결 요청을 보내고 데이터를 전송하는 객체
		// 서버소켓 -> 서버 프로그램에서 사용하는 소켓으로 클라이언트가 요청해오는 소켓을 대기하고 연결하는 객체
		
		
		
	}

}
