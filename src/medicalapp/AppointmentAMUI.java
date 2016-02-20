package medicalapp;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class AppointmentAMUI extends JPanel {

	private final JDialog dialog = new JDialog();
	public final static int WIDTH = 450;
	public final static int HEIGHT = 450;

	private String action;
	private String id;

	private JTextField textId;
	private JTextField textDateTime;
	private JTextField textDuration;
	private JTextField textReason;
	private JTextField textStatus;
	private JTextArea textNote;
	private JTextField textDoctorID;
	private JTextField textPatientID;
	private JButton btnSave;
	private JButton btnCancel;
	private JScrollPane scrollPane;

	public AppointmentAMUI(String action, String id) {

		this.action = action;
		this.id = id;		
		setLayout(null);

		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(12, 27, 90, 22);
		add(lblNewLabel);

		textId = new JTextField(id);
		textId.setEditable(false);
		textId.setBounds(114, 27, 179, 22);
		add(textId);
		textId.setColumns(10);

		JLabel lblDateTime = new JLabel("Date & Time:");
		lblDateTime.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDateTime.setBounds(12, 58, 90, 22);
		add(lblDateTime);

		textDateTime = new JTextField();
		textDateTime.setColumns(10);
		textDateTime.setBounds(114, 58, 179, 22);
		add(textDateTime);

		JLabel lblDuration = new JLabel("Duration:");
		lblDuration.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDuration.setBounds(12, 90, 90, 22);
		add(lblDuration);

		textDuration = new JTextField();
		textDuration.setColumns(10);
		textDuration.setBounds(114, 90, 179, 22);
		add(textDuration);

		textReason = new JTextField();
		textReason.setColumns(10);
		textReason.setBounds(114, 121, 179, 22);
		add(textReason);

		JLabel lblReason = new JLabel("Reason:");
		lblReason.setHorizontalAlignment(SwingConstants.RIGHT);
		lblReason.setBounds(12, 121, 90, 22);
		add(lblReason);

		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatus.setBounds(12, 156, 90, 22);
		add(lblStatus);

		textStatus = new JTextField();
		textStatus.setColumns(10);
		textStatus.setBounds(114, 156, 179, 22);
		add(textStatus);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(114, 187, 293, 88);
		add(scrollPane);

		textNote = new JTextArea();
		scrollPane.setViewportView(textNote);
		textNote.setTabSize(4);
		textNote.setLineWrap(true);
		textNote.setColumns(10);

		JLabel lblNote = new JLabel("Note:");
		lblNote.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNote.setBounds(12, 187, 90, 22);
		add(lblNote);

		JLabel lblPatientID = new JLabel("Patient ID:");
		lblPatientID.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPatientID.setBounds(12, 319, 90, 22);
		add(lblPatientID);

		JLabel lblDoctorID = new JLabel("Doctor ID:");
		lblDoctorID.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDoctorID.setBounds(12, 288, 90, 22);
		add(lblDoctorID);

		textDoctorID = new JTextField();
		textDoctorID.setColumns(10);
		textDoctorID.setBounds(114, 288, 179, 22);
		add(textDoctorID);

		textPatientID = new JTextField();
		textPatientID.setColumns(10);
		textPatientID.setBounds(114, 319, 179, 22);
		add(textPatientID);

		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				dialog.setVisible(false);
			}
		});
		btnSave.setBounds(114, 354, 82, 25);
		add(btnSave);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				dialog.setVisible(false);
			}
		});
		btnCancel.setBounds(210, 354, 82, 25);
		add(btnCancel);

	}

	String getTextId() {

		return textId.getText();
	}

	void setTextId(String id) {

		this.textId.setText(id);
	}

	String getTextDateTime() {

		return textDateTime.getText();
	}

	void setTextDateTime(String dateTime) {

		this.textDateTime.setText(dateTime);
	}

	String getTextDuration() {

		return textDuration.getText();
	}

	void setTextDuration(String duration) {

		this.textDuration.setText(duration);
	}

	String getTextReason() {

		return textReason.getText();
	}

	void setTextReason(String reason) {

		this.textReason.setText(reason);
	}

	String getTextStatus() {

		return textStatus.getText();
	}

	void setTextStatus(String status) {

		this.textStatus.setText(status);
	}

	String getTextNote() {

		return textNote.getText();
	}

	void setTextNote(String note) {

		this.textNote.setText(note);
	}

	String getTextDoctorID() {

		return textDoctorID.getText();
	}

	void setTextDoctorID(String doctorID) {

		this.textDoctorID.setText(doctorID);
	}

	String getTextPatientID() {

		return textPatientID.getText();
	}

	void setTextPatientID(String patientID) {

		this.textPatientID.setText(patientID);
	}

	public void setData(String[] fieldValues) {

		this.setTextId(fieldValues[0]);
		this.setTextDateTime(fieldValues[1]);
		this.setTextDuration(fieldValues[2]);
		this.setTextReason(fieldValues[3]);
		this.setTextStatus(fieldValues[4]);
		this.setTextNote(fieldValues[5]);
		this.setTextDoctorID(fieldValues[6]);
		this.setTextPatientID(fieldValues[7]);
	}

	public String[] getData() {

		return new String[] { this.getTextId(),
				this.getTextDateTime(),
				this.getTextDuration(),
				this.getTextReason(),
				this.getTextStatus(),
				this.getTextNote(),
				this.getTextDoctorID(),
				this.getTextPatientID() };
	}

	public void show(boolean status) {

		// this.setSize(WIDTH, HEIGHT);
		dialog.getContentPane().add(this);
		dialog.setModal(true);
		dialog.setTitle(this.action + ": " + this.id);
		dialog.setSize(WIDTH, HEIGHT);
		dialog.setVisible(status);
	}

	public static void main(String[] args) {

		String[] fieldTitles = "ID||Date & Time||Duration||Reason||Status||Note||Doctor ID||Patient ID".split("\\|\\|");
		String[] fieldValues = "470064055||04/15/2014 10:15:00||60||Follow-up||Approved||Need a copy of lab results doesn't work, at least, with a string going in to a log4j statement. Creating an example with a newline at the end is potentially hiding the problem. Also, the String s2 is just confusing usin Need a copy of lab results doesn't work, at least, with a string going in to a log4j statement. Creating an example with a newline at the end is potentially hiding the problem. Also, the String s2 is just confusing usin||252242635||299560622"
				.split("\\|\\|");
		AppointmentAMUI eui = new AppointmentAMUI("Update", fieldValues[0]);
		eui.show(true);
	}

}
