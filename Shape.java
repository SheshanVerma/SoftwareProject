package EECS3311_Project1;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Comparable<Shape>{
        private int x;
        private int y;
        private int height;
        private int width;
        private Color colour;
        
        public abstract double getArea();
        public abstract void draw(Graphics g);

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public Color getColour() {
			return colour;
		}

		public void setColour(Color colour) {
			this.colour = colour;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}
		@Override
		public int compareTo(Shape o) {
			// TODO Auto-generated method stub
			double Areadiff = this.getArea() - o.getArea();
			if(Areadiff > 0) {
				return 1;
			}
			else if (Areadiff < 0) {
				return -1;
			}
			else {
			return 0;
		}
		
		}
}
