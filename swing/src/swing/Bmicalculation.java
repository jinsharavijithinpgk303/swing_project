package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class Bmicalculation {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bmicalculation window = new Bmicalculation();
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
	public Bmicalculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 492, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(31, 371, 378, 75);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(78, 91, 248, -46);
		frame.getContentPane().add(panel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(50, 205, 50));
		panel_3.setBounds(31, 22, 378, 58);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBodyMassIndex.setBounds(133, 11, 130, 24);
		panel_3.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(50, 205, 50));
		panel_1.setBounds(31, 128, 380, 197);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m)");
		lblHeightm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHeightm.setBounds(50, 34, 57, 14);
		panel_1.add(lblHeightm);
		
		textField = new JTextField();
		textField.setBounds(144, 32, 144, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblWeightkg = new JLabel("Weight(kg)");
		lblWeightkg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWeightkg.setBounds(50, 82, 71, 14);
		panel_1.add(lblWeightkg);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 80, 144, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBmi.setBounds(50, 129, 38, 14);
		panel_1.add(lblBmi);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(50, 163, 89, 23);
		panel_1.add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(167, 163, 89, 23);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(281, 163, 89, 23);
		panel_1.add(btnExit);
		
		JLabel label = new JLabel("");
		label.setBounds(115, 129, 46, 14);
		panel_1.add(label);
	}
}
