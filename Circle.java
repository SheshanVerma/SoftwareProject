package EECS3311_Project1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {

	public Circle(int x, int y, int width, Color colour) {
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(width);
		this.setColour(colour);
	}
	


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double radi = getWidth()/2.0;
		return Math.PI *(Math.pow(radi, 2));
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(this.getColour());
		g2d.fillOval(this.getX(),this.getY(),this.getWidth(),this.getHeight());
		
	}

}