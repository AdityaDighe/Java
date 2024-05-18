import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
JCheckBox terms;
JButton btn1, btn2, btn3, btn4;
JLabel msg;

MyFrame() {
setTitle("Buttons");
setSize(700, 500);
setDefaultCloseOperation(EXIT_ON_CLOSE);
Container c = getContentPane();

c.setSize(300, 25);
c.setLayout(new GridLayout(2, 2, 20, 20));
c.setLayout(new FlowLayout());
// button 1
btn1 = new JButton("Button 1 ");
btn1.setBounds(40, 30, 250, 25);
btn1.addActionListener(this);
c.add(btn1);
// button 2

btn2 = new JButton("Button 2 ");
btn2.setBounds(40, 80, 250, 25);
btn2.addActionListener(this);
c.add(btn2);
// button 3
btn3 = new JButton("Button 3 ");
btn3.setBounds(40, 130, 250, 25);
btn3.addActionListener(this);
c.add(btn3);
// button 4
btn4 = new JButton("Button 4 ");
btn4.setBounds(40, 180, 250, 25);
btn4.addActionListener(this);
c.add(btn4);
// message
msg = new JLabel("");
msg.setBounds(40, 350, 200, 25);

c.add(msg);
setVisible(true);
}

public void actionPerformed(ActionEvent e) {

if (e.getSource() == btn1) {
msg.setText("Button 1 clicked");
} else if (e.getSource() == btn2) {
msg.setText("Button 2 clicked");
} else if (e.getSource() == btn3) {
msg.setText("Button 3 clicked");
} else if (e.getSource() == btn4) {
msg.setText("Button 4 clicked");
} else {
msg.setText("No button clicked");
}
}
}
public class exp15_1 {
public static void main(String args[]) {

MyFrame frame = new MyFrame();
}
}