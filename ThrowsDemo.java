//Program using throws keyword
class ThrowsDemo
{
static void throwOne() throws IllegalAccessException
{
System.out.println("Inside ThrowOne() method");
throw new IllegalAccessException("demo");
}
public static void main(String args[])
{
try
{
throwOne();
}
catch(IllegalAccessException e)
{
System.out.println("Exception Caught :" + e);
}
}
}
