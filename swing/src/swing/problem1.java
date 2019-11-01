package swing;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;

public class problem1 {

private JFrame frame;
private JTextField t1;
private JTextField t2;
double num1;
double num2;
double r1;
String op;
String a1;
double India=77;
double USA=99;
double Europe=101;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
problem1 window = new problem1();
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
public problem1() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame("Scientific Calculator");
frame.getContentPane().setBackground(Color.PINK);
frame.setBounds(100, 100, 787, 535);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

t1 = new JTextField();
t1.setBounds(10, 52, 533, 48);
frame.getContentPane().add(t1);
t1.setColumns(10);

JButton b = new JButton("B");
b.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String b=null;
		if(t1.getText().length()>0)

		{
		StringBuilder strB=new StringBuilder(t1.getText());
		strB.deleteCharAt(t1.getText().length()-1);
		b=strB.toString();
		t1.setText(b);

		}
	}
});
b.setBounds(10, 111, 51, 40);
frame.getContentPane().add(b);

JButton bce = new JButton("CE");
bce.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		t1.setText("");
		t1.setText(null);
		}
	
});
bce.setBounds(61, 111, 51, 40);
frame.getContentPane().add(bce);

JButton bcancel = new JButton("C");
bcancel.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
t1.setText("");
t1.setText(null);
}
});
bcancel.setBounds(115, 111, 51, 40);
frame.getContentPane().add(bcancel);

JButton btnL = new JButton("L..");
btnL.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1=Double.parseDouble(t1.getText());
		num1=Math.log(num1);
		t1.setText(String.valueOf(num1));
		               num1=1/num1;
		               t1.setText(String.valueOf(num1));
		}
	
	
});
btnL.setBounds(292, 111, 63, 40);
frame.getContentPane().add(btnL);

JButton bplmin = new JButton("+ -");
bplmin.setBounds(168, 111, 51, 40);
frame.getContentPane().add(bplmin);

JButton btnNewButton_3 = new JButton("sqrt");
btnNewButton_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
r1=Math.sqrt(num1);
a1=String.format("%.2f",r1);
t1.setText(a1);
}
});
btnNewButton_3.setBounds(220, 111, 63, 40);
frame.getContentPane().add(btnNewButton_3);

JButton btnMod = new JButton("Mod");
btnMod.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
btnMod.setBounds(480, 111, 63, 40);
frame.getContentPane().add(btnMod);

JButton btnSin = new JButton("Sin");
btnSin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1=Double.parseDouble(t1.getText());
               num1=Math.sin(num1);
               t1.setText(String.valueOf(num1));
}
});
btnSin.setBounds(355, 111, 62, 40);
frame.getContentPane().add(btnSin);

JButton btnSinh = new JButton("Snh");
btnSinh.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1=Double.parseDouble(t1.getText());
               num1=Math.sinh(num1);
               t1.setText(String.valueOf(num1));
}
});
btnSinh.setBounds(419, 111, 62, 40);
frame.getContentPane().add(btnSinh);

JButton btnInx = new JButton("Inx");
btnInx.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1=Double.parseDouble(t1.getText());
		num1=Math.log(num1);
		t1.setText(String.valueOf(num1));
		               num1=1/num1;
		               t1.setText(String.valueOf(num1));
		}
	
});
btnInx.setBounds(480, 151, 64, 40);
frame.getContentPane().add(btnInx);

JButton btnCsh = new JButton("Csh");
btnCsh.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1=Double.parseDouble(t1.getText());
               num1=Math.cosh(num1);
               t1.setText(String.valueOf(num1));
}
});
btnCsh.setBounds(418, 151, 63, 40);
frame.getContentPane().add(btnCsh);

JButton btnCos = new JButton("Cos");
btnCos.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1=Double.parseDouble(t1.getText());
               num1=Math.cos(num1);
               t1.setText(String.valueOf(num1));
}
});
btnCos.setBounds(354, 151, 63, 40);
frame.getContentPane().add(btnCos);

JButton btnPie_1 = new JButton("pie");
btnPie_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		t1.setText("3.14");
	}
});
btnPie_1.setBounds(292, 151, 63, 40);
frame.getContentPane().add(btnPie_1);

JButton btnPie = new JButton("%");
btnPie.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1 = Double.parseDouble(t1.getText());
		t1.setText("");
		op = "%";
	}
	
});
btnPie.setBounds(219, 151, 64, 40);
frame.getContentPane().add(btnPie);

JButton bdiv = new JButton("/");
bdiv.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
t1.setText(" ");
op="/";
}
});
bdiv.setBounds(167, 151, 51, 40);
frame.getContentPane().add(bdiv);

JButton b9 = new JButton("9");
b9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+b9.getText();
t1.setText(Number);
}
});
b9.setBounds(114, 151, 51, 40);
frame.getContentPane().add(b9);

JButton b8 = new JButton("8");
b8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+b8.getText();
t1.setText(Number);
}
});
b8.setBounds(61, 151, 51, 40);
frame.getContentPane().add(b8);

