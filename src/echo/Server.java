package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		//서버 소켓 객체 생성
		ServerSocket serverSocket = new ServerSocket(); //힙영역. class 메소드가 다양하게 있겠지 //2번째 ServerSocket

		//ip 포트번호 설정해주어야 한다. 192.168.168.104(유동IP),10001(포트번호:내 텀퓨터 안의 방번호..개발자가 설정..임의로 정함.) //회사에서는 고정IP를 구매한다. 바뀌지 않도록 
		serverSocket.bind(new InetSocketAddress("192.168.168.104",10001));
		
		System.out.println("<서버시작>");
		System.out.println("=========================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		//accept //실행되면 6번까지 실행이 된 것이다.
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트가 연결되었습니다.");
		
		//socket <-> socket 종이컵 전화기
		//메세지 받기용 스트림 step 2
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		String msg = br.readLine();
		System.out.println("받은메세지:"+ msg);
		
		//메세지 보내기용 스트림 step 3
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw =new OutputStreamWriter(os,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
	
		//메세지 보내기
		bw.write(msg);
		bw.newLine();
		bw.flush();
		
		//자원종료
		bw.close();
		br.close();
		
		System.out.println("==============");
		System.out.println("<서버종료>");
		serverSocket.close();
	
	}

}
