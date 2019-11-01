package swing;

import java.awt.EventQueue;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JLayeredPane;

public class ticket {

private JFrame frame;
private JTextField tname1;
private JTextField ttax;
private JTextField tst;
private JTextField tt;
private JTextField tname2;
private JTextField tfm;
private JTextField tto;
private JTextField td;
private JTextField tti;
private JTextField ttno;
private JTextField tp;
private JTextField tr;
double ac=500;
double nac=300;
double se=300;
double sl=500;
double si=500;
double d=700;
double tac=200;
double tnac=100;
double sum,a,b,c;
int i=112974;
String n=" ";
private JTable table;


/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
ticket window = new ticket();
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
public ticket() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 703, 627);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("Ticket Booking");
lblNewLabel.setBackground(Color.BLACK);
lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
lblNewLabel.setBounds(266, 11, 109, 46);
frame.getContentPane().add(lblNewLabel);

tname1 = new JTextField();
tname1.setBounds(113, 89, 93, 20);
frame.getContentPane().add(tname1);
tname1.setColumns(10);

JLabel lblNewLabel_1 = new JLabel("Name");
lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
lblNewLabel_1.setBounds(10, 89, 93, 20);
frame.getContentPane().add(lblNewLabel_1);

JSeparator separator = new JSeparator();
separator.setBounds(10, 120, 264, 13);
frame.getContentPane().add(separator);

JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard");
rdbtnNewRadioButton.setBounds(10, 137, 78, 23);
frame.getContentPane().add(rdbtnNewRadioButton);

JRadioButton r1 = new JRadioButton("Single Ticket");
r1.setBounds(101, 140, 93, 23);
frame.getContentPane().add(r1);

JRadioButton rdbtnAdult = new JRadioButton("Adult");
rdbtnAdult.setBounds(196, 137, 78, 23);
frame.getContentPane().add(rdbtnAdult);

JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
rdbtnFirstClass.setBounds(10, 177, 78, 23);
frame.getContentPane().add(rdbtnFirstClass);

JRadioButton r2 = new JRadioButton("AC");
r2.setBounds(90, 177, 46, 23);
frame.getContentPane().add(r2);

JRadioButton r3 = new JRadioButton("Sleeper");
r3.setBounds(137, 177, 69, 23);
frame.getContentPane().add(r3);

JRadioButton rdbtnChild = new JRadioButton("Child");
rdbtnChild.setBounds(215, 177, 59, 23);
frame.getContentPane().add(rdbtnChild);

JComboBox combo = new JComboBox();
combo.setModel(new DefaultComboBoxModel(new String[] {"Kerala", "Tamil Nadu", "Goa"}));
combo.setBounds(10, 230, 78, 20);
frame.getContentPane().add(combo);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Kerala", "TamilNadu", "Goa"}));
comboBox_1.setBounds(90, 230, 78, 20);
frame.getContentPane().add(comboBox_1);

JComboBox comboBox_2 = new JComboBox();
comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
comboBox_2.setBounds(167, 230, 78, 20);
frame.getContentPane().add(comboBox_2);

JSeparator separator_1 = new JSeparator();
separator_1.setOrientation(SwingConstants.VERTICAL);
separator_1.setBounds(284, 120, 18, 322);
frame.getContentPane().add(separator_1);

JSeparator separator_2 = new JSeparator();
separator_2.setBounds(10, 261, 254, 13);
frame.getContentPane().add(separator_2);

JLabel lblTax = new JLabel("Tax");
lblTax.setBounds(10, 285, 46, 26);
frame.getContentPane().add(lblTax);

JLabel lblSub = new JLabel("Sub Total");
lblSub.setBounds(10, 321, 51, 27);
frame.getContentPane().add(lblSub);

JLabel lblTotal = new JLabel("Total");
lblTotal.setBounds(10, 359, 51, 20);
frame.getContentPane().add(lblTotal);

ttax = new JTextField();
ttax.setBounds(90, 288, 86, 20);
frame.getContentPane().add(ttax);
ttax.setColumns(10);

tst = new JTextField();
tst.setColumns(10);
tst.setBounds(90, 324, 86, 20);
frame.getContentPane().add(tst);

tt = new JTextField();
tt.setColumns(10);
tt.setBounds(90, 359, 86, 20);
frame.getContentPane().add(tt);

