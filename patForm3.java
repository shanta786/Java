import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.io.*;

class patForm3 extends JFrame implements ActionListener
{
Container container=getContentPane();
JLabel title = new JLabel("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");

JLabel did = new JLabel("Enter the Patient ID:");
JLabel id = new JLabel("ID");
JLabel name = new JLabel("Name");
JLabel dis = new JLabel("Disease");
JLabel gen = new JLabel("Gender");
JLabel admsts = new JLabel("Admit Status");
JLabel age = new JLabel("Age");

JTextField tdid = new JTextField();
JTextField tid = new JTextField();
JTextField tname = new JTextField();
JTextField tdis = new JTextField();
JTextField tgen = new JTextField();
JTextField tadmsts = new JTextField();
JTextField tage = new JTextField();

JButton deleteButton = new JButton("Delete");
JButton searchButton = new JButton("Search");
JButton backButton = new JButton("Back");

patForm3()
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
title.setBounds(75,50,650,35);
title.setFont(new Font("Arial",Font.BOLD,25));
title.setForeground(Color.RED);

did.setBounds(200,100,150,30);
did.setFont(new Font("Arial",Font.BOLD,20));

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

tdid.setBounds(360,100,150,30);
tdid.setFont(new Font("Arial",Font.BOLD,15));

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

deleteButton.setBounds(250,500,100,30);
deleteButton.setFont(new Font("Arial",Font.BOLD,15));

backButton.setBounds(490,500,100,30);
backButton.setFont(new Font("Arial",Font.BOLD,15));

searchButton.setBounds(520,100,100,30);
searchButton.setFont(new Font("Arial",Font.BOLD,15));
}

public void addComponentsToContainer()
{
container.add(title);

container.add(did);
container.add(id);
container.add(name);
container.add(dis);
container.add(gen);
container.add(admsts);
container.add(age);

container.add(tdid);
container.add(tid);
container.add(tname);
container.add(tdis);
container.add(tgen);
container.add(tadmsts);
container.add(tage);

container.add(deleteButton);
container.add(backButton);
container.add(searchButton);
}
public void addActionEvent()
{
deleteButton.addActionListener(this);
backButton.addActionListener(this);
searchButton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==deleteButton)
{
String aa;
aa=tdid.getText();

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew","root","");
Statement stmt=con.createStatement();
String sql="delete from patient where ID='"+aa+"'";
stmt.executeUpdate(sql);
JOptionPane.showMessageDialog(this,"Record deleted successfully");
}
catch(Exception e2)
{}
}
if(e.getSource()==searchButton)
{
String a1=tdid.getText();
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew","root","");
Statement stmt=con.createStatement();
String sql="select * from patient where ID='"+a1+"'";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next())
{
tid.setText(rs.getString("ID"));
tname.setText(rs.getString("Name"));
tdis.setText(rs.getString("Disease"));
tgen.setText(rs.getString("Gender"));
tadmsts.setText(rs.getString("Admit_Status"));
tage.setText(rs.getString("Age"));
}
}
catch(Exception e1){}
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