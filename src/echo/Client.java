package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {
		
		//소켓 생성
		Socket socket = new Socket();
		
		System.out.println("<클라이언트 시작>");
		System.out.println("=============================");
		System.out.println("[서버에 연결을 요청합니다.]");

		socket.connect(new InetSocketAddress("192.168.168.104",10001));
		System.out.println("서버에 연결이 되었습니다.");
		
		//socket <-> socket 종이컵 전화기
		//메세지 보내기 step 1
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw =new OutputStreamWriter(os,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		bw.write("안녕하세요");  
		bw.newLine();
		bw.flush();
		
		//메세지 받기용 스트림 step 4
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		String reMsg = br.readLine();
		System.out.println("Server:["+ reMsg + "]");
		
		sc.close();
		bw.close();
		br.close();
		
		System.out.println("==============");
		System.out.println("<클라이언트종료>");
		socket.close();
	}
}
