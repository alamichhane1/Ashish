package medicalapp;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;


public class PatientUI extends JPanel {
	private JTextField textField;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldAddress;
	private JTextField textFieldCity;
	private JTextField textFieldState;
	private JTextField textFieldZip;
	private JTextField textFieldHomePhone;
	private JTextField textFieldCellPhone;
	private JTextField textFieldDOB;
	private JComboBox comboBox;

	/**
	 * Create the panel.
	 */
	public PatientUI() {
		setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(35, 13, 292, 22);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(46, 48, 90, 22);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(148, 48, 179, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(46, 79, 90, 22);
		add(lblFirstName);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setColumns(10);
		textFieldFirstName.setBounds(148, 79, 179, 22);
		add(textFieldFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(46, 111, 90, 22);
		add(lblLastName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(148, 111, 179, 22);
		add(textFieldLastName);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(148, 142, 179, 22);
		add(textFieldAddress);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setBounds(46, 142, 90, 22);
		add(lblAddress);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(46, 177, 90, 22);
		add(lblCity);
		
		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(148, 177, 179, 22);
		add(textFieldCity);
		
		textFieldState = new JTextField();
		textFieldState.setColumns(10);
		textFieldState.setBounds(148, 208, 179, 22);
		add(textFieldState);
		
		JLabel lblState = new JLabel("State:");
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setBounds(46, 208, 90, 22);
		add(lblState);
		
		JLabel lblZip = new JLabel("Zip:");
		lblZip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZip.setBounds(46, 243, 90, 22);
		add(lblZip);
		
		textFieldZip = new JTextField();
		textFieldZip.setColumns(10);
		textFieldZip.setBounds(148, 243, 179, 22);
		add(textFieldZip);
		
		JLabel lblHomephone = new JLabel("Home Phone:");
		lblHomephone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHomephone.setBounds(46, 274, 90, 22);
		add(lblHomephone);
		
		textFieldHomePhone = new JTextField();
		textFieldHomePhone.setColumns(10);
		textFieldHomePhone.setBounds(148, 274, 179, 22);
		add(textFieldHomePhone);
		
		JLabel lblSpecialty = new JLabel("DOB:");
		lblSpecialty.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSpecialty.setBounds(46, 340, 90, 22);
		add(lblSpecialty);
		
		JLabel lblCellPhone = new JLabel("Cell Phone:");
		lblCellPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCellPhone.setBounds(46, 309, 90, 22);
		add(lblCellPhone);
		
		textFieldCellPhone = new JTextField();
		textFieldCellPhone.setColumns(10);
		textFieldCellPhone.setBounds(148, 309, 179, 22);
		add(textFieldCellPhone);
		
		textFieldDOB = new JTextField();
		textFieldDOB.setColumns(10);
		textFieldDOB.setBounds(148, 340, 179, 22);
		add(textFieldDOB);
		
		JButton btnNew = new JButton("New");
		btnNew.setBounds(71, 375, 65, 25);
		add(btnNew);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(148, 375, 82, 25);
		add(btnModify);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(244, 375, 82, 25);
		add(btnRemove);

	}
}
