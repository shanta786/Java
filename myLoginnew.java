//Program using swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.io.*;

class LoginForm extends JFrame implements ActionListener
{
Container container = getContentPane();
JLabel userLabel = new JLabel("USERNAME");
JLabel passwordLabel = new JLabel("PASSWORD");
JTextField userTextField = new JTextField();
JPasswordField passwordField = new JPasswordField();
JButton loginButton = new JButton("LOGIN");
JButton resetButton = new JButton("RESET");
JCheckBox showPassword = new JCheckBox("Show Password");

LoginForm()
{
setLayoutManager();
setLocationAndSize();
addComponentsToContainer();
addActionEvent();
}

public void setLayoutManager()
{
container.setLayout(null);
}

public void setLocationAndSize()
{
userLabel.setBounds(50,150,100,30);
passwordLabel.setBounds(50,220,100,30);
userTextField.setBounds(150,150,150,30);
passwordField.setBounds(150,220,150,30);
showPassword.setBounds(150,250,150,30);
loginButton.setBounds(50,300,100,30);
resetButton.setBounds(200,300,100,30);
}

public void addComponentsToContainer()
{
container.add(userLabel);
container.add(passwordLabel);
container.add(userTextField);
container.add(passwordField);
container.add(showPassword);
container.add(loginButton);
container.add(resetButton);
}
public void addActionEvent()
{
loginButton.addActionListener(this);
resetButton.addActionListener(this);
showPassword.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==loginButton)
{
String userText;
String pwdText;
userText = userTextField.getText();
pwdText = passwordField.getText();
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew","root","");
Statement stmt=con.createStatement();
String sql="select * from user where uid='" + userText + "'";
ResultSet rs=stmt.executeQuery(sql);
int i=0;
while(rs.next())
{
String username=rs.getString("uid");
String password=rs.getString("pass");
if((userText.equals(username)) && (pwdText.equals(password)))
{
i=1;
}
}
if(i==1)
{
JOptionPane.showMessageDialog(null,"Login Successful","alert",JOptionPane.INFORMATION_MESSAGE);
}
else if(i==0)
{
JOptionPane.showMessageDialog(null,"Invalid Login","alert",JOptionPane.INFORMATION_MESSAGE);
}
}
catch(Exception e1)
{}
}
if(e.getSource() == resetButton)
{
userTextField.setText("");
passwordField.setText("");
}
if(e.getSource() == showPassword)
{
if(showPassword.isSelected())
{
passwordField.setEchoChar((char) 0);
}
else
{
passwordField.setEchoChar('*');
}
}
}
}
class myLoginnew
{
public static void main(String args[])
{
LoginForm form=new LoginForm();
form.setTitle("Login Form");
form.setVisible(true);
form.setBounds(10,10,370,600);
form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
form.setResizable(false);
}
}