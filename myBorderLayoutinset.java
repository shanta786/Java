//Program using BorderLayout
import java.awt.*;
import java.applet.*;
import java.util.*;
/*
<applet code="myBorderLayoutinset" width=400 height=300>
</applet>
*/
public class myBorderLayoutinset extends Applet
{
public void init()
{
setLayout(new BorderLayout());
add(new Button("This is across the top."),BorderLayout.NORTH);
add(new Label("The footer message might go here"),BorderLayout.SOUTH);
add(new Button("Right"),BorderLayout.EAST);
add(new Button("Left"),BorderLayout.WEST);

String msg="Welcome to all for Java training at PPTech Services"+"as well as for Python training";

add(new TextArea(msg),BorderLayout.CENTER);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}
}