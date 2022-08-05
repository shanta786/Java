import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenuFrameNew extends JFrame
{
JTextField name;
JPasswordField pass;
JButton login;
MenuFrameNew()
{
setLayout(new FlowLayout(FlowLayout.CENTER));
JLabel namep = new JLabel("Name: ");
JLabel passp = new JLabel("Password: ");
name = new JTextField(12);
pass = new JPasswordField(8);
login=new JButton("LOGIN");

namep.setBounds(100,100,100,20);
passp.setBounds(100,130,100,20);
name.setBounds(230,100,200,20);
pass.setBounds(230,130,200,20);
login.setBounds(230,160,200,20);
add(namep);
add(name);
add(passp);
add(pass);
add(login);
setVisible(true);
}
public static void main(String args[])
{
MenuFrameNew obj=new MenuFrameNew();
}
}