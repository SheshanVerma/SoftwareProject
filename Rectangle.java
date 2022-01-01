package EECS3311_Project1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle extends Shape{

	public Rectangle( int x, int y, int height, int width, Color colour) {
		this.setX(x);
		this.setY(y);
		this.setHeight(height);
		this.setWidth(width);
		this.setColour(colour);
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getHeight() * this.getWidth();
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(this.getColour());
		g2d.fillRect(this.getX(),this.getY(),this.getWidth(),this.getHeight());
	}
	

}