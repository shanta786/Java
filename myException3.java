//Program using exception handling
class myException3
{
public static void main(String args[])
{
try
{
int a[]={1,2,3};
System.out.println(a[4]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Here the exception has occured");
}
}
}