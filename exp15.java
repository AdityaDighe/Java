import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
JLabel label1, label2, label3, label4;

JTextField t1, t2, t3, t4;
JTextArea screen;
JCheckBox terms;
JButton submit;
JLabel msg;

MyFrame()
{
setTitle("User Information");
setSize(700, 500);
setDefaultCloseOperation(EXIT_ON_CLOSE);
Container c = getContentPane();
c.setLayout(null);
// name label
label1 = new JLabel("Name");
label1.setBounds(40, 30, 100, 25);
c.add(label1);
// name inputbox
t1 = new JTextField();
t1.setBounds(120, 30, 150, 25);
c.add(t1);
// Street label
label2 = new JLabel("Street");
label2.setBounds(40, 80, 100, 25);

c.add(label2);
// street inputbox
t2 = new JTextField();

t2.setBounds(120, 80, 150, 25);
c.add(t2);
// City label
label3 = new JLabel("City");
label3.setBounds(40, 130, 100, 25);
c.add(label3);
// city inputbox
t3 = new JTextField();
t3.setBounds(120, 130, 150, 25);
c.add(t3);
// pincode label
label4 = new JLabel("Pincode");
label4.setBounds(40, 180, 100, 25);
c.add(label4);
// pincode textfield
t4 = new JTextField();
t4.setBounds(120, 180, 150, 25);
c.add(t4);
// checkbox
terms = new JCheckBox("Save and Proceed");
terms.setBounds(40, 250, 170, 25);

c.add(terms);

// submit button
submit = new JButton("Submit");
submit.setBounds(40, 300, 170, 25);

c.add(submit);
submit.addActionListener(this);
// display of form details
screen = new JTextArea();
screen.setBounds(350, 30, 300, 375);
screen.setBorder(new EmptyBorder(100, 30, 10, 10));
c.add(screen);
// message
msg = new JLabel("");
msg.setBounds(40, 350, 200, 25);
c.add(msg);
setVisible(true);
}

public void actionPerformed(ActionEvent e) {
if (terms.isSelected()) {
msg.setText("Registartion Successful !!");
String name = t1.getText();
String street = t2.getText();
String city = t3.getText();
String pincode = t4.getText();
screen.setText(name + "\n" + street + "\n" + city + "\n" + pincode
+ "\n");
} else {

msg.setText("Kindly Save and Procced !!");
screen.setText(" ");
}
}
}

public class exp15 {
public static void main(String args[]) {
MyFrame frame = new MyFrame();
}
}