package EECS3311_Project1;
import java.awt.Color;
import java.util.Random;

public class ShapeFactory {


	public static final int NO_OF_SHAPES = 6;
	public static final int SPACE = 10;
	public static final int SHAPE_MIN = 20;

	public static void CreateShape(Panel jPanel) {
		jPanel.shapeCollection().clear();
		int tempX = 15;
		int tempY = 15;


		Random rand = new Random();
		for(int i =0;i<NO_OF_SHAPES; i++) {


			int tempHeight;
			int tempWidth;
			int tempShape;

		
			tempShape  = (int) (Math.random() * 3 ) + 1;
//			System.out.println("TempShape :- " + tempShape);
			tempHeight = rand.nextInt(120);
			tempWidth = rand.nextInt(120);

			while(tempHeight <= 0 && tempWidth <=0 ) {
				tempHeight = rand.nextInt(120);
				tempWidth = rand.nextInt(120);
				
			}
			
           if(tempHeight < SHAPE_MIN) {
        	   tempHeight += SHAPE_MIN;
        			   
           }
           if(tempWidth < SHAPE_MIN) {
        	   tempWidth += SHAPE_MIN;
           }
			int color1 = rand.nextInt(256);
			int color2 = rand.nextInt(256);
			int color3 = rand.nextInt(256);
			Color colour = new Color(color1,color2,color3);
			Shape figure;

			switch(tempShape) {
			case 1:
				//Circle
				figure = new Circle(tempX,tempY,tempWidth,colour);
				break;
			case 2:
				//Rectangle
				figure = new Rectangle(tempX,tempY,tempWidth,tempHeight,colour);
				break;
			case 3:
				//Square
				figure = new Square(tempX,tempY,tempHeight,tempHeight,colour);
				break;
			default:
				figure = null;
				break;
			}
			tempX += 15 + figure.getWidth();
			tempY += 15 + figure.getHeight();

			//Add shape to the arrayliost using jpanel 
			jPanel.shapeCollection().add(figure);
			

		}
		jPanel.repaint();
	}
}