package chapter16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoanModelV2 extends JFrame {
	private JTextField loanAmountTextField = new JTextField();
	private JTextField interestRateTextField = new JTextField();
	private JTextField termTextField = new JTextField();
	
	
	private JLabel monthlyPaymentLabel = new JLabel();
	private JLabel totalInterestLabel = new JLabel();
	private JLabel totalPayment = new JLabel();
	
	
	private JButton calculateButton = new JButton("<html><div style = 'color: blue;'>Calculate</div>");
	private JButton resetButton = new JButton("<html><div style = 'color: blue;'>Reset</div>");
	
	public LoanModelV2(){
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
		
		ButtonEvent btevent = new ButtonEvent();
		
		this.calculateButton.addActionListener(btevent);
		this.calculateButton.setActionCommand("Calculate");
		
		this.resetButton.addActionListener(btevent);
		this.resetButton.setActionCommand("Reset");
	}

	public static void main(String[] args) {
		LoanModelV2 frame = new LoanModelV2();
		frame.setTitle("Loan Model");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
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
	
	class ButtonEvent implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String command = e.getActionCommand();
			
			if(command.equals("Calculate")){
				if(LoanModelV2.this.loanAmountTextField.getText().isEmpty()){
					LoanModelV2.this.showErrorMessage("Loan Amount field can not be empty");
				} else if (LoanModelV2.this.interestRateTextField.getText().isEmpty()) {
					LoanModelV2.this.showErrorMessage("Interest Rate field can not be empty");
					
				}else if (LoanModelV2.this.termTextField.getText().isEmpty()) {
					LoanModelV2.this.showErrorMessage("Term field can not be empty");
					
				}
				else {
					try{
						double monthlyInterestRate = Double.parseDouble(LoanModelV2.this.interestRateTextField.getText()) / 1200;
						double loanamount = Double.parseDouble(LoanModelV2.this.loanAmountTextField.getText());
						int numberOfYears = Integer.parseInt(LoanModelV2.this.termTextField.getText());
						
						
						double monthlyPayment = loanamount * monthlyInterestRate / (1-(1/Math.pow(1+monthlyInterestRate, numberOfYears  *12)));
						
						LoanModelV2.this.monthlyPaymentLabel.setText(String.format("$ %.2f", monthlyPayment ));
						
						double totalPayment = monthlyPayment * numberOfYears * 12 ;
						
						double totalInterest = totalPayment - loanamount;
						
						LoanModelV2.this.totalInterestLabel.setText((String.format("$ %.2f", totalInterest )));
						LoanModelV2.this.totalPayment.setText((String.format("$ %.2f", totalPayment )));
						
					}
					catch(Exception ex){
						LoanModelV2.this.showErrorMessage("Ashish, what is going on here");
					}
				}
				
			} else if (command.equals("Reset")){
				if(JOptionPane.showConfirmDialog(null, "Do you really want to reset this field?","Confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
					LoanModelV2.this.resetField();
				}
				
			}
			
			//JOptionPane.showMessageDialog(null, e.getActionCommand());
			//System.out.println(e.getActionCommand());
			
		}
		
	}

}
