package medicalapp;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class DoctorUI extends JPanel {

	private JTextField textFieldId;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldAddress;
	private JTextField textFieldCity;
	private JTextField textFieldState;
	private JTextField textFieldZip;
	private JTextField textFieldHomePhone;
	private JTextField textFieldCellPhone;
	private JTextField textFieldSpecialty;
	private JButton btnNew;
	private JButton btnModify;
	private JButton btnRemove;

	JButton getBtnNew() {

		return btnNew;
	}

	JButton getBtnModify() {

		return btnModify;
	}

	JButton getBtnRemove() {

		return btnRemove;
	}

	JTextField getTextFieldId() {

		return textFieldId;
	}

	JTextField getTextFieldFirstName() {

		return textFieldFirstName;
	}

	JTextField getTextFieldLastName() {

		return textFieldLastName;
	}

	JTextField getTextFieldAddress() {

		return textFieldAddress;
	}

	JTextField getTextFieldCity() {

		return textFieldCity;
	}

	JTextField getTextFieldState() {

		return textFieldState;
	}

	JTextField getTextFieldZip() {

		return textFieldZip;
	}

	JTextField getTextFieldHomePhone() {

		return textFieldHomePhone;
	}

	JTextField getTextFieldCellPhone() {

		return textFieldCellPhone;
	}

	JTextField getTextFieldSpecialty() {

		return textFieldSpecialty;
	}

	public DoctorUI() {

		setLayout(null);

		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(43, 28, 90, 22);
		add(lblNewLabel);

		textFieldId = new JTextField();
		textFieldId.setBounds(145, 28, 179, 22);
		add(textFieldId);
		textFieldId.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(43, 59, 90, 22);
		add(lblFirstName);

		textFieldFirstName = new JTextField();
		textFieldFirstName.setColumns(10);
		textFieldFirstName.setBounds(145, 59, 179, 22);
		add(textFieldFirstName);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(43, 91, 90, 22);
		add(lblLastName);

		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(145, 91, 179, 22);
		add(textFieldLastName);

		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(145, 122, 179, 22);
		add(textFieldAddress);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setBounds(43, 122, 90, 22);
		add(lblAddress);

		JLabel lblCity = new JLabel("City:");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(43, 157, 90, 22);
		add(lblCity);

		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(145, 157, 179, 22);
		add(textFieldCity);

		textFieldState = new JTextField();
		textFieldState.setColumns(10);
		textFieldState.setBounds(145, 188, 179, 22);
		add(textFieldState);

		JLabel lblState = new JLabel("State:");
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setBounds(43, 188, 90, 22);
		add(lblState);

		JLabel lblZip = new JLabel("Zip:");
		lblZip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZip.setBounds(43, 223, 90, 22);
		add(lblZip);

		textFieldZip = new JTextField();
		textFieldZip.setColumns(10);
		textFieldZip.setBounds(145, 223, 179, 22);
		add(textFieldZip);

		JLabel lblHomephone = new JLabel("Home Phone:");
		lblHomephone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHomephone.setBounds(43, 254, 90, 22);
		add(lblHomephone);

		textFieldHomePhone = new JTextField();
		textFieldHomePhone.setColumns(10);
		textFieldHomePhone.setBounds(145, 254, 179, 22);
		add(textFieldHomePhone);

		JLabel lblSpecialty = new JLabel("Specialty:");
		lblSpecialty.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSpecialty.setBounds(43, 320, 90, 22);
		add(lblSpecialty);

		JLabel lblCellPhone = new JLabel("Cell Phone:");
		lblCellPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCellPhone.setBounds(43, 289, 90, 22);
		add(lblCellPhone);

		textFieldCellPhone = new JTextField();
		textFieldCellPhone.setColumns(10);
		textFieldCellPhone.setBounds(145, 289, 179, 22);
		add(textFieldCellPhone);

		textFieldSpecialty = new JTextField();
		textFieldSpecialty.setColumns(10);
		textFieldSpecialty.setBounds(145, 320, 179, 22);
		add(textFieldSpecialty);

		btnNew = new JButton("New");
		btnNew.setBounds(68, 355, 65, 25);
		add(btnNew);

		btnModify = new JButton("Modify");
		btnModify.setBounds(145, 355, 82, 25);
		add(btnModify);

		btnRemove = new JButton("Remove");
		btnRemove.setBounds(241, 355, 82, 25);
		add(btnRemove);

	}

	public static void showDialog() {

		DoctorUI dui = new DoctorUI();
		JDialog dialog = new JDialog();
		dialog.getContentPane().add(dui);
		dialog.setSize(360, 440);
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

}