JSeparator separator_3 = new JSeparator();
separator_3.setBounds(10, 390, 254, 21);
frame.getContentPane().add(separator_3);

JButton btnNewButton = new JButton("Total");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String name1=tname1.getText();
tname2.setText(name1);
tfm.setText((String)combo.getSelectedItem());
tto.setText((String)comboBox_1.getSelectedItem());
Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                tti.setText(tTime.format(timer.getTime()));
                //Date
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                td.setText(tdate.format(timer.getTime()));
                tp.setText(String.valueOf(c));
                tr.setText("Any");
                String bkno=String.format("%d", i);
                ttno.setText(bkno);
                i++;
if(r2.isSelected())
{
ttax.setText("200");
}
else
{
ttax.setText("100");
}
if(r1.isSelected() && r2.isSelected() && r3.isSelected())
          {
          if(comboBox_2.getSelectedItem().equals("1"))
          {
          sum=(ac+sl+si);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("2"))
          {
          sum=((ac+sl+si)*2);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("3"))
          {
          sum=((ac+sl+si)*3);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("4"))
          {
          sum=((ac+sl+si)*4);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("5"))
          {
          sum=((ac+sl+si)*5);
          tst.setText(String.valueOf(sum));
          }
          }
if(r1.isSelected() && r2.isSelected())
{
if(comboBox_2.getSelectedItem().equals("1"))
          {
          sum=(ac+se+si);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("2"))
          {
          sum=((ac+se+si)*2);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("3"))
          {
          sum=((ac+se+si)*3);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("4"))
          {
          sum=((ac+se+si)*4);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("5"))
          {
          sum=((ac+se+si)*5);
          tst.setText(String.valueOf(sum));
          }
}
if(r1.isSelected() && r3.isSelected())
{
if(comboBox_2.getSelectedItem().equals("1"))
          {
          sum=(nac+sl+si);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("2"))
          {
          sum=((nac+sl+si)*2);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("3"))
          {
          sum=((nac+sl+si)*3);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("4"))
          {
          sum=((nac+sl+si)*4);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("5"))
          {
          sum=((nac+sl+si)*5);
          tst.setText(String.valueOf(sum));
          }
}
if(r2.isSelected() && r3.isSelected())
{
if(comboBox_2.getSelectedItem().equals("1"))
          {
          sum=(ac+sl+d);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("2"))
          {
          sum=((ac+sl+d)*2);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("3"))
          {
          sum=((ac+sl+d)*3);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("4"))
          {
          sum=((ac+sl+d)*4);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("5"))
          {
          sum=((ac+sl+d)*5);
          tst.setText(String.valueOf(sum));
          }
}
if(r1.isSelected())
{
if(comboBox_2.getSelectedItem().equals("1"))
          {
          sum=(nac+se+si);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("2"))
          {
          sum=((nac+se+si)*2);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("3"))
          {
          sum=((nac+se+si)*3);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("4"))
          {
          sum=((nac+se+si)*4);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("5"))
          {
          sum=((nac+se+si)*5);
          tst.setText(String.valueOf(sum));
          }
}
if(r2.isSelected())
{
if(comboBox_2.getSelectedItem().equals("1"))
          {
          sum=(ac+se+d);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("2"))
          {
          sum=((ac+se+d)*2);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("3"))
          {
          sum=((ac+se+d)*3);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("4"))
          {
          sum=((ac+se+d)*4);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("5"))
          {
          sum=((ac+se+d)*5);
          tst.setText(String.valueOf(sum));
          }
}
if(r3.isSelected())
{
if(comboBox_2.getSelectedItem().equals("1"))
          {
          sum=(nac+sl+d);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("2"))
          {
          sum=((nac+sl+d)*2);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("3"))
          {
          sum=((nac+sl+d)*3);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("4"))
          {
          sum=((nac+sl+d)*4);
          tst.setText(String.valueOf(sum));
          }
          if(comboBox_2.getSelectedItem().equals("5"))
          {
          sum=((nac+sl+d)*5);
          tst.setText(String.valueOf(sum));
          }
}
a=Double.parseDouble(ttax.getText());
b=Double.parseDouble(tst.getText());
c=a+b;
tt.setText(String.valueOf(c));
tp.setText(String.valueOf(c));
}
});
btnNewButton.setBounds(10, 422, 89, 23);
frame.getContentPane().add(btnNewButton);

