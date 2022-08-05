import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.io.*;

class docForm extends JFrame implements ActionListener
{
Container container=getContentPane();
JLabel title = new JLabel("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");

JLabel id = new JLabel("ID");
JLabel name = new JLabel("Name");
JLabel spl = new JLabel("Specialization");
JLabel timing = new JLabel("Timing");
JLabel qlf = new JLabel("Qualification");
JLabel rmno = new JLabel("Room No.");

String spli[]={"ENT","Physician","Child Specialist","Artho"};
String tm[]={"10:00 - 4:00","8:00 - 12:00"};
String ql[]={"MBBS","MD","BDM","MBBS-MS","MBBS-MD"};

JTextField tid = new JTextField();
JTextField tname = new JTextField();
JComboBox tspl = new JComboBox(spli);
JComboBox ttiming = new JComboBox(tm);
JComboBox tqlf = new JComboBox(ql);
JTextField trmno = new JTextField();

JButton rgButton = new JButton("Add");
JButton resetButton = new JButton("Reset");
JButton backButton = new JButton("Back");

docForm()
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

spl.setBounds(200,230,150,30);
spl.setFont(new Font("Arial",Font.BOLD,20));

timing.setBounds(200,270,150,30);
timing.setFont(new Font("Arial",Font.BOLD,20));

qlf.setBounds(200,310,150,30);
qlf.setFont(new Font("Arial",Font.BOLD,20));

rmno.setBounds(200,350,150,30);
rmno.setFont(new Font("Arial",Font.BOLD,20));

tid.setBounds(360,150,200,30);
tid.setFont(new Font("Arial",Font.BOLD,15));

tname.setBounds(360,190,200,30);
tname.setFont(new Font("Arial",Font.BOLD,15));

tspl.setBounds(360,230,200,30);
tspl.setFont(new Font("Arial",Font.BOLD,15));

ttiming.setBounds(360,270,200,30);
ttiming.setFont(new Font("Arial",Font.BOLD,15));

tqlf.setBounds(360,310,200,30);
tqlf.setFont(new Font("Arial",Font.BOLD,15));

trmno.setBounds(360,350,200,30);
trmno.setFont(new Font("Arial",Font.BOLD,15));

rgButton.setBounds(250,500,100,30);
rgButton.setFont(new Font("Arial",Font.BOLD,15));

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
container.add(spl);
container.add(timing);
container.add(qlf);
container.add(rmno);

container.add(tid);
container.add(tname);
container.add(tspl);
container.add(ttiming);
container.add(tqlf);
container.add(trmno);

container.add(rgButton);
container.add(resetButton);
container.add(backButton);
}
public void addActionEvent()
{
rgButton.addActionListener(this);
resetButton.addActionListener(this);
backButton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==rgButton)
{
String a;
String b;
String c;
String d;
String e1;
String f;
a=tid.getText();
b=tname.getText();
c=tspl.getSelectedItem().toString();
d=ttiming.getSelectedItem().toString();
e1=tqlf.getSelectedItem().toString();
f=trmno.getText();

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew","root","");
Statement stmt=con.createStatement();
stmt.executeUpdate("insert into doctor values('"+a+"','"+b+"','"+c+"','"+d+"','"+e1+"','"+f+"');");
JOptionPane.showMessageDialog(this,"Records inserted successfully");
}
catch(Exception e2)
{}
}
if(e.getSource()==resetButton)
{
tid.setText("");
tname.setText("");
trmno.setText("");
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









