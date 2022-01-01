package EECS3311_Project1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		Panel panel = new Panel();
		Button buttonsForScreen = new Button(panel);
		JFrame frame = new JFrame("Display shapes and sort them!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.add(buttonsForScreen,BorderLayout.NORTH);
		frame.setMinimumSize(new Dimension(250,275));
		frame.setSize(600,600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}