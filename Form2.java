import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.io.*;

class Form2 extends JFrame implements ActionListener
{
Container container=getContentPane();
JLabel title = new JLabel("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");
JLabel title1 = new JLabel("Welcome to Doctor Details");

JButton addButton=new JButton("Add Record");
JButton editButton=new JButton("Edit Record");
JButton searchButton=new JButton("Search Record");
JButton deleteButton=new JButton("Delete Record");
JButton backButton=new JButton("Back");

Form2()
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

title1.setBounds(125,150,650,35);
title1.setFont(new Font("Arial",Font.BOLD,25));
title1.setForeground(Color.BLUE);

addButton.setBounds(200,200,300,30);
addButton.setFont(new Font("Arial",Font.PLAIN,20));
editButton.setBounds(200,300,300,30);
editButton.setFont(new Font("Arial",Font.PLAIN,20));
searchButton.setBounds(200,400,300,30);
searchButton.setFont(new Font("Arial",Font.PLAIN,20));
deleteButton.setBounds(200,500,300,30);
deleteButton.setFont(new Font("Arial",Font.PLAIN,20));
backButton.setBounds(200,600,300,30);
backButton.setFont(new Font("Arial",Font.PLAIN,20));
}
public void addComponentsToContainer()
{
container.add(title);
container.add(title1);
container.add(addButton);
container.add(editButton);
container.add(searchButton);
container.add(deleteButton);
container.add(backButton);
}
public void addActionEvent()
{
backButton.addActionListener(this);
addButton.addActionListener(this);
editButton.addActionListener(this);
searchButton.addActionListener(this);
deleteButton.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==backButton)
{
Form1 form = new Form1();
form.setTitle("Hospital Management System");
form.setVisible(true);
form.setBounds(100,100,740,700);
form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
form.setResizable(false);
this.setVisible(false);
}
if(e.getSource()==addButton)
{
docForm form = new docForm();
form.setTitle("Hospital Management System");
form.setVisible(true);
form.setBounds(100,100,740,700);
form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
form.setResizable(false);
this.setVisible(false);
}
if(e.getSource()==editButton)
{
docForm1 form = new docForm1();
form.setTitle("Hospital Management System");
form.setVisible(true);
form.setBounds(100,100,740,700);
form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
form.setResizable(false);
this.setVisible(false);
}
if(e.getSource()==searchButton)
{
docForm2 form = new docForm2();
form.setTitle("Hospital Management System");
form.setVisible(true);
form.setBounds(100,100,740,700);
form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
form.setResizable(false);
this.setVisible(false);
}
if(e.getSource()==deleteButton)
{
docForm3 form = new docForm3();
form.setTitle("Hospital Management System");
form.setVisible(true);
form.setBounds(100,100,740,700);
form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
form.setResizable(false);
this.setVisible(false);
}
}
}