package chapter16;

import java.awt.event.*;
import javax.swing.*;

public class Exercise16_24 extends JFrame {
	private StillClock clock = new StillClock();
	
	public Exercise16_24(){
		setTitle("Exercise16_24");
		getContentPane().setLayout(null);
		ClockAnimation clockAnimation = new ClockAnimation();
		clockAnimation.setBounds(-10008, -10031, 0, 0);
		getContentPane().add ( clockAnimation);
		clockAnimation.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(27, 215, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stop");
		btnNewButton_1.setBounds(305, 215, 89, 23);
		getContentPane().add(btnNewButton_1);
	}
	
	public static void main(String[] args) {

		JFrame frame = new ClockAnimation();
		frame.setTitle("Exercise16_24");
		frame.setSize(500, 200);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
		
	}

