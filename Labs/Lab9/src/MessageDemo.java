
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MessageDemo extends JFrame {

	MessagePanel message = new MessagePanel();

	private DisplayPanel panel = new DisplayPanel();

	public MessageDemo() {
		getContentPane().add(message, BorderLayout.CENTER);
		message.setFocusable(true);
	}

	
	public static void main(String[] args) {
		JFrame frame = new MessageDemo();
		frame.setTitle("Message Demo");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public class DisplayPanel  {

		public  DisplayPanel() {
			message.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
				//	System.out.println("Clicking mouse");
					System.out.println("Toggling message from " + message.getCurrentMessage());
					if (message.getCurrentMessage() == message.getMessage1()) {
						message.setCurrentMessage(message.getMessage2());
					} else {
						message.setCurrentMessage(message.getMessage1());
					}
					System.out.println("Toggling message to " + message.getCurrentMessage());
					message.repaint();
					
				}

			});
		}
	}
}