JButton b7 = new JButton("7");
b7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+b7.getText();
t1.setText(Number);
}
});
b7.setBounds(9, 151, 51, 40);
frame.getContentPane().add(b7);

JButton btnC_1 = new JButton("C");
btnC_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		t1.setText("");
		t1.setText(null);
		}
	
});
btnC_1.setBounds(480, 191, 64, 40);
frame.getContentPane().add(btnC_1);

JButton btnTanh = new JButton("Tnh");
btnTanh.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1=Double.parseDouble(t1.getText());
               num1=Math.tanh(num1);
               t1.setText(String.valueOf(num1));
}
});
btnTanh.setBounds(418, 191, 63, 40);
frame.getContentPane().add(btnTanh);

JButton btnTan = new JButton("Tan");
btnTan.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1=Double.parseDouble(t1.getText());
               num1=Math.tan(num1);
               t1.setText(String.valueOf(num1));
}
});
btnTan.setBounds(354, 191, 63, 40);
frame.getContentPane().add(btnTan);

JButton btnXy = new JButton("x^y");
btnXy.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
t1.setText("");
op="x^y";


}
});
btnXy.setBounds(292, 191, 63, 40);
frame.getContentPane().add(btnXy);

JButton btnx = new JButton("1/x");
btnx.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1 = 1/num1;
t1.setText(String.valueOf(num1));
               
               t1.setText(String.valueOf(num1));
}
});
btnx.setBounds(219, 191, 64, 40);
frame.getContentPane().add(btnx);

JButton bmul = new JButton("*");
bmul.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
t1.setText(" ");
op="*";
}
});
bmul.setBounds(167, 191, 51, 40);
frame.getContentPane().add(bmul);

JButton b6 = new JButton("6");
b6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+b6.getText();
t1.setText(Number);
}
});
b6.setBounds(114, 191, 51, 40);
frame.getContentPane().add(b6);

JButton b5 = new JButton("5");
b5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+b5.getText();
t1.setText(Number);
}
});
b5.setBounds(61, 191, 51, 40);
frame.getContentPane().add(b5);

JButton b4 = new JButton("4");
b4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+b4.getText();
t1.setText(Number);
}
});
b4.setBounds(9, 191, 51, 40);
frame.getContentPane().add(b4);

JButton bminus = new JButton("-");
bminus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
t1.setText(" ");
op="-";

}
});
bminus.setBounds(168, 232, 51, 40);
frame.getContentPane().add(bminus);

JButton b3 = new JButton("3");
b3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+b3.getText();
t1.setText(Number);
}
});
b3.setBounds(115, 232, 51, 40);
frame.getContentPane().add(b3);

JButton b2 = new JButton("2");
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+b2.getText();
t1.setText(Number);
}
});
b2.setBounds(62, 232, 51, 40);
frame.getContentPane().add(b2);

JButton b1 = new JButton("1");
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+b1.getText();
t1.setText(Number);
}
});
b1.setBounds(10, 232, 51, 40);
frame.getContentPane().add(b1);

JButton bplus = new JButton("+");
bplus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
t1.setText(" ");
op="+";
}
});
bplus.setBounds(168, 274, 51, 40);
frame.getContentPane().add(bplus);

JButton bdot = new JButton(".");
bdot.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+bdot.getText();
t1.setText(Number);
}
});
bdot.setBounds(115, 274, 51, 40);
frame.getContentPane().add(bdot);

JButton btnCbr = new JButton("Cbr");
btnCbr.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1 = Double.parseDouble(t1.getText());
		t1.setText("");
		op="cbr";
	}
});
btnCbr.setBounds(354, 232, 63, 40);
frame.getContentPane().add(btnCbr);

JButton btnX = new JButton("x^2");
btnX.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1=Double.parseDouble(t1.getText());
               num1=Math.pow(num1,2);
               t1.setText(String.valueOf(num1));
}
});
btnX.setBounds(293, 232, 62, 40);
frame.getContentPane().add(btnX);

JButton btnn = new JButton("2^n");
btnn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1=Double.parseDouble(t1.getText());
               num1=Math.pow(2,num1);
               t1.setText(String.valueOf(num1));
}
});
btnn.setBounds(480, 232, 63, 40);
frame.getContentPane().add(btnn);

JButton btnRnd = new JButton("Rnd");
btnRnd.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1=Double.parseDouble(t1.getText());
               num1=Math.toRadians(num1);
               t1.setText(String.valueOf(num1));
}
});
btnRnd.setBounds(419, 232, 62, 40);
frame.getContentPane().add(btnRnd);

JButton btnBin = new JButton("Bin");
btnBin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int a=Integer.parseInt(t1.getText());
t1.setText(Integer.toBinaryString(a));
}
});
btnBin.setBounds(354, 274, 64, 40);
frame.getContentPane().add(btnBin);

JButton btnHex = new JButton("Hex");
btnHex.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int a=Integer.parseInt(t1.getText());
t1.setText(Integer.toHexString(a));
}
});
btnHex.setBounds(418, 274, 63, 40);
frame.getContentPane().add(btnHex);

