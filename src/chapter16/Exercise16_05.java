package chapter16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise16_05 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldInvestmentAmount;
	private JTextField textFieldYears;
	private JTextField textFieldAnnualInterestRate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise16_05 frame = new Exercise16_05();
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
	public Exercise16_05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setBounds(10, 25, 123, 14);
		contentPane.add(lblInvestmentAmount);

		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(10, 53, 123, 14);
		contentPane.add(lblYears);

		JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate");
		lblAnnualInterestRate.setBounds(10, 84, 123, 14);
		contentPane.add(lblAnnualInterestRate);

		JLabel lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setBounds(10, 126, 123, 14);
		contentPane.add(lblFutureValue);

		final JLabel lblvalue = new JLabel("");
		lblvalue.setBounds(191, 126, 97, 14);
		contentPane.add(lblvalue);

		textFieldInvestmentAmount = new JTextField();
		textFieldInvestmentAmount.setBounds(163, 22, 125, 20);
		contentPane.add(textFieldInvestmentAmount);
		textFieldInvestmentAmount.setColumns(10);

		textFieldYears = new JTextField();
		textFieldYears.setColumns(10);
		textFieldYears.setBounds(163, 53, 125, 20);
		contentPane.add(textFieldYears);

		textFieldAnnualInterestRate = new JTextField();
		textFieldAnnualInterestRate.setColumns(10);
		textFieldAnnualInterestRate.setBounds(163, 84, 125, 20);
		contentPane.add(textFieldAnnualInterestRate);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					// Setting the double value in textFieldInvestmentAmount
					// text field to investmentAmount variable.
					double investmentAmount = Double.parseDouble(textFieldInvestmentAmount.getText());
					// Setting the integer value in textFieldYears text field to
					// years variable.
					int years = Integer.parseInt(textFieldYears.getText());
					// Grabbing the double value from
					// textFieldAnnaulInterestRate text field and divide by 1200
					// to make it monthly and set it to monthlyInterestRate
					// variable.
					double monthlyInterestRate = Double.parseDouble(textFieldAnnualInterestRate.getText()) / 1200;
					// Calculating the value of futureValue
					double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
					// Setting value of futureValue to the lblvalue label.
					lblvalue.setText(String.format("$ %.2f", futureValue));

				} catch (Exception ex) {

					// If the textFieldInvestmentAmount is empty generates the
					// error message.
					if (textFieldInvestmentAmount.getText().isEmpty()) {
						showErrorMessage("Investment Amount cannot be empty");
						// If the textFieldYears is empty generates the error
						// message.
					} else if (textFieldYears.getText().isEmpty()) {
						showErrorMessage("Years can not be empty");
						// If the textFieldAnnualInterestRate is empty generates
						// the error message.
					} else if (textFieldAnnualInterestRate.getText().isEmpty()) {
						showErrorMessage("Annual Interest Rate can not be empty");

					}
				}
			}
		});
		btnCalculate.setBounds(163, 175, 125, 23);
		contentPane.add(btnCalculate);
	}

	// Method to show the error message.
	void showErrorMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
}
