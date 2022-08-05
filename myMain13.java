interface intf1
{
public void show();
}
interface intf2
{
public void display();
}
class intfmainfile implements intf1,intf2
{
public void show()
{
System.out.println("This is the method of interface 1");
}
public void display()
{
System.out.println("This is the method of interface 2");
}
}
class myMain13
{
public static void main(String args[])
{
intfmainfile obj = new intfmainfile();
obj.show();
obj.display();
}
}