JButton btnOc = new JButton("Oc");
btnOc.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int a=Integer.parseInt(t1.getText());
t1.setText(Integer.toOctalString(a));
}
});
btnOc.setBounds(480, 274, 64, 40);
frame.getContentPane().add(btnOc);

JButton btnNewButton_4 = new JButton("x^3");
btnNewButton_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(t1.getText());
num1=Double.parseDouble(t1.getText());
               num1=Math.pow(num1,3);
               t1.setText(String.valueOf(num1));
}
});
btnNewButton_4.setBounds(292, 274, 63, 40);
frame.getContentPane().add(btnNewButton_4);

JButton btnNewButton_1 = new JButton("=");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num2=Double.parseDouble(t1.getText());
if(op=="+")
{
r1=num1+num2;
a1=String.format("%.2f",r1);
t1.setText(a1);
}
if(op=="-")
{
r1=num1-num2;
a1=String.format("%.2f",r1);
t1.setText(a1);
}
if(op=="*")
{
r1=num1*num2;
a1=String.format("%.2f",r1);
t1.setText(a1);
}
if(op=="/")
{
r1=num1/num2;
a1=String.format("%.2f",r1);
t1.setText(a1);
}
if(op=="%")
{
r1=num1%num2;
a1=String.format("%2f",r1);
t1.setText(a1);
}
if(op=="x^y")
{
num2=Math.pow(num1,num2);
t1.setText(String.valueOf(num2));
}
if(op=="x^2")
{
num2=Math.pow(num1,num2);
t1.setText(String.valueOf(num2));
}
if(op=="x^3")
{
num2=Math.pow(num1,num2);
t1.setText(String.valueOf(num2));
}
if(op=="cbr")
{
r1=(num1/num2)*100;
a1=String.format("%2f",r1);
t1.setText(a1);
}
}
});
btnNewButton_1.setBounds(220, 232, 63, 82);
frame.getContentPane().add(btnNewButton_1);

JButton b0 = new JButton("0");
b0.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=t1.getText()+b0.getText();
t1.setText(Number);
}
});
b0.setBounds(10, 274, 103, 40);
frame.getContentPane().add(b0);

JMenuBar menuBar = new JMenuBar();
menuBar.setBounds(0, 0, 1005, 21);
frame.getContentPane().add(menuBar);

JMenu mnFile = new JMenu("File");
menuBar.add(mnFile);

JMenuItem mntmStandard = new JMenuItem("Standard");
mntmStandard.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	frame.setBounds(100, 100, 299, 535);
	t1.setBounds(10,52,250,48);
	

}
});
mnFile.add(mntmStandard);

JMenuItem mntmScientifc = new JMenuItem("Scientifc");
mntmScientifc.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		frame.setBounds(100, 100,566, 537);
	}
});
mnFile.add(mntmScientifc);

JMenuItem mntmUnitConvertor = new JMenuItem("Unit convertor");
mntmUnitConvertor.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		frame.setBounds(100, 100, 1016, 537);
	}
});
mnFile.add(mntmUnitConvertor);

JMenuItem mntmExit = new JMenuItem("Exit");
mntmExit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(JOptionPane.showConfirmDialog(frame,"Confirm"," Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION);
		{
		
		System.exit(0);
	}
	}
});
mnFile.add(mntmExit);

JPanel panel = new JPanel();
panel.setBackground(Color.GREEN);
panel.setBounds(568, 50, 360, 335);
frame.getContentPane().add(panel);
panel.setLayout(null);

t2 = new JTextField();
t2.setBounds(80, 140, 151, 37);
panel.add(t2);
t2.setColumns(10);

JComboBox comboBox = new JComboBox();
comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "India", "Europe"}));
comboBox.setBounds(112, 81, 151, 48);
panel.add(comboBox);

JLabel l1 = new JLabel("");
l1.setForeground(Color.WHITE);
l1.setBounds(112, 235, 151, 37);
panel.add(l1);

JButton btnNewButton_5 = new JButton("Convert");
btnNewButton_5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double bp=Double.parseDouble(t2.getText());
if(comboBox.getSelectedItem().equals("India"))
{
String c=String.format("Rs %.2f",bp*India);
l1.setText(c);
}
if(comboBox.getSelectedItem().equals("USA"))
{
String c=String.format("$ %.2f",bp*USA);
l1.setText(c);
}
if(comboBox.getSelectedItem().equals("Europe"))
{
String c=String.format("euro %.2f",bp*Europe);
l1.setText(c);
}
}
});
btnNewButton_5.setBounds(55, 317, 89, 23);
panel.add(btnNewButton_5);

JButton btnNewButton_6 = new JButton("Clear");
btnNewButton_6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
t2.setText("");
l1.setText("");
}
});
btnNewButton_6.setBounds(216, 317, 89, 23);
panel.add(btnNewButton_6);

JLabel lblNewLabel = new JLabel("Currency Converter");
lblNewLabel.setForeground(Color.WHITE);
lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
lblNewLabel.setBounds(99, 11, 206, 49);
panel.add(lblNewLabel);
}
}

