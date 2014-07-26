import javax.swing.*;

import java.awt.*;

public class test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame window = new JFrame("Lab 8");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(400,500);
		window.setSize(300,300);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel0 = new JPanel();
		
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn0 = new JButton("1");
		
		panel1.add(btn1);
		panel2.add(btn2);
		panel3.add(btn3);
		panel4.add(btn4);
		panel5.add(btn5);
		panel6.add(btn6);
		panel7.add(btn7);
		panel8.add(btn8);
		panel9.add(btn9);
		panel0.add(btn0);
		
		
		
		window.getContentPane().add(panel1);
		window.getContentPane().add(panel2);
		window.getContentPane().add(panel3);
		window.getContentPane().add(panel4);
		window.getContentPane().add(panel5);
		window.getContentPane().add(panel6);
		window.getContentPane().add(panel7);
		window.getContentPane().add(panel8);
		window.getContentPane().add(panel9);
		window.getContentPane().add(panel0);

		
		window.setVisible(true);
		
		
		
	}

}
