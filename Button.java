package EECS3311_Project1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button extends JPanel implements ActionListener{
   
	 /**
	 * 
	 */
	 private static final long serialVersionUID = 1L;
	
	 private JButton button1;
	 private JButton button2;
	 private Panel panel;
	 
	 public Button (Panel panel) {
		 super(new FlowLayout());
		 
		 button1 = new JButton("Load Shapes:");
		 button2 = new JButton("Sort Shapes:");
		 
		 button1.addActionListener(this);
		 button2.addActionListener(this);
		 
		 button1.setActionCommand("Load Shapes:");
		 button2.setActionCommand("Sort Shapes:");
		 
		 
		 button2.setEnabled(false);
		 
		 this.add(button1);
		 this.add(button2);
		 this.panel = panel;
		 
	 }
	 
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand() == "Load Shapes:") {
			ShapeFactory.CreateShape(panel);
			button2.setEnabled(true);
			
		}
		else if(e.getActionCommand() == "Sort Shapes:") {
			sortingTechnique.areaSort(panel);
			button2.setEnabled(false);
		}
		
	}

}