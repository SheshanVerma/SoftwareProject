package EECS3311_Project1;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final ArrayList<Shape> Collection = new ArrayList<Shape>();
	 
	public ArrayList<Shape> shapeCollection(){
		return Collection;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Shape o : shapeCollection()) {
			o.draw(g);
		}
	}

}