// Program to search the record in JFrame
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class RegisterForm extends JFrame implements ActionListener
{
Container container=getContentPane();
JLabel mail=new JLabel("Enter the Email:");
JLabel title=new JLabel("EDIT FORM");
JLabel name=new JLabel("Name");
JLabel fname=new JLabel("Father Name");
JLabel mname=new JLabel("Mother Name");
JLabel address=new JLabel("Address");
JLabel city=new JLabel("City");
JLabel contact=new JLabel("Contact");
JLabel email=new JLabel("Email");


JTextField tmail=new JTextField();
JTextField tname=new JTextField();
JTextField tfname=new JTextField();
JTextField tmname=new JTextField();
JTextField taddress=new JTextField();
JTextField tcity=new JTextField();
JTextField tcontact=new JTextField();
JTextField temail=new JTextField();

JButton rgButton=new JButton("Search");
JButton editButton=new JButton("Edit");

RegisterForm()
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
title.setBounds(240,50,400,30);
title.setFont(new Font("Arial",Font.PLAIN,30));

mail.setBounds(80,120,250,30);
mail.setFont(new Font("Arial",Font.PLAIN,20));

name.setBounds(200,190,150,30);
name.setFont(new Font("Arial",Font.PLAIN,20));

fname.setBounds(200,230,150,30);
fname.setFont(new Font("Arial",Font.PLAIN,20));

mname.setBounds(200,270,150,30);
mname.setFont(new Font("Arial",Font.PLAIN,20));

address.setBounds(200,310,150,30);
address.setFont(new Font("Arial",Font.PLAIN,20));

city.setBounds(200,350,150,30);
city.setFont(new Font("Arial",Font.PLAIN,20));

contact.setBounds(200,390,150,30);
contact.setFont(new Font("Arial",Font.PLAIN,20));

email.setBounds(200,430,150,30);
email.setFont(new Font("Arial",Font.PLAIN,20));

tmail.setBounds(260,120,200,30);
tmail.setFont(new Font("Arial",Font.PLAIN,15));

tname.setBounds(360,190,200,30);
tname.setFont(new Font("Arial",Font.PLAIN,15));

tfname.setBounds(360,230,200,30);
tfname.setFont(new Font("Arial",Font.PLAIN,15));

tmname.setBounds(360,270,200,30);
tname.setFont(new Font("Arial",Font.PLAIN,15));

taddress.setBounds(360,310,200,30);
taddress.setFont(new Font("Arial",Font.PLAIN,15));

tcity.setBounds(360,350,200,30);
tcity.setFont(new Font("Arial",Font.PLAIN,15));

tcontact.setBounds(360,390,200,30);
tcontact.setFont(new Font("Arial",Font.PLAIN,15));

temail.setBounds(360,430,200,30);
temail.setFont(new Font("Arial",Font.PLAIN,15));

rgButton.setBounds(470,120,100,30);
rgButton.setFont(new Font("Arial",Font.PLAIN,15));

editButton.setBounds(360,480,200,30);
editButton.setFont(new Font("Arial",Font.PLAIN,15));

}

public void addComponentsToContainer()
{
container.add(title);
container.add(mail);
container.add(name);
container.add(fname);
container.add(mname);
container.add(address);
container.add(city);
container.add(contact);
container.add(email);

container.add(tmail);
container.add(tname);
container.add(tfname);
container.add(tmname);
container.add(taddress);
container.add(tcity);
container.add(tcontact);
container.add(temail);
container.add(rgButton);
container.add(editButton);
}
public void addActionEvent()
{
rgButton.addActionListener(this);
editButton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==rgButton)
{
String umail=tmail.getText();
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew","root","");
Statement stmt=con.createStatement();
String sql="select * from employee where Email='"+umail+"'";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next())
{
tname.setText(rs.getString("Name"));
tfname.setText(rs.getString("F_Name"));
tmname.setText(rs.getString("M_Name"));
taddress.setText(rs.getString("Address"));
tcity.setText(rs.getString("City"));
tcontact.setText(rs.getString("Contact"));
temail.setText(rs.getString("Email"));
}
}
catch(Exception e1){}
}

if(e.getSource()==editButton)
{
String umail1=temail.getText();
String name1=tname.getText();
String fname1=tfname.getText();
String mname1=tmname.getText();
String address1=taddress.getText();
String city1=tcity.getText();
String contact1=tcontact.getText();
String email1=temail.getText();

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew","root","");
Statement stmt=con.createStatement();
String sql="update employee set Name='"+name1+"',F_Name='"+fname1+"',M_Name='"+mname1+"',Address='"+address1+"',City='"+city1+"',Contact='"+contact1+"',Email='"+email1+"' where Email='"+umail1+"'";
stmt.executeUpdate(sql);
JOptionPane.showMessageDialog(this,"Record Updated Successfully");
}
catch(Exception e1){}
}

}
}
class Edit
{
public static void main(String args[])
{
RegisterForm form=new RegisterForm();
form.setTitle("Registration Form");
form.setVisible(true);
form.setBounds(10,10,800,700);
form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
form.setResizable(false);
}
}