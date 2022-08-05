//Program to fix labels in an applet window
import java.awt.*;
import java.applet.*;
/*
<applet code="myLabel" width=300 height=300>
</applet>
*/
public class myLabel extends Applet
{
public void init()
{
Label one=new Label("One");
Label two=new Label("Two");
Label three=new Label("Three");

add(one);
add(two);
add(three);
}
}
