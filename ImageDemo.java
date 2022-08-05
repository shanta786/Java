/*
<applet code="ImageDemo" width=500 height=500>
<param name="img" value="java_logo.jpg">
</applet>
*/
import java.awt.*;
import java.applet.*;
public class ImageDemo extends Applet
{
Image img;
public void init()
{
img=getImage(getDocumentBase(),getParameter("img"));
}
public void paint(Graphics g)
{
g.drawImage(img,100,100,200,200,this);
}
}