package Test;
import java.awt.*;
import javax.swing.*;

public class DisplayImage extends JPanel {

	public DisplayImage(){
		add (new ImagePanel());
	}
	
	public static void main(String[] args ){
		
		JFrame frame = new DisplayImage();
		frame.setSize(300,300);
		//frame.setLocation(null);
		frame.setVisible(true);
	}
	
	
	
}

class ImagePanel extends JPanel{
	private ImageIcon imageIcon = new ImageIcon("C:/Users/Ashish/Desktop/TrumanCollege/Spring 2016/CIS244/Homework/Homework #4/Card Images/10H.png");
	private Image image = imageIcon.getImage();
	
	protected void paintComponent( Graphics g){
		super.paintComponent(g);
		
		if (image != null ){
			g.drawImage(image, 0, 0, getWidth(), getHeight(),this);
		}
	}
	

}
