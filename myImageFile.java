//Program for Image in an applet window
/*
<applet code="myImageFile" width=500 height=500>
<param name="img" value="java_logo1.jpg">
</applet>
*/

import java.awt.*;
import java.applet.*;

public class myImageFile extends Applet
{
Image img;
boolean error=false;
String imgname;
public void init()
{
setBackground(Color.BLUE);
imgname=getParameter("img");
img = getImage(getDocumentBase(),imgname);
}
public void paint(Graphics g)
{
if(error)
{
Dimension d=getSize();
g.setColor(Color.RED);
g.fillRect(0,0,d.width,d.height);
g.setColor(Color.BLACK);
g.drawString("Image Not Found :" + imgname,10,d.height/2);
}
else
{
g.drawImage(img,0,0,this);
}
}
public void update(Graphics g)
{
paint(g);
}
public boolean imageUpdate(Image img,int flags,int x,int y,int w,int h)
{
if((flags & SOMEBITS)!=0)
{
repaint(x,y,w,h);
}
else if((flags & ABORT)!=0)
{
error=true;
repaint();
}
return(flags & (ALLBITS|ABORT))==0;
}
}



















