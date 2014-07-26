
import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {

	private ImageIcon cross = new ImageIcon("C:\\Documents and Settings\\Administrator\\Desktop x.gif");
	ImageIcon not = new ImageIcon("C:\\Documents and Settings\\Administrator\\Desktop o.gif");
	
	public TicTacToe(){
			
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 3));
		
		for (int i = 1; i < 10; i++) {
			int mode = (int)(Math.random() * 3);
			if (mode == 0){
				container.add(new JLabel(cross));
			}
			else if (mode == 1){
				container.add(new JLabel(not));
			}
			else
				container.add(new JLabel());
		}
	}
	
	public static void main(String[] args) {
		TicTacToe frame = new TicTacToe();
		frame.setTitle("Tic Tac Toe");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

