import java.applet.Applet;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class client extends JApplet {
	
	private JLabel jlblCount = new JLabel();
	
	private boolean isStandAlone = true;
	
	private String host = "localhost";
	
	@SuppressWarnings("resource")
	public void init() {
		add(jlblCount);
		
		try{
			Socket socket;
			if (isStandAlone)
				socket = new Socket(host, 8000);
			else
				socket = new Socket(getCodeBase().getHost(), 8000);
			
			DataInputStream inputFromServer = new DataInputStream(socket.getInputStream());
			
			int count = inputFromServer.readInt();
			jlblCount.setText("you are visitor number " + count);
			
			inputFromServer.close();
		}
		catch (IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Applet Client");
		
		client applet = new client();
		applet.isStandAlone = true;
		
		if (args.length == 1) applet.host = args[0];
		
		frame.getContentPane().add(applet, java.awt.BorderLayout.CENTER);
		
		applet.init();
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
