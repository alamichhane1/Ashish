package chapter16;

import java.util.Random;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise16_01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise16_01 frame = new Exercise16_01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercise16_01() {
		setSize(new Dimension(700, 800));
		setTitle("Deck Of Cards");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel_card = new JPanel();
		contentPane.add(panel_card, BorderLayout.CENTER);
		panel_card.setLayout(new GridLayout(0, 4, 0, 0));

		final JLabel label_card1 = new JLabel("");
		label_card1.setSize(new Dimension(500, 726));
		label_card1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_card.add(label_card1);

		final JLabel label_card2 = new JLabel("");
		label_card2.setSize(new Dimension(500, 726));
		panel_card.add(label_card2);

		final JLabel label_card3 = new JLabel("");
		label_card3.setSize(new Dimension(500, 726));
		panel_card.add(label_card3);

		final JLabel label_card4 = new JLabel("");
		label_card4.setSize(new Dimension(500, 726));
		panel_card.add(label_card4);

		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int[] deck = new int[52]; // Create an array named deck to store
				// 52 integers.
				String[] suits = { "S", "H", "D", "C" }; // creating string
				// array named suits
				// to stores spade,
				// heart, diamond
				// and club.
				String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K" }; // creating
				// string array named rank to store the card numbers.

				// Initialize the cards
				for (int i = 0; i < deck.length; i++) {
					deck[i] = i;
				}

				for (int i = 0; i < deck.length; i++) {
					// Generate an index randomly
					Random rn = new Random();
					int index = rn.nextInt(deck.length - 1 - 0 + 1) + 0;
					// Shuffling the deck of card. 
					int temp = deck[i];
					deck[i] = deck[index];
					deck[index] = temp;

				}

				for (int i = 0; i < 4; i++) {
					String suit = suits[deck[i] / 13]; // Generating suit
					String rank = ranks[deck[i] % 13]; // Generating rank

					String name = rank + suit; // setting name as rank + suit. for example, AH.
					// set i1 to the specific image.
					ImageIcon i1 = new ImageIcon(
							"C:/Users/Ashish/Desktop/TrumanCollege/Spring 2016/CIS244/Homework/Homework #4/Card Images/"
									+ name + ".png");  
					// Using switch to display images of randomly generated four cards in four labels.
					switch (i) {
					case 0:
						label_card1.setIcon(i1);

					case 1:
						label_card2.setIcon(i1);

					case 2:
						label_card3.setIcon(i1);
					case 3:
						label_card4.setIcon(i1);
					default:
						break ;
					}

				}

			}
		});
		contentPane.add(btnRefresh, BorderLayout.SOUTH);
	}

}
