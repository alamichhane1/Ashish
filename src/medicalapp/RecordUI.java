package medicalapp;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.border.EtchedBorder;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class RecordUI extends JPanel {

	private JEditorPane textAppointment = new JEditorPane();
	private JButton btnNew;
	private JButton btnUpdate;
	private JButton btnDelete;;

	JButton getBtnNew() {

		return btnNew;
	}

	JButton getBtnUpdate() {

		return btnUpdate;
	}

	JButton getBtnDelete() {

		return btnDelete;
	}

	public RecordUI() {

		setBorder(null);
		setLayout(new BorderLayout(0, 0));

		JPanel panelRoot = new JPanel();
		add(panelRoot, BorderLayout.CENTER);
		panelRoot.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panelRoot.add(scrollPane, BorderLayout.CENTER);

		textAppointment.setContentType("text/html");
		scrollPane.setViewportView(textAppointment);
		// textAppointment.setSize(300, 100);
		textAppointment
				.setText("<html>\r\n<b>Appointment #</b>: 456217811\r\nDate: 04/10/2014\r\nTime: 2:00 PM\r\nDuration: 30 Minute\r\nReason: Follow-up\r\nStatus: Confirmed\r\nNote: Copy of blood test - How to set JFrame or JPanel Background Image in Eclipse Helios ... shifting to windows builder for GUI. So will the help from you will work in window builder also? .... Way to logout a user from the command line in OS X 10.9.\r\nDoctor: Kevin Williams\r\nMedical Id: 545424545");
		textAppointment.setEditable(false);

		JPanel panelButtons = new JPanel();
		panelButtons.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelRoot.add(panelButtons, BorderLayout.EAST);
		panelButtons.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

		JPanel panelInner = new JPanel();
		panelButtons.add(panelInner);
		panelInner.setLayout(new GridLayout(0, 1, 0, 15));

		btnNew = new JButton("New");
		panelInner.add(btnNew);

		btnUpdate = new JButton("Update");
		panelInner.add(btnUpdate);

		btnDelete = new JButton("Delete");
		panelInner.add(btnDelete);

	}

	public void setRecordData(String data) {

		this.textAppointment.setText(data);
	}

	public String getRecordData() {

		return this.textAppointment.getText();
	}
}
