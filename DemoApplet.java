//Program using applet
import java.awt.*;
import java.applet.*;
/*
<applet code="DemoApplet" width=300 height=300>
</applet>
*/
public class DemoApplet extends Applet
{
String msg;
public void init()
{
setBackground(Color.red);
setForeground(Color.yellow);
msg="Welcome init()--";
}
public void start()
{
msg+="Welcome start()--";
}
public void paint(Graphics g)
{
msg+="Welcome paint().";
g.drawString(msg,30,100);
}
}