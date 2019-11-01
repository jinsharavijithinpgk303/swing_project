package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Weightcalculation {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double n1;
	double n2;
	String ans1;
	String ans2;
	double r1;
	double r2;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Weightcalculation window = new Weightcalculation();
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
	public Weightcalculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(149, 73, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 121, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(281, 76, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(281, 124, 46, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				n2 = Double.parseDouble(textField_1.getText());
				r1=(n1/3.2808);
				r2=(n2/2.2046);
				ans1 = String.format("%.2f m", r1);
				ans2 = String.format("%.0f kg", r2);
				label.setText(ans1);
				label_1.setText(ans2);
				
				
			}
		});
		btnOk.setBounds(128, 195, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(259, 195, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setBounds(145, 39, 98, 20);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setBounds(299, 42, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(46, 79, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setBounds(46, 127, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(23, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(91, 11, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		
	}
}
