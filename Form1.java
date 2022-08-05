//Next Form
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.io.*;

class Form1 extends JFrame implements ActionListener
{
Container container=getContentPane();
JLabel title = new JLabel("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");

JButton doctButton=new JButton("Doctor Details");
JButton patButton=new JButton("Patient Details");
JButton extButton=new JButton("EXIT");

Form1()
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
doctButton.setBounds(200,200,300,30);
doctButton.setFont(new Font("Arial",Font.PLAIN,20));
patButton.setBounds(200,300,300,30);
patButton.setFont(new Font("Arial",Font.PLAIN,20));
extButton.setBounds(200,400,300,30);
extButton.setFont(new Font("Arial",Font.PLAIN,20));
}
public void addComponentsToContainer()
{
container.add(title);
container.add(doctButton);
container.add(patButton);
container.add(extButton);
}
public void addActionEvent()
{
doctButton.addActionListener(this);
patButton.addActionListener(this);
extButton.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==doctButton)
{
Form2 form=new Form2();
form.setTitle("Hospital Management System");
form.setVisible(true);
form.setBounds(100,100,740,700);
form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
form.setResizable(false);
this.setVisible(false);
}
if(e.getSource()==patButton)
{
Form3 form=new Form3();
form.setTitle("Hospital Management System");
form.setVisible(true);
form.setBounds(100,100,740,700);
form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
form.setResizable(false);
this.setVisible(false);
}
if(e.getSource()==extButton)
{
setVisible(false);
dispose();
System.exit(0);
}
}
}





