
				package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class project2 {

private JFrame frame;
String fname,surname;
String id;
int maths,eng,bio,com,che,phy,tam,mal,tot,avg;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
private JTextField textField_8;
private JTextField textField_9;
private JTextField textField_10;
private JTextField textField_11;
private JTextField textField_12;
private JTextField textField_13;
private JTable table;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
project2 window = new project2();
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
public project2() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame("Student Report");
frame.getContentPane().setBackground(new Color(0, 0, 255));
frame.getContentPane().setForeground(new Color(0, 0, 255));
frame.setBounds(100, 100, 785, 598);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBackground(new Color(95, 158, 160));
panel.setBounds(10, 11, 411, 331);
panel.setBorder(new TitledBorder(null, "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
panel.setToolTipText("");
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblStudentid = new JLabel("Student_ID");
lblStudentid.setBounds(10, 23, 89, 14);
lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 12));
panel.add(lblStudentid);

JLabel lblFirstname = new JLabel("Firstname");
lblFirstname.setBounds(10, 53, 61, 14);
lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 12));
panel.add(lblFirstname);

JLabel lblSurname = new JLabel("Surname");
lblSurname.setBounds(10, 84, 61, 14);
lblSurname.setFont(new Font("Tahoma", Font.BOLD, 12));
panel.add(lblSurname);

JLabel lblCourseCode = new JLabel("Course Code");
lblCourseCode.setBounds(10, 119, 79, 14);
lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 12));
panel.add(lblCourseCode);

JComboBox comboBox = new JComboBox();
comboBox.setBounds(90, 116, 79, 20);
comboBox.setModel(new DefaultComboBoxModel(new String[] {"111032E", "111032D", "111032C", "111032B", "111032A"}));
panel.add(comboBox);

JSeparator separator_1 = new JSeparator();
separator_1.setBounds(24, 177, 153, 2);
panel.add(separator_1);

textField = new JTextField();
textField.setBounds(91, 20, 86, 20);
panel.add(textField);
textField.setColumns(10);

textField_1 = new JTextField();
textField_1.setBounds(91, 48, 86, 20);
panel.add(textField_1);
textField_1.setColumns(10);

textField_2 = new JTextField();
textField_2.setBounds(91, 81, 86, 20);
panel.add(textField_2);
textField_2.setColumns(10);

JLabel lblTotalScore = new JLabel("Total Score");
lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 12));
lblTotalScore.setBounds(10, 219, 75, 14);
panel.add(lblTotalScore);

textField_3 = new JTextField();
textField_3.setBounds(91, 217, 86, 20);
panel.add(textField_3);
textField_3.setColumns(10);

JLabel label = new JLabel("");
label.setBounds(25, 265, 46, 14);
panel.add(label);

JLabel lblAverage = new JLabel("Average");
lblAverage.setFont(new Font("Tahoma", Font.BOLD, 12));
lblAverage.setBounds(10, 253, 69, 20);
panel.add(lblAverage);

textField_4 = new JTextField();
textField_4.setBounds(90, 254, 86, 20);
panel.add(textField_4);
textField_4.setColumns(10);

JLabel lblRanking = new JLabel("Ranking");
lblRanking.setFont(new Font("Tahoma", Font.BOLD, 12));
lblRanking.setBounds(10, 290, 61, 14);
panel.add(lblRanking);

textField_5 = new JTextField();
textField_5.setBounds(91, 285, 86, 20);
panel.add(textField_5);
textField_5.setColumns(10);

JLabel lblMaths = new JLabel("Maths");
lblMaths.setFont(new Font("Tahoma", Font.BOLD, 12));
lblMaths.setBounds(216, 24, 46, 14);
panel.add(lblMaths);

textField_6 = new JTextField();
textField_6.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
       
    }
}
});
textField_6.setBounds(315, 21, 86, 20);
panel.add(textField_6);
textField_6.setColumns(10);

JLabel lblEnglish = new JLabel("English");
lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 12));
lblEnglish.setBounds(216, 54, 46, 14);
panel.add(lblEnglish);

textField_7 = new JTextField();
textField_7.addKeyListener(new KeyAdapter() {
@Override

public void keyTyped(KeyEvent evt) {
char num=evt.getKeyChar();
       if(!(Character.isDigit(num))
               ||(num==KeyEvent.VK_BACK_SPACE)
               ||(num==KeyEvent.VK_DELETE)) {
           evt.consume();
       }    
}
});
textField_7.setBounds(315, 53, 86, 20);
panel.add(textField_7);
textField_7.setColumns(10);

JLabel lblBiology = new JLabel("Biology");
lblBiology.setFont(new Font("Tahoma", Font.BOLD, 12));
lblBiology.setBounds(216, 102, 46, 14);
panel.add(lblBiology);

textField_8 = new JTextField();
textField_8.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
}
});
textField_8.setBounds(315, 100, 86, 20);
panel.add(textField_8);
textField_8.setColumns(10);

JLabel lblComputer = new JLabel("Computer");
lblComputer.setFont(new Font("Tahoma", Font.BOLD, 12));
lblComputer.setBounds(216, 141, 61, 14);
panel.add(lblComputer);

textField_9 = new JTextField();
textField_9.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
}
});
textField_9.setBounds(315, 139, 86, 20);
panel.add(textField_9);
textField_9.setColumns(10);

JLabel lblChemistry = new JLabel("Chemistry");
lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 12));
lblChemistry.setBounds(216, 181, 71, 14);
panel.add(lblChemistry);

textField_10 = new JTextField();
textField_10.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
}
});
textField_10.setBounds(315, 179, 86, 20);
panel.add(textField_10);
textField_10.setColumns(10);

JLabel lblPhysics = new JLabel("Physics");
lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 12));
lblPhysics.setBounds(216, 219, 61, 14);
panel.add(lblPhysics);

textField_11 = new JTextField();
textField_11.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
}
});
textField_11.setBounds(315, 213, 86, 20);
panel.add(textField_11);
textField_11.setColumns(10);

JLabel lblTamil = new JLabel("Tamil");
lblTamil.setFont(new Font("Tahoma", Font.BOLD, 12));
lblTamil.setBounds(226, 256, 61, 14);
panel.add(lblTamil);

textField_12 = new JTextField();
textField_12.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
}
});
textField_12.setBounds(315, 253, 86, 20);
panel.add(textField_12);
textField_12.setColumns(10);

JLabel lblMalayalam = new JLabel("Malayalam");
lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 12));
lblMalayalam.setBounds(216, 287, 71, 20);
panel.add(lblMalayalam);

textField_13 = new JTextField();
textField_13.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent evt) {
char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
    }
}
});
textField_13.setBounds(315, 288, 86, 20);
panel.add(textField_13);
textField_13.setColumns(10);

JSeparator separator = new JSeparator();
separator.setBounds(20, 212, 177, 2);
frame.getContentPane().add(separator);

JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(100, 149, 237));
panel_1.setBounds(454, 24, 305, 318);
panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);
JTextArea textArea = new JTextArea();
textArea.setBounds(10, 23, 285, 249);
panel_1.add(textArea);
JButton btnClear = new JButton("Clear");
btnClear.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		textArea.setText("");
	}
});
btnClear.setForeground(new Color(0, 0, 255));
btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
btnClear.setBounds(109, 283, 89, 23);
panel_1.add(btnClear);

table = new JTable();
table.setBackground(new Color(176, 196, 222));
table.setForeground(new Color(0, 0, 0));
table.setBounds(21, 370, 738, 72);
table.setFont(new Font("Times New Roman", Font.BOLD, 11));
table.setModel(new DefaultTableModel(
new Object[][] {
{"Student_ID", "Course_Name","Maths","English","Biology","Computer","Chemistry","Physics","Tamil","Malayalam","Total Score","Average","Ranking"},

},
new String[] {
"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
}
));
frame.getContentPane().add(table);
JButton btnAddReport = new JButton("Add Report");
btnAddReport.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
fname=textField_1.getText();
surname=textField_2.getText();
id=textField.getText();
maths=Integer.parseInt(textField_6.getText());
eng=Integer.parseInt(textField_7.getText());
bio=Integer.parseInt(textField_8.getText());
com=Integer.parseInt(textField_9.getText());
che=Integer.parseInt(textField_10.getText());
phy=Integer.parseInt(textField_11.getText());
tam=Integer.parseInt(textField_12.getText());
mal=Integer.parseInt(textField_13.getText());
tot=maths+eng+bio+com+che+phy+tam+mal;
textField_3.setText(String.valueOf(tot));
avg=tot/8;
textField_4.setText(String.valueOf(avg));
if (tot<50)
{
textField_5.setText("FAIL");
}
else if (tot>100 && tot<120)
{
textField_5.setText("3");
}
else if(tot>50 && tot<100)
{
textField_5.setText("2");
}
else
{
textField_5.setText("1");
}


	

DefaultTableModel model=(DefaultTableModel) table.getModel();
model.addRow(new String[] {
textField.getText(),
(String)comboBox.getSelectedItem(),

textField_6.getText(),
textField_7.getText(),textField_8.getText(),textField_9.getText(),textField_10.getText(),textField_11.getText(),textField_12.getText(),
textField_13.getText(),
textField_3.getText(),textField_4.getText(),textField_5.getText(),
});
}

});
btnAddReport.setForeground(new Color(34, 139, 34));
btnAddReport.setBounds(51, 514, 89, 23);
frame.getContentPane().add(btnAddReport);
JButton btnDelete = new JButton("Delete");
btnDelete.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){
		int row=table.getSelectedRow();
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		model.removeRow(row);


		
		
	}
});
btnDelete.setForeground(new Color(255, 0, 0));
btnDelete.setBounds(173, 514, 89, 23);
frame.getContentPane().add(btnDelete);
JButton btnShowReport = new JButton("Show Report");
btnShowReport.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
     








textArea.append("Student Record\n"
+"Student Name:\t\t"+textField_1.getText()+" "+textField_2.getText()+"\n"
+"=====================================\n"
+"Maths\t\t"+textField_6.getText()+"\n"
+"English:\t\t"+textField_7.getText()+"\n"

+"Biology:\t\t"+textField_8.getText()+"\n"

+"Computer:\t\t"+textField_9.getText()+"\n"
+"Chemistry:\t\t"+textField_10.getText()+"\n"
+"Physics:\t\t"+textField_11.getText()+"\n"
+"Tamil:\t\t"+textField_12.getText()+"\n"
+"Malayalam:\t\t"+textField_13.getText()+"\n"

//+"Hindi:\t\t"+textField_9.getText()+"\n"







+"=====================================\n"

+"Total Score:\t\t"+textField_3.getText()+"\n"
+"Average:\t\t"+textField_4.getText()+"\n"
+"Ranking:\t\t"+textField_5.getText()+"\n"

);


//if(tot<=20)
//{
//textField_5.setText("FAIL");
//}
//else if(tot<=70 && tot>=51)
//{
//textField_5.setText("3");
//}
//else if(tot<90 && tot>71)
//{
//textField_5.setText("2");
//}
//else
//{
//textField_5.setText("1");
////}
}






});
btnShowReport.setForeground(new Color(106, 90, 205));
btnShowReport.setBounds(312, 514, 109, 23);
frame.getContentPane().add(btnShowReport);
JButton btnExit = new JButton("Exit");
btnExit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(JOptionPane.showConfirmDialog(frame,"Confirm"," Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION);
		{
		
		System.exit(0);
	}
	
	}
});
btnExit.setForeground(new Color(255, 0, 0));
btnExit.setBounds(454, 514, 89, 23);
frame.getContentPane().add(btnExit);
JButton btnReset = new JButton("Reset");
btnReset.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		textField.setText(null);
	     textField_1.setText(null);
	     textField_2.setText(null);
	     textField_3.setText(null);
	     textField_4.setText(null);
	     textField_5.setText(null);
	     textField_6.setText(null);
	     textField_7.setText(null);
	     textField_8.setText(null);
	     textField_9.setText(null);
	     textField_10.setText(null);
	     textField_11.setText(null);
	     textField_12.setText(null);
	     textField_13.setText(null);
	     
	}
});
btnReset.setForeground(new Color(210, 105, 30));
btnReset.setBounds(596, 514, 89, 23);
frame.getContentPane().add(btnReset);
JFormattedTextField formattedTextField = new JFormattedTextField();
formattedTextField.setBounds(377, 515, 6, 20);
frame.getContentPane().add(formattedTextField);
}
}