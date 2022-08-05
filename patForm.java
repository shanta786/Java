import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.io.*;

class patForm extends JFrame implements ActionListener
{
Container container=getContentPane();
JLabel title = new JLabel("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");

JLabel id = new JLabel("ID");
JLabel name = new JLabel("Name");
JLabel dis = new JLabel("Disease");
JLabel gen = new JLabel("Gender");
JLabel admsts = new JLabel("Admit Status");
JLabel age = new JLabel("Age");

String gn[]={"Male","Female"};
String as[]={"YES","NO"};


JTextField tid = new JTextField();
JTextField tname = new JTextField();
JTextField tdis = new JTextField();
JComboBox tgen = new JComboBox(gn);
JComboBox tadmsts = new JComboBox(as);
JTextField tage = new JTextField();

JButton addButton = new JButton("Add");
JButton resetButton = new JButton("Reset");
JButton backButton = new JButton("Back");

patForm()
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
title.setBounds(75,100,650,35);
title.setFont(new Font("Arial",Font.BOLD,25));
title.setForeground(Color.RED);

id.setBounds(200,150,150,30);
id.setFont(new Font("Arial",Font.BOLD,20));

name.setBounds(200,190,150,30);
name.setFont(new Font("Arial",Font.BOLD,20));

dis.setBounds(200,230,150,30);
dis.setFont(new Font("Arial",Font.BOLD,20));

gen.setBounds(200,270,150,30);
gen.setFont(new Font("Arial",Font.BOLD,20));

admsts.setBounds(200,310,150,30);
admsts.setFont(new Font("Arial",Font.BOLD,20));

age.setBounds(200,350,150,30);
age.setFont(new Font("Arial",Font.BOLD,20));

tid.setBounds(360,150,200,30);
tid.setFont(new Font("Arial",Font.BOLD,15));

tname.setBounds(360,190,200,30);
tname.setFont(new Font("Arial",Font.BOLD,15));

tdis.setBounds(360,230,200,30);
tdis.setFont(new Font("Arial",Font.BOLD,15));

tgen.setBounds(360,270,200,30);
tgen.setFont(new Font("Arial",Font.BOLD,15));

tadmsts.setBounds(360,310,200,30);
tadmsts.setFont(new Font("Arial",Font.BOLD,15));

tage.setBounds(360,350,200,30);
tage.setFont(new Font("Arial",Font.BOLD,15));

addButton.setBounds(250,500,100,30);
addButton.setFont(new Font("Arial",Font.BOLD,15));

resetButton.setBounds(370,500,100,30);
resetButton.setFont(new Font("Arial",Font.BOLD,15));

backButton.setBounds(490,500,100,30);
backButton.setFont(new Font("Arial",Font.BOLD,15));
}
public void addComponentsToContainer()
{
container.add(title);

container.add(id);
container.add(name);
container.add(dis);
container.add(gen);
container.add(admsts);
container.add(age);

container.add(tid);
container.add(tname);
container.add(tdis);
container.add(tgen);
container.add(tadmsts);
container.add(tage);

container.add(addButton);
container.add(resetButton);
container.add(backButton);
}
public void addActionEvent()
{
addButton.addActionListener(this);
resetButton.addActionListener(this);
backButton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==addButton)
{
String a;
String b;
String c;
String d;
String e1;
String f;
a=tid.getText();
b=tname.getText();
c=tdis.getText();
d=tgen.getSelectedItem().toString();
e1=tadmsts.getSelectedItem().toString();
f=tage.getText();

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew","root","");
Statement stmt=con.createStatement();
stmt.executeUpdate("insert into patient values('"+a+"','"+b+"','"+c+"','"+d+"','"+e1+"','"+f+"');");
JOptionPane.showMessageDialog(this,"Records inserted successfully");
}
catch(Exception e2)
{}
}
if(e.getSource()==resetButton)
{
tid.setText("");
tname.setText("");
tdis.setText("");
tage.setText("");
}
if(e.getSource()==backButton)
{
Form2 form = new Form2();
form.setTitle("Hospital Management System");
form.setVisible(true);
form.setBounds(100,100,740,700);
form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
form.setResizable(false);
this.setVisible(false);
}

}
}