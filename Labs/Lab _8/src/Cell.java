import java.awt.Graphics;

import javax.swing.JPanel;


class Cell extends JPanel {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
		int mode = (int)(Math.random()* 3);
		
		if (mode == 0) {
			g.drawLine(10, 10, getWidth() - 10, getHeight() - 10);
			g.drawLine(getWidth() - 10, 10, 10, getHeight() - 10);
		}
		
		else if (mode == 1) {
			g.drawOval(10, 10, getWidth() - 20, getHeight() - 20);
		}
		}
	}
