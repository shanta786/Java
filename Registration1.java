//Program for Registration Form using JFrame

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


class RegisterForm extends JFrame implements ActionListener
{
Container container=getContentPane();
JLabel title=new JLabel("REGISTRATION FORM");
JLabel name=new JLabel("Name");
JLabel fname=new JLabel("Father Name");
JLabel mname=new JLabel("Mother Name");
JLabel address=new JLabel("Address");
JLabel city=new JLabel("City");
JLabel contact=new JLabel("Contact");
JLabel email=new JLabel("Email");


String city1[]={"Delhi","Mumbai","Chennai","Bangalore","Kolkata","Jaipur","Agra","Lucknow"};

JTextField tname=new JTextField();
JTextField tfname=new JTextField();
JTextField tmname=new JTextField();
JTextArea taddress=new JTextArea();
JComboBox tcity=new JComboBox(city1);
JTextField tcontact=new JTextField();
JTextField temail=new JTextField();

JButton rgButton=new JButton("Register");
JButton resetButton=new JButton("Reset");

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
title.setBounds(200,50,400,30);
title.setFont(new Font("Arial",Font.PLAIN,30));

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

tname.setBounds(360,190,200,30);
tname.setFont(new Font("Arial",Font.PLAIN,15));

tfname.setBounds(360,230,200,30);
tfname.setFont(new Font("Arial",Font.PLAIN,15));

tmname.setBounds(360,270,200,30);
tname.setFont(new Font("Arial",Font.PLAIN,15));

taddress.setBounds(360,310,200,30);
taddress.setFont(new Font("Arial",Font.PLAIN,15));

tcity.setBounds(360,350,100,30);
tcity.setFont(new Font("Arial",Font.PLAIN,15));

tcontact.setBounds(360,390,200,30);
tcontact.setFont(new Font("Arial",Font.PLAIN,15));

temail.setBounds(360,430,200,30);
temail.setFont(new Font("Arial",Font.PLAIN,15));

rgButton.setBounds(250,500,100,30);
rgButton.setFont(new Font("Arial",Font.PLAIN,15));

resetButton.setBounds(370,500,100,30);
resetButton.setFont(new Font("Arial",Font.PLAIN,15));
}

public void addComponentsToContainer()
{
container.add(title);
container.add(name);
container.add(fname);
container.add(mname);
container.add(address);
container.add(city);
container.add(contact);
container.add(email);

container.add(tname);
container.add(tfname);
container.add(tmname);
container.add(taddress);
container.add(tcity);
container.add(tcontact);
container.add(temail);

container.add(rgButton);
container.add(resetButton);
}
public void addActionEvent()
{
rgButton.addActionListener(this);
resetButton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==rgButton)
{
String name;
String fname;
String mname;
String address;
String city;
String contact;
String email;
name=tname.getText();
fname=tfname.getText();
mname=tmname.getText();
address=taddress.getText();
city=tcity.getSelectedItem().toString();
contact=tcontact.getText();
email=temail.getText();
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew","root","");
Statement stmt=con.createStatement();
stmt.executeUpdate("insert into employee value('"+name+"','"+fname+"','"+mname+"','"+address+"','"+city+"','"+contact+"','"+email+"');");
JOptionPane.showMessageDialog(this,"Records Inserted Successfully");
}
catch(Exception e1){}
}
if(e.getSource()==resetButton)
{
tname.setText("");
tfname.setText("");
tmname.setText("");
taddress.setText("");
tcontact.setText("");
temail.setText("");
}
}
}
class Registration1
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