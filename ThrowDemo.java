//Program using throw keyword
class ThrowDemo
{
public static void main(String args[])
{
try
{
demoproc();
}
catch(NullPointerException e)
{
System.out.println("Exception Occured Again in main() method" + e);
}
}
public static void demoproc()
{
try
{
throw new NullPointerException("demo");  // Here manually exception has been thrown
}
catch(NullPointerException e1)
{
System.out.println("Exception caught in demoproc() method");
throw e1;
}
}
}
