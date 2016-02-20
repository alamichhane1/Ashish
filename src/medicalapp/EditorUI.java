package medicalapp;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class EditorUI extends JPanel {

	public final static int WIDTH = 450;
	public final static int HEIGHT = 500;
	private final JDialog dialog = new JDialog();
	private JButton btnSave;
	private JButton btnCancel;
	private String action;
	private String id;

	public EditorUI(String[] fieldTitles, String[] fieldValues, String action, String id) {

		this.action = action;
		this.id = id;
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		// scrollPane.setBounds(0, 0, 450, 465);
		add(scrollPane);

		JPanel panelContent = new JPanel();
		scrollPane.setViewportView(panelContent);
		//panelContent.setLayout(new GridLayout(0, 1, 4, 4));
		panelContent.setLayout(new BoxLayout(panelContent, BoxLayout.Y_AXIS));
		

		for (int i = 0; i < fieldTitles.length; i++) {
			JLabel label = new JLabel(fieldTitles[i]);
			panelContent.add(label);

			JTextField text = new JTextField(fieldValues[i]);
			text.setSize(100, 28);
			panelContent.add(text);

		}
		this.setSize(WIDTH, HEIGHT);

		JPanel panelButtons = new JPanel();
		add(panelButtons, BorderLayout.SOUTH);

		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				dialog.setVisible(false);
			}
		});
		panelButtons.add(btnSave);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				dialog.setVisible(false);
			}
		});
		panelButtons.add(btnCancel);
	}

	public void show(boolean status) {

		// this.setSize(WIDTH, HEIGHT);
		// JScrollPane scrollPane = new JScrollPane(this);
		// scrollPane.setSize(WIDTH, HEIGHT);
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
		EditorUI eui = new EditorUI(fieldTitles, fieldValues, "Update", fieldValues[0]);
		eui.show(true);
	}

}
