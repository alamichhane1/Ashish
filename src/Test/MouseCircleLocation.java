package Test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseCircleLocation extends JPanel {

	static double check ;
//boolean insideCircleStatus;

static PointerInfo a = MouseInfo.getPointerInfo();
static Point b = a.getLocation();
static int x = (int) b.getX();
static int y = (int) b.getY();

public MouseCircleLocation() {

    //the listener that checks if the mouse if moving.
    addMouseMotionListener(new MouseAdapter() {
        @Override
        public void mouseMoved(MouseEvent e) {

            //gets the location of the mouse.
            int x = e.getX();
            int y = e.getY();

            // Calculate the distance between the point of mouse and the center. 
            check = Math.pow(Math.pow(x-100, 2) + Math.pow(y-60, 2), .5);
          
        }
    });
}

//basic frame setup.
public static void main(String[] args) {
    JFrame frame = new JFrame("Exercise16_19");
    frame.add(new MouseCircleLocation());
    frame.setSize(210, 190);
    frame.setLocationRelativeTo(null); // Center the frame   
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);   
}

//draws the circle.
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawOval(100 - 50, 60 - 50, 50 *2, 50 * 2);
    if ( check < 50 ){
		g.drawString("Mouse is inside the circle", x, y);
	} else {
		g.drawString("Mouse is outside the circle", x,y );
	}
    
    repaint();
  }

static void check(Graphics g){
	
}
}