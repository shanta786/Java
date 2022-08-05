//Program to draw line
import java.io.*;
import java.awt.*;
import java.applet.*;
/*
<applet code="Lines" width=300 height=200>
</applet>
*/
public class Lines extends Applet
{
public void paint(Graphics g)
{
g.drawLine(0,0,100,100);
g.drawLine(0,100,100,0);
g.drawLine(40,25,250,180);
g.drawLine(75,90,200,200);
}
}