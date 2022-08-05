//Program to demostrate Choice List
import java.awt.*;
import java.applet.*;
/*
<applet code="myChoicelist" width=300 height=300>
</applet>
*/

public class myChoicelist extends Applet
{
Choice city;
public void init()
{
city = new Choice();

city.add("Select City");
city.add("Delhi");
city.add("Mumbai");
city.add("Jaipur");
city.add("Bangalore");
city.add("Lucknow");

add(city);
}
}