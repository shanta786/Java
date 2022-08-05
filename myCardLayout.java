//Program using CardLayout
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="myCardLayout" width=400 height=300>
</applet>
*/

public class myCardLayout extends Applet implements ActionListener, MouseListener
{
Checkbox win98,winNT,solaries,mac;
Panel oscards;
CardLayout cardLout;
Button Win,Other;

public void init()
{
Win = new Button("Windows");
Other = new Button("Other");
add(Win);
add(Other);

cardLout = new CardLayout();
oscards = new Panel();
oscards.setLayout(cardLout);

win98 = new Checkbox("Windows 98/XP",null,true);
winNT=new Checkbox("Windows NT/2000");
solaries=new Checkbox("Solaries");
mac = new Checkbox("MacOS");

Panel winPan = new Panel();
winPan.add(win98);
winPan.add(winNT);

Panel otherPan=new Panel();
otherPan.add(solaries);
otherPan.add(mac);

oscards.add(winPan,"Windows");
oscards.add(otherPan,"Other");

add(oscards);

Win.addActionListener(this);
Other.addActionListener(this);

addMouseListener(this);
}

public void mousePressed(MouseEvent me)
{
cardLout.next(oscards);
}
public void mouseClicked(MouseEvent me)
{
}
public void mouseEntered(MouseEvent me)
{
}
public void mouseExited(MouseEvent me)
{
}
public void mouseReleased(MouseEvent me)
{
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==Win)
{
cardLout.show(oscards,"Windows");
}
else
{
cardLout.show(oscards,"Other");
}
}
}




























 