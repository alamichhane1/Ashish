package chapter16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoanModel extends JFrame implements ActionListener {
	private JTextField loanAmountTextField = new JTextField();
	private JTextField interestRateTextField = new JTextField();
	private JTextField termTextField = new JTextField();
	
	
	private JLabel monthlyPaymentLabel = new JLabel();
	private JLabel totalInterestLabel = new JLabel();
	private JLabel totalPayment = new JLabel();
	
	
	private JButton calculateButton = new JButton("<html><div style = 'color: blue;'>Calculate</div>");
	private JButton resetButton = new JButton("<html><div style = 'color: blue;'>Reset</div>");
	
	public LoanModel(){
		this.setLayout(new BorderLayout());
		
		this.add(new JLabel("<html><div style = 'color: blue; font-size = 18;'>Welcome to CIS 244 INC.</div>",JLabel.CENTER),BorderLayout.NORTH);
		
		JPanel inputJPanel = new JPanel(new GridLayout(6,2,4,4));
		
		inputJPanel.add(new JLabel("<html><div style = 'color: blue; font-size = 12;'>Loan Amount</div>",JLabel.RIGHT));
		inputJPanel.add(this.loanAmountTextField);
		
		inputJPanel.add(new JLabel("<html><div style = 'color: blue; font-size = 12;'>Interest Rate</div>",JLabel.RIGHT));
		inputJPanel.add(this.interestRateTextField);
	
		inputJPanel.add(new JLabel("<html><div style = 'color: blue; font-size = 12;'>Term(in years)</div>",JLabel.RIGHT));
		inputJPanel.add(this.termTextField);
		
		inputJPanel.add(new JLabel("<html><div style = 'color: blue; font-size = 12;'>Monthly Payment</div>",JLabel.RIGHT));
		inputJPanel.add(this.monthlyPaymentLabel);
		
		inputJPanel.add(new JLabel("<html><div style = 'color: blue; font-size = 12;'>Total Interest</div>",JLabel.RIGHT));
		inputJPanel.add(this.totalInterestLabel);
	
		inputJPanel.add(new JLabel("<html><div style = 'color: blue; font-size = 12;'>Total Payment</div>",JLabel.RIGHT));
		inputJPanel.add(this.totalPayment);
		
		
	
		this.add(inputJPanel);
		
		
		JPanel buttonJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonJPanel.add(this.calculateButton);
		buttonJPanel.add(this.resetButton);
		
		this.add(buttonJPanel, BorderLayout.SOUTH);
		
		this.calculateButton.addActionListener(this);
		this.calculateButton.setActionCommand("Calculate");
		
		this.resetButton.addActionListener(this);
		this.resetButton.setActionCommand("Reset");
	}

	public static void main(String[] args) {
		LoanModel frame = new LoanModel();
		frame.setTitle("Loan Model");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if(command.equals("Calculate")){
			if(this.loanAmountTextField.getText().isEmpty()){
				this.showErrorMessage("Loan Amount field can not be empty");
			} else if (this.interestRateTextField.getText().isEmpty()) {
				this.showErrorMessage("Interest Rate field can not be empty");
				
			}else if (this.termTextField.getText().isEmpty()) {
				this.showErrorMessage("Term field can not be empty");
				
			}
			else {
				try{
					double monthlyInterestRate = Double.parseDouble(this.interestRateTextField.getText()) / 1200;
					double loanamount = Double.parseDouble(this.loanAmountTextField.getText());
					int numberOfYears = Integer.parseInt(this.termTextField.getText());
					
					
					double monthlyPayment = loanamount * monthlyInterestRate / (1-(1/Math.pow(1+monthlyInterestRate, numberOfYears  *12)));
					
					this.monthlyPaymentLabel.setText(String.format("$ %.2f", monthlyPayment ));
					
					double totalPayment = monthlyPayment * numberOfYears * 12 ;
					
					double totalInterest = totalPayment - loanamount;
					
					this.totalInterestLabel.setText((String.format("$ %.2f", totalInterest )));
					this.totalPayment.setText((String.format("$ %.2f", totalPayment )));
					
				}
				catch(Exception ex){
					this.showErrorMessage("Ashish, what is going on here");
				}
			}
			
		} else if (command.equals("Reset")){
			if(JOptionPane.showConfirmDialog(null, "Do you really want to reset this field?","Confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
				this.resetField();
			}
			
		}
		
		//JOptionPane.showMessageDialog(null, e.getActionCommand());
		//System.out.println(e.getActionCommand());
		
	}
	
	void showErrorMessage(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	void resetField(){
		this.loanAmountTextField.setText("");
		this.interestRateTextField.setText("");
		this.termTextField.setText("");
		this.totalInterestLabel.setText("");
		this.totalPayment.setText("");
		this.monthlyPaymentLabel.setText("");
	}

}
