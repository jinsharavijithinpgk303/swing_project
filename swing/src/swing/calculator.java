package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	double result;
	double num1;
	double num2;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 407, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("1");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()+button.getText();
			textField.setText(Number);
			}
		});
		button.setBounds(42, 101, 55, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()+button_1.getText();
			textField.setText(Number);
			}
		});
		button_1.setBounds(120, 101, 55, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(200, 101, 48, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setForeground(Color.RED);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_3.getText();
				textField.setText(Number);
				
			}
				
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_3.setBounds(42, 135, 55, 23);
		frame.getContentPane().add(button_3);
		 {
			}
		JButton button_4 = new JButton("5");	
		button_4.setForeground(Color.RED);
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_4.setBounds(120, 135, 55, 23);
		frame.getContentPane().add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()+button_4.getText();
			textField.setText(Number);
			}
		});
		
		
		
		JButton button_5 = new JButton("6");
		button_5.setForeground(Color.RED);
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_5.setBounds(200, 135, 48, 23);
		frame.getContentPane().add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()+button_5.getText();
			textField.setText(Number);
			}
		});
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setForeground(Color.RED);
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_6.setBounds(42, 169, 55, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setForeground(Color.RED);
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_7.setBounds(120, 169, 55, 23);
		frame.getContentPane().add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_8 = new JButton("9");
		button_8.setForeground(Color.RED);
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_8.setBounds(200, 169, 48, 23);
		frame.getContentPane().add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_9 = new JButton("0");
		button_9.setForeground(Color.RED);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_9.setBounds(42, 203, 57, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.setForeground(Color.RED);
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_10.setBounds(120, 203, 55, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result = num1+num2;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result = num1-num2;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result = num1*num2;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result = num1/num2;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result = num1%num2;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				
				
			}
		});
		button_11.setForeground(Color.RED);
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_11.setBounds(200, 203, 48, 23);
		frame.getContentPane().add(button_11);
		
		
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText(null);
			}
		});
		btnC.setForeground(Color.RED);
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnC.setBounds(42, 237, 55, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB.setForeground(Color.RED);
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnB.setBounds(120, 237, 55, 23);
		frame.getContentPane().add(btnB);
		
		JButton button_12 = new JButton("+");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "+";
				
			}
		});
		button_12.setForeground(Color.RED);
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_12.setBounds(272, 101, 48, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.setForeground(Color.RED);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "-";

				
			}
		});
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_13.setBounds(272, 135, 48, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("*");
		button_14.setForeground(Color.RED);
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "*";
			}
		});
		button_14.setBounds(272, 169, 48, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.setForeground(Color.RED);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "/";
			}
		});
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_15.setBounds(272, 203, 48, 23);
		frame.getContentPane().add(button_15);
		
		textField = new JTextField();
		textField.setBounds(31, 30, 310, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_16 = new JButton("%");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "%";
			}
		});
		button_16.setForeground(Color.RED);
		button_16.setBounds(272, 237, 48, 23);
		frame.getContentPane().add(button_16);
	}

}
