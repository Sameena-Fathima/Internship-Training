package day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
	ServerSocket ss;
	Socket s;
	PrintWriter out;
	BufferedReader br,in;
	public Server() {
		try {
			//till 1024-reserved ports
			ss=new ServerSocket(2800);
			System.out.println("Server ready");
			while(true) {
				s=ss.accept();
				System.out.println(s);
				out=new PrintWriter(s.getOutputStream(),true);
				in=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Please Enter a message to Client: ");
				String msg=in.readLine();
				out.println(msg);
				br=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msgFromClient=br.readLine();
				System.out.println("Message From Client: "+msgFromClient);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}

