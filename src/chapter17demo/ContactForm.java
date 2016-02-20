package chapter17demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactForm extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldAddress;
	private JTextField textFieldCity;
	private JTextField textFieldEmail;
	private JTextArea textField_5;
	private JTextField textFieldState;
	private JTextField textFieldZIP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactForm frame = new ContactForm();
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
	public ContactForm() {
		setType(Type.UTILITY);
		setTitle("Contact Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(655,485);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblContact.setBounds(10, 11, 143, 39);
		contentPane.add(lblContact);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(59, 61, 94, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(59, 86, 94, 14);
		contentPane.add(lblLastName);
		
		JLabel lblEmail = new JLabel("Address");
		lblEmail.setBounds(59, 116, 94, 14);
		contentPane.add(lblEmail);
		
		JLabel lblContactNumber = new JLabel("City");
		lblContactNumber.setBounds(59, 144, 94, 14);
		contentPane.add(lblContactNumber);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setBounds(59, 169, 94, 14);
		contentPane.add(lblEmail_1);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(163, 58, 142, 20);
		contentPane.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(163, 83, 142, 20);
		contentPane.add(textFieldLastName);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(163, 113, 142, 20);
		contentPane.add(textFieldAddress);
		
		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(163, 141, 142, 20);
		contentPane.add(textFieldCity);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(163, 166, 142, 20);
		contentPane.add(textFieldEmail);
		
		JLabel lblMessage = new JLabel("Message");
		lblMessage.setBounds(59, 196, 94, 14);
		contentPane.add(lblMessage);
		
		JScrollPane scrollPaneMessage = new JScrollPane();
		scrollPaneMessage.setBounds(165, 193, 208, 97);
		contentPane.add(scrollPaneMessage);
		
		textField_5 = new JTextArea();
		textField_5.setLocation(163, 0);
		scrollPaneMessage.setColumnHeaderView(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(317, 144, 28, 14);
		contentPane.add(lblState);
		
		textFieldState = new JTextField();
		textFieldState.setColumns(10);
		textFieldState.setBounds(355, 141, 69, 20);
		contentPane.add(textFieldState);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setBounds(453, 144, 28, 14);
		contentPane.add(lblZip);
		
		textFieldZIP = new JTextField();
		textFieldZIP.setColumns(10);
		textFieldZIP.setBounds(479, 141, 69, 20);
		contentPane.add(textFieldZIP);
		
		JLabel lblNewLabel_1 = new JLabel("All the above fields are required.");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 14));
		lblNewLabel_1.setBounds(59, 331, 347, 39);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ContactForm.this.textFieldFirstName.getText().isEmpty()){
					showMessage("First Name required");
				} else if (ContactForm.this.textFieldLastName.getText().isEmpty())
					showMessage("Last Name required");
				;
				
			}
		});
		btnSubmit.setBounds(163, 401, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null,"Are you sure you want to reset all fields ?","Confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
					ContactForm.this.textFieldFirstName.setText( "") ;
				}
			}
		});
		btnCancel.setBounds(284, 401, 89, 23);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ContactForm.class.getResource("/javax/swing/plaf/basic/icons/image-delayed.png")));
		lblNewLabel_2.setBounds(393, 196, 45, 88);
		contentPane.add(lblNewLabel_2);
		
	}
	
	void  showMessage(String msg){
		JOptionPane.showMessageDialog(null, msg);
	
}

}