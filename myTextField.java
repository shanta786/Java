//Program to demonstrate text field
import java.awt.*;
import java.applet.*;
/*
<applet code="myTextField" width=300 height=300>
</applet>
*/

public class myTextField extends Applet
{
TextField t1,t2;
Button b1;
public void init()
{
Label uid=new Label("User Id:");
Label pass=new Label("Password");

t1=new TextField(12);
t2=new TextField(8);

b1=new Button("Login");

add(uid);
add(t1);
add(pass);
add(t2);
add(b1);
}
}



