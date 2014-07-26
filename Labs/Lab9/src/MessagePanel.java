
import java.awt.*;
import java.awt.FontMetrics;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

public class MessagePanel extends JPanel {
	
	String message1 = "Im you Father";
	String message2 = "Luke";
	String currentMessage = message1;
	
	int xCoordinate = 20;
	
	int yCoordinate = 20;
	
	private boolean centered;
	
	private int interval = 10;

	
	public MessagePanel() {
	}

	
	public MessagePanel(String message1, String message2) {
		this.message1 = message1;
		this.message2 = message2;
	}

	
	public String getMessage1() {
		return message1;
	}

	
	public void setMessage1(String message) {
		this.message1 = message1;
		repaint();
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
		repaint();
	}

	
	public int getXCoordinate() {
		return xCoordinate;
	}

	
	public void setXCoordinate(int x) {
		this.xCoordinate = x;
		repaint();
	}

	
	public int getYCoordinate() {
		return yCoordinate;
	}

	
	public void setYCoordinate(int y) {
		this.yCoordinate = y;
		repaint();
	}


	public boolean isCentered() {
		return centered;
	}


	public void setCentered(boolean centered) {
		this.centered = centered;
		repaint();
	}


	public int getInterval() {
		return interval;
	}


	public void setInterval(int interval) {
		this.interval = interval;
		repaint();
	}


	public void paintComponent(Graphics g) {
		System.out.println("firing paintComponent: " + currentMessage);
		super.paintComponent(g);
		if (!centered) {
			// Get font metrics for the current font
			FontMetrics fm = g.getFontMetrics();
			// Find the center location to display
			int stringWidth = fm.stringWidth(currentMessage);
			int stringAscent = fm.getAscent();
	

			xCoordinate = getWidth() / 2 - stringWidth / 2;
			yCoordinate = getHeight() / 2 + stringAscent / 2;
		}
		g.drawString(currentMessage, xCoordinate, yCoordinate);
	}

	public String getCurrentMessage() {
		return currentMessage;
	}

	public void setCurrentMessage(String currentMessage) {
		this.currentMessage = currentMessage;
	}

	
	public void toggleMessage() {
		System.out.println("Toggling message from " + currentMessage);
		if (currentMessage == message1) {
			currentMessage = message2;
		} else {
			currentMessage = message1;
		}
		System.out.println("Toggling message to " + currentMessage);
		repaint();

	}

	
	public Dimension getPreferredSize() {
		return new Dimension(200, 30);
	}
}