JButton btnNewButton_1 = new JButton("Reset");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
tname1.setText("");
tname2.setText("");
ttax.setText("");
tst.setText("");
tt.setText("");
tfm.setText("");
tto.setText("");
td.setText("");
tti.setText("");
ttno.setText("");
tp.setText("");
tr.setText("");

}
});
btnNewButton_1.setBounds(107, 422, 89, 23);
frame.getContentPane().add(btnNewButton_1);

JButton btnNewButton_2 = new JButton("Exit");
btnNewButton_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
btnNewButton_2.setBounds(206, 422, 68, 23);
frame.getContentPane().add(btnNewButton_2);

JPanel panel = new JPanel();
panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 5), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
panel.setBounds(292, 99, 388, 343);
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblNewLabel_2 = new JLabel("Name");
lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
lblNewLabel_2.setBounds(10, 42, 66, 24);
panel.add(lblNewLabel_2);

tname2 = new JTextField();
tname2.setBounds(86, 42, 113, 24);
panel.add(tname2);
tname2.setColumns(10);

JLabel lblFrom = new JLabel("From");
lblFrom.setBounds(10, 94, 46, 26);
panel.add(lblFrom);

JLabel lblTo = new JLabel("To");
lblTo.setBounds(10, 130, 51, 27);
panel.add(lblTo);

JLabel lblDate = new JLabel("Date");
lblDate.setBounds(10, 168, 51, 20);
panel.add(lblDate);

tfm = new JTextField();
tfm.setColumns(10);
tfm.setBounds(90, 97, 86, 20);
panel.add(tfm);

tto = new JTextField();
tto.setColumns(10);
tto.setBounds(90, 133, 86, 20);
panel.add(tto);

td = new JTextField();
td.setColumns(10);
td.setBounds(90, 168, 86, 20);
panel.add(td);

tti = new JTextField();
tti.setColumns(10);
tti.setBounds(90, 199, 86, 20);
panel.add(tti);

JLabel lblTime = new JLabel("Time");
lblTime.setBounds(10, 199, 51, 20);
panel.add(lblTime);

ttno = new JTextField();
ttno.setBounds(266, 114, 86, 20);
panel.add(ttno);
ttno.setColumns(10);

tp = new JTextField();
tp.setBounds(266, 157, 86, 20);
panel.add(tp);
tp.setColumns(10);

tr = new JTextField();
tr.setBounds(266, 199, 86, 20);
panel.add(tr);
tr.setColumns(10);

JLabel lblTicketNo = new JLabel("Ticket No.");
lblTicketNo.setBounds(281, 100, 71, 14);
panel.add(lblTicketNo);

JLabel lblPrice = new JLabel("Price");
lblPrice.setBounds(281, 143, 46, 14);
panel.add(lblPrice);

JLabel lblRoute = new JLabel("Route");
lblRoute.setBounds(281, 185, 46, 14);
panel.add(lblRoute);

JButton btnNewButton_3 = new JButton("Confirm");
btnNewButton_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
frame=new JFrame("Confirm");
if(JOptionPane.showConfirmDialog(frame, "Confirm","Cancel",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {

                if(r2.isSelected())
                {
                n="AC";
                }
                else
                {
                n="NonAC";
                }
               
               
                DefaultTableModel model=(DefaultTableModel) table.getModel();
model.addRow(new String[] {
tname1.getText(),
ttno.getText(),
tfm.getText(),
tto.getText(),
(String)comboBox_2.getSelectedItem(),
tti.getText(),
td.getText(),
n,
tp.getText(),

});
}
else
System.exit(0);
}

});
btnNewButton_3.setBounds(145, 264, 119, 41);
panel.add(btnNewButton_3);

JPanel panel_1 = new JPanel();
panel_1.setBackground(Color.BLUE);
panel_1.setBounds(21, 480, 612, 86);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

table = new JTable();
table.setFont(new Font("Times New Roman", Font.BOLD, 12));
table.setBorder(new LineBorder(new Color(0, 0, 0)));
table.setModel(new DefaultTableModel(
new Object[][] {
{"Name", "Booking No", "From", "To", "No of Seats", "Time", "Date", "AC/Non AC", "Price"},
},
new String[] {
"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
}
));
table.setBounds(10, 11, 592, 64);
panel_1.add(table);






}
}

