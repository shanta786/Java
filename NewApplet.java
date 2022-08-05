//Program using applet
import java.awt.*;
import java.applet.*;
/*
<applet code="NewApplet" width=300 height=300>
</applet>
*/
public class NewApplet extends Applet
{
public void paint(Graphics g)
{
g.drawString("My First Applet",50,100);
}
}