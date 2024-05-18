import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
JLabel label1, label2;
JTextField username;
JPasswordField password;
JButton submit, reset, exit;
String strusername, strpassword;
Container c = getContentPane();
MyFrame() {
setTitle("Login");
setSize(700, 500);
setDefaultCloseOperation(EXIT_ON_CLOSE);
c = getContentPane();
c.setLayout(null);
label1 = new JLabel("User Name: ");
label1.setBounds(40, 30, 250, 25);
label1.setFont(new Font("Osaka", Font.BOLD, 15));
c.add(label1);
username = new JTextField();
username.setBounds(150, 30, 150, 25);
c.add(username);
label2 = new JLabel("Password: ");
label2.setBounds(40, 80, 250, 25);

label2.setFont(new Font("Osaka", Font.BOLD, 15));
c.add(label2);
password = new JPasswordField(10);
password.setBounds(150, 80, 150, 25);
c.add(password);
password.setEchoChar('*');
submit = new JButton("Submit");
submit.setBounds(40, 150, 100, 25);
submit.setFont(new Font("Osaka", Font.BOLD, 15));
reset = new JButton("Reset");
reset.setBounds(190, 150, 100, 25);
reset.setFont(new Font("Osaka", Font.BOLD, 15));
exit = new JButton("Exit");
c.add(submit);
c.add(reset);
c.add(exit);
submit.addActionListener(this);
reset.addActionListener(this);
exit.addActionListener(this);
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == submit) {
strusername = username.getText();
strpassword = password.getText();
if (strusername.equals("Aditya123") &&
strpassword.equals("Aditya@0989")) {

JOptionPane.showMessageDialog(c, "Successful Login");

System.exit(0);
} else {
JOptionPane.showMessageDialog(c, "Unsuccessful Login");
username.setText("");
password.setText("");
username.requestFocus();
}
} else if (e.getSource() == reset) {
username.setText("");
password.setText("");
username.requestFocus();
}
else {
System.exit(0);
}
}
}
public class exp14_1 {
public static void main(String[] args) {
MyFrame frame = new MyFrame();
}
}