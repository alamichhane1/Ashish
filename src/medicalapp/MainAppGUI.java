package medicalapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class MainAppGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnAppointment;
	private JButton btnDoctors;
	private JButton btnPatients;

	private DoctorUI doctorUI = new DoctorUI();
	private PatientUI patientUI = new PatientUI();

	private JPanel paneMainContent;

	private final ActionListener addMainAppListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			refreshMainApp();

		}
	};

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					MainAppGUI frame = new MainAppGUI();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setSize(800, 800);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainAppGUI() {

		setResizable(false);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panelNav = new JPanel();
		contentPane.add(panelNav, BorderLayout.WEST);
		panelNav.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 25));

		JPanel panel = new JPanel();
		panelNav.add(panel);
		panel.setLayout(new GridLayout(0, 1, 10, 10));

		btnAppointment = new JButton("Appointment");
		btnAppointment.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {

				showUIPanel(ae.getActionCommand());
			}
		});
		panel.add(btnAppointment);

		btnDoctors = new JButton("Doctors");
		panel.add(btnDoctors);
		btnDoctors.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {

				showUIPanel(ae.getActionCommand());
			}
		});

		btnPatients = new JButton("Patients");
		panel.add(btnPatients);
		btnPatients.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {

				showUIPanel(ae.getActionCommand());
			}
		});

		paneMainContent = new JPanel();
		contentPane.add(paneMainContent, BorderLayout.CENTER);
		paneMainContent.setLayout(new CardLayout(0, 0));

		this.loadUIPanel();

	}

	void showUIPanel(String paneName) {

		CardLayout clayout = (CardLayout) (this.paneMainContent.getLayout());
		clayout.show(this.paneMainContent, paneName);
	}

	void refreshMainApp() {

		this.paneMainContent.removeAll();
		this.loadUIPanel();

		this.contentPane.revalidate();
		this.contentPane.repaint();
	}

	void loadUIPanel() {

		JScrollPane scrollPaneAppointment = new JScrollPane();

		AppointmentUI appointmentUI = new AppointmentUI(this.addMainAppListener);
		scrollPaneAppointment.setViewportView(appointmentUI);

		this.paneMainContent.add(scrollPaneAppointment, this.btnAppointment.getText());
		this.paneMainContent.add(this.doctorUI, this.btnDoctors.getText());
		this.paneMainContent.add(this.patientUI, this.btnPatients.getText());
	}

}
