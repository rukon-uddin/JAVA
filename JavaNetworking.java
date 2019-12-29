Client and project must be in a different project
#####CLIENT#####
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("192.168.11.135",6500);
		Scanner sc = new Scanner(System.in);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		String st = sc.nextLine();
		dos.writeUTF(st);
	}
}


######SERVER##########
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws UnknownHostException, IOException {
		ServerSocket ss = new ServerSocket(5505);	
		Socket s = ss.accept(); /// stopper it dont go to the next line until the work is finished
		System.out.println("Connected");
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String st = dis.readUTF();
		System.out.println("From Client: "+st);
	}
}
