//Program to demonstrate checkbox

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="myCheckbox" width=300 height=300>
</applet>
*/

public class myCheckbox extends Applet
{
String msg;
Checkbox ch1,ch2,ch3,ch4;
public void init()
{
ch1=new Checkbox("Delhi",null,true);
ch2=new Checkbox("Mumbai");
ch3=new Checkbox("Bangalore");
ch4=new Checkbox("Lucknow");

add(ch1);
add(ch2);
add(ch3);
}
}