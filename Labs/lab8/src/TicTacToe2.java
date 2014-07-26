
import java.awt.*;
import javax.swing.*;

public class TicTacToe2 extends JFrame {
	public TicTacToe2() {
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 3));
		
		for (int i = 0; i < 9; i++) {
			container.add(new Cell());
		}
	}

	
	public static void main(String[] args) {
		
		TicTacToe2 frame = new TicTacToe2();
		frame.setTitle("TicTacToe2");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
	

