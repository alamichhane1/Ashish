package chapter16;
import java.awt.*;
import javax.swing.*;

public class PICK extends JFrame {
	
	private JLabel jlblCard_1 = new JLabel("");
	private JLabel jlblCard_2 = new JLabel("");
	private JLabel jlblCard_3 = new JLabel("");
	private JLabel jlblCard_4 = new JLabel("");
	private JButton jbtRefresh = new JButton("Refresh");
	
	public PICK(){

		JPanel cardpanel = new JPanel();
		
		cardpanel.add(jlblCard_1, new FlowLayout() );
		cardpanel.add(jlblCard_2, new FlowLayout() );
		cardpanel.add(jlblCard_3, new FlowLayout() );
		cardpanel.add(jlblCard_4, new FlowLayout() );
		
		
		JPanel panel = new JPanel();
		
		panel.add(jlblCard_1);
		panel.add(jlblCard_2);
		panel.add(jlblCard_3);
		panel.add(jlblCard_4);
		panel.add(jbtRefresh);
		
		
		this.add(panel,BorderLayout.SOUTH);
		
		
	}
	
	public static void main(String[] args) {	
		
		PICK picknew = new PICK();
		picknew.setTitle("PICK FOUR CARDS");
		picknew.setSize(500,500);
		picknew.setLocationRelativeTo(null);
		picknew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		picknew.setVisible(true);
	

	}

}
