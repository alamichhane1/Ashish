package medicalapp;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class RecordGUs extends JPanel {

	public final static int WIDTH = 450;
	public final static int HEIGHT = 200;
	private final static String TableStyle = " style='border-collapse:collapse; width:400px;'";
	private final static String TableTRStyle = " valign='top'";
	private final static String TableTDStyle = " style='font-weight:bold; width:75px;'";
	private ActionListener[] actionList;

	public RecordGUs(ActionListener[] al) {

		this.actionList = al;
	}

	public JPanel getRecordGUs(String[] fieldTitles, String[][] fieldValues) {

		JPanel root = new JPanel();
		root.setLayout(new BoxLayout(root, BoxLayout.Y_AXIS));

		for (int i = 0; i < fieldValues.length; i++) {

			RecordUI rui = new RecordUI();
			rui.setSize(WIDTH, HEIGHT);
			root.add(rui);

			StringBuilder sb = new StringBuilder();
			sb.append("<html>");
			sb.append("<table " + TableStyle + " >");
			// sb.append(System.getProperty("line.separator"));

			for (int j = 0; j < fieldTitles.length; j++) {
				sb.append("<tr " + TableTRStyle + " >");
				sb.append("<td " + TableTDStyle + " >" + fieldTitles[j] + ":</td>");
				sb.append("<td>" + fieldValues[i][j] + "</td>");
				sb.append("</tr>");
				// sb.append(System.getProperty("line.separator"));
			}
			sb.append("</table>");
			rui.setRecordData(sb.toString());

			JButton btnNew = rui.getBtnNew();
			JButton btnUpdate = rui.getBtnUpdate();
			JButton btnDelete = rui.getBtnDelete();

			final String id = fieldValues[i][0];

			btnNew.setActionCommand("new||new");
			btnUpdate.setActionCommand("update||" + id);
			btnDelete.setActionCommand("delete||" + id);

			btnUpdate.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent ae) {

					if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Are you sure you want to update " + id + " this record?", "Confirm",
							JOptionPane.YES_NO_OPTION)) {
						if (actionList[0] != null) {
							actionList[0].actionPerformed(ae);
						}
					}

				}
			});

			btnNew.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent ae) {

					if (actionList[1] != null) {
						actionList[1].actionPerformed(ae);
					}

				}
			});

			btnDelete.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent ae) {

					if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + id + " this record?", "Confirm",
							JOptionPane.YES_NO_OPTION)) {
						if (actionList[2] != null) {
							actionList[2].actionPerformed(ae);
						}
					}

				}
			});

			// System.out.println(sb.toString());

		}

		return root;
	}
}
