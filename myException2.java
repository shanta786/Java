//Program generating exception
class myException2
{
public static void main(String args[])
{
try
{
int d;
int a=4;
int b=0;
d=a/b;
System.out.println(d);
}
catch(ArithmeticException e)
{
System.out.println("Exception has occured "+ e);
}
}
}