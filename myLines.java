//Program to draw lines
import java.awt.*;
import java.applet.*;
/*
<applet code="myLines" width=300 height=300>
</applet>
*/
public class myLines extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10,40,100,100);
g.drawLine(10,100,200,300);
g.drawLine(0,0,300,300);
g.drawLine(50,50,250,250);
g.drawLine(5,290,80,19);
}
}