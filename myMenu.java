//Program to create menubar on a frame in an applet window
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="myMenu" width=400 height=400>
</applet>
*/
class MenuFrame extends Frame
{
MenuFrame(String title)
{
super(title);
MenuBar mbar=new MenuBar();
setMenuBar(mbar);

Menu file=new Menu("File");
MenuItem item1,item2,item3,item4,item5;
file.add(item1=new MenuItem("New..."));
file.add(item2=new MenuItem("Open..."));
file.add(item3=new MenuItem("Save..."));
file.add(item4=new MenuItem("Close"));
file.add(item5=new MenuItem("Quit"));
mbar.add(file);

Menu edit=new Menu("Edit");
MenuItem item6,item7,item8,item9;
edit.add(item6=new MenuItem("Cut..."));
edit.add(item7=new MenuItem("Copy..."));
edit.add(item8=new MenuItem("Paste..."));
edit.add(item9=new MenuItem("Special..."));
Menu sub=new Menu("Special");

MenuItem item10,item11,item12;
sub.add(item10=new MenuItem("First"));
sub.add(item11=new MenuItem("Second"));
sub.add(item12=new MenuItem("Third"));
edit.add(sub);
mbar.add(edit);
}
}
public class myMenu extends Applet
{
Frame f;
public void init()
{
f=new MenuFrame("Menu Window");
int width=Integer.parseInt(getParameter("width"));
int height=Integer.parseInt(getParameter("height"));
setSize(new Dimension(width,height));
f.setSize(width,height);
f.setVisible(true);
}
public void start()
{
f.setVisible(true);
}
public void stop()
{
f.setVisible(false);
}
}















