package medicalapp;

import java.awt.event.*;
import java.util.Arrays;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AppointmentUI extends JPanel {

	private final static DataLayer dlayer = DataLayer.instance(DataLayer.AppointmentData);
	private String[][] data = dlayer.getData();
	private String[] fieldTitles = data[0];

	private ActionListener addAppointmentListener = null;
	private ActionListener updateAppointmentListener = null;
	private ActionListener deleteAppointmentListener = null;
	private JPanel rootPanel;
	private ActionListener mainAppListener;

	public AppointmentUI(ActionListener mainAppListener) {

		this.mainAppListener = mainAppListener;

		this.addAppointmentListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				actionAppointmentPerformed(e);

			}
		};

		this.updateAppointmentListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				actionAppointmentPerformed(e);

			}
		};

		this.deleteAppointmentListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				actionAppointmentPerformed(e);

			}
		};

		this.add(this.getGUI());
	}

	public void actionAppointmentPerformed(ActionEvent ae) {

		String command = ae.getActionCommand();
		String id = "";

		if (command.contains("new")) {
			AppointmentAMUI aamui = new AppointmentAMUI("Add", Utility.generateID());
			
			aamui.show(true);
			
			String[] newFieldValues = aamui.getData();
			
			dlayer.add(newFieldValues);
			
			this.mainAppListener.actionPerformed(ae);
		}
		else if (command.contains("update")) {
			id = command.split("\\|\\|")[1];
			System.out.println("Update Appointment: " + id);
			String[] fieldValues = dlayer.findRecord(id);
			
			//System.out.println(Arrays.toString(this.fieldTitles));
			//System.out.println(Arrays.toString(fieldValues));
			
			//EditorUI eui = new EditorUI(fieldTitles, fieldValues, "Update", fieldValues[0]);
			//eui.show(true);
			AppointmentAMUI aamui = new AppointmentAMUI("Update", fieldValues[0]);
			aamui.setData(fieldValues);
			aamui.show(true);
			
			String[] modifiedFieldValues = aamui.getData();
			
			dlayer.update(modifiedFieldValues);
			
			//System.out.println(Arrays.toString(modifiedFieldValues));
			
			this.mainAppListener.actionPerformed(ae);
			
		}
		else if (command.contains("delete")) {
			id = command.split("\\|\\|")[1];
			
			dlayer.delete(id);
			
			//System.out.println("Delete Appointment: " + id);
			//System.out.println(Arrays.toString(this.data[1]));
			this.mainAppListener.actionPerformed(ae);

		}

	}

	void refresh() {

		getGUI();
	}

	public JPanel getGUI() {

		String[][] fieldValues = new String[data.length - 1][];

		for (int i = 0; i < fieldValues.length; i++)
			fieldValues[i] = data[i + 1];

		rootPanel = null;
		RecordGUs rgusObj = new RecordGUs(new ActionListener[] { addAppointmentListener, updateAppointmentListener, deleteAppointmentListener });
		rootPanel = rgusObj.getRecordGUs(fieldTitles, fieldValues);

		return rootPanel;

	}

}
