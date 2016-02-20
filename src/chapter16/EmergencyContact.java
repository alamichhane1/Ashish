package chapter16;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class EmergencyContact extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFirstName;
	private JTextField textField_1;
	private JComboBox textField_2;
	private JTextField textField_3;
	private JLabel lblHospitalPreference;
	private JTextField textField;
	private JLabel lblInsuranceCompany;
	private JTextField textField_4;
	private JLabel lblPhysicianName;
	private JTextField textField_5;
	private JLabel lblNewLabel_1;
	private JLabel lblPolicyNumber;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblPhoneNumber;
	private JTextArea textField_8;
	private JLabel lblAllergiesifAny;
	private JScrollPane scrollPane;
	private JLabel lblName;
	private JTextField textField_9;
	private JLabel lblRelationship;
	private JTextField textField_10;
	private JLabel lblAddress;
	private JTextArea textField_11;
	private JLabel lblCity;
	private JTextField textField_12;
	private JLabel lblEmergencyContactInfo;
	private JLabel lblState;
	private JComboBox textField_13;
	private JLabel lblHomePhone;
	private JTextField textField_14;
	private JLabel lblWorkPhone;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmergencyContact frame = new EmergencyContact();
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
	public EmergencyContact() {
		setTitle("Emergency Contact Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(10, 14, 110, 14);
		contentPane.add(lblNewLabel);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(143, 14, 121, 20);
		contentPane.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 58, 110, 14);
		contentPane.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 58, 121, 20);
		contentPane.add(textField_1);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 96, 110, 14);
		contentPane.add(lblGender);
		
		textField_2 = new JComboBox();
		textField_2.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		textField_2.setBounds(143, 96, 121, 20);
		contentPane.add(textField_2);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(10, 136, 110, 14);
		contentPane.add(lblDateOfBirth);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 136, 121, 20);
		contentPane.add(textField_3);
		
		lblHospitalPreference = new JLabel("Hospital Preference");
		lblHospitalPreference.setBounds(10, 199, 110, 14);
		contentPane.add(lblHospitalPreference);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(143, 196, 121, 20);
		contentPane.add(textField);
		
		lblInsuranceCompany = new JLabel("Insurance Company");
		lblInsuranceCompany.setBounds(10, 233, 110, 14);
		contentPane.add(lblInsuranceCompany);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(143, 292, 121, 20);
		contentPane.add(textField_4);
		
		lblPhysicianName = new JLabel("Physician Name");
		lblPhysicianName.setBounds(10, 295, 110, 14);
		contentPane.add(lblPhysicianName);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(143, 230, 121, 20);
		contentPane.add(textField_5);
		
		lblNewLabel_1 = new JLabel("Medical Information");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 174, 181, 14);
		contentPane.add(lblNewLabel_1);
		
		lblPolicyNumber = new JLabel("Policy Number");
		lblPolicyNumber.setBounds(10, 264, 110, 14);
		contentPane.add(lblPolicyNumber);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(143, 261, 121, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(143, 329, 121, 20);
		contentPane.add(textField_7);
		
		lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(10, 332, 110, 14);
		contentPane.add(lblPhoneNumber);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 376, 122, 51);
		contentPane.add(scrollPane);
		
		textField_8 = new JTextArea();
		scrollPane.setViewportView(textField_8);
		textField_8.setColumns(10);
		
		lblAllergiesifAny = new JLabel("Allergies (if any)");
		lblAllergiesifAny.setBounds(10, 379, 110, 14);
		contentPane.add(lblAllergiesifAny);
		
		lblName = new JLabel("Name");
		lblName.setBounds(382, 38, 87, 14);
		contentPane.add(lblName);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(479, 35, 150, 20);
		contentPane.add(textField_9);
		
		lblRelationship = new JLabel("Relationship");
		lblRelationship.setBounds(382, 72, 87, 14);
		contentPane.add(lblRelationship);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(479, 69, 150, 20);
		contentPane.add(textField_10);
		
		lblAddress = new JLabel("Address");
		lblAddress.setBounds(382, 103, 87, 14);
		contentPane.add(lblAddress);
		
		textField_11 = new JTextArea();
		textField_11.setColumns(10);
		textField_11.setBounds(479, 100, 150, 79);
		contentPane.add(textField_11);
		
		lblCity = new JLabel("City");
		lblCity.setBounds(382, 193, 87, 14);
		contentPane.add(lblCity);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(479, 190, 150, 20);
		contentPane.add(textField_12);
		
		lblEmergencyContactInfo = new JLabel("Emergency Contact Info");
		lblEmergencyContactInfo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmergencyContactInfo.setBounds(382, 13, 181, 14);
		contentPane.add(lblEmergencyContactInfo);
		
		lblState = new JLabel("State");
		lblState.setBounds(382, 230, 87, 14);
		contentPane.add(lblState);
		
		textField_13 = new JComboBox();
		textField_13.setBounds(479, 227, 150, 20);
		contentPane.add(textField_13);
		
		lblHomePhone = new JLabel("Home Phone");
		lblHomePhone.setBounds(382, 261, 87, 14);
		contentPane.add(lblHomePhone);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(479, 258, 150, 20);
		contentPane.add(textField_14);
		
		lblWorkPhone = new JLabel("Work Phone");
		lblWorkPhone.setBounds(382, 295, 87, 14);
		contentPane.add(lblWorkPhone);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(479, 292, 150, 20);
		contentPane.add(textField_15);
	}
}
