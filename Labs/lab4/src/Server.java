import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class Server extends JFrame implements ActionListener{
	private RandomAccessFile raf;
	private int count;

	public static void main() {
		new Server();
	}
	public Server(){
		try {
			ServerSocket serverSocket = new ServerSocket(8000);
			
			System.out.println("Server started");
			
			raf = new RandomAccessFile("count.dat", "rw");
			
			if (raf.length() == 0)
				count = 0;
			else
				count = raf.readInt();
			
			while (true) {
				Socket socket = serverSocket.accept();
				
				DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
				
				count++;
				outputToClient.writeInt(count);
				
				raf.seek(0);
				raf.writeInt(count);
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	
	
}
