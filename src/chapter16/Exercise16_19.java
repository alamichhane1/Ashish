package chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise16_19 extends JPanel {

	// stores the distance between the point and circle.
	static double distance;

	static PointerInfo a = MouseInfo.getPointerInfo(); // Get the information of
														// mouse.
	static Point b = a.getLocation(); // Get the location of the mouse.
	static int x = (int) b.getX(); // get the x co-ordinate of the location.
	static int y = (int) b.getY(); // get the y co-ordinate of the location.

	public Exercise16_19() {

		// the listener that distances if the mouse if moving.
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				// gets the location of the mouse.
				int x = e.getX();
				int y = e.getY();

				// Calculate the distance between the point of mouse and the
				// center.
				distance = Math.pow(Math.pow(x - 100, 2) + Math.pow(y - 60, 2), .5);

			}
		});
	}

	// basic frame setup.
	public static void main(String[] args) {
		JFrame frame = new JFrame("Exercise16_19");
		frame.add(new Exercise16_19());
		frame.setSize(500, 200); // set the size of the frame.
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default close
																// operation
																// selection.
		frame.setVisible(true); // visible set as true.
	}

	// draws the circle.
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(100 - 50, 60 - 50, 50 * 2, 50 * 2); // Draw the circle.
		// checks and prints if the mouse pointer is inside or outside the
		// circle.
		if (distance < 50) {
			g.drawString("Mouse is inside the circle", x, y);
		} else {
			g.drawString("Mouse is outside the circle", x, y);
		}

		repaint(); // repaint the mouse.
	}

}