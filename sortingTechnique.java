package EECS3311_Project1;

import java.util.ArrayList;


public class sortingTechnique{
	


public static void areaSort(Panel panel) {
	
    ArrayList<Shape> o = panel.shapeCollection();
    int NumberOfshapes = o.size();
    
    for(int i =0; i < NumberOfshapes -1; i++) {
    	for(int j =0; j < NumberOfshapes - i -1; j++) {
    		if(o.get(j).compareTo(o.get(j+1)) > 0) {
    			Shape res = o.get(j);
    			o.set(j,o.get(j+1));
    			o.set(j+1, res);
    		}
    	}
    }
    OrganiseShape(panel);
}	
private static void OrganiseShape(Panel panel) {
	int tempx =10;
	int tempy =10;
	for(Shape s : panel.shapeCollection()) {
		s.setX(tempx); 
		s.setY(tempy);
		tempx += 10 + s.getWidth();
		tempy += 10 + s.getHeight();
		
	}
	panel.repaint();
}

}
