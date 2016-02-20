
package Test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test1 extends JFrame {

	public Test1(){
		MovableMessagePanel p = new MovableMessagePanel ("Welcome to Java");
		setLayout(new BorderLayout());
		add(p);
	}
	
	
	public static void main(String[] args ){
		Test1 frame = new Test1 ();
		frame.setTitle("MoveMessageDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,100);
		frame.setVisible(true);
	}
	static class MovableMessagePanel extends JPanel{
		private String message = "Welcome to Java";
		private int x = 20 ; 
		private int y = 20 ;
		
		public MovableMessagePanel(String s){
			message = s; 
			addMouseMotionListener(new MouseMotionAdapter(){
				public void mouseDragged(MouseEvent e){
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString(message, x, y);
	}
	}
	
}

