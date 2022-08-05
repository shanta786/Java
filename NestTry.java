//Nested try block
class NestTry
{
public static void main(String args[])
{
try
{
int a=args.length;
int b=42/a;
System.out.println("a =" + a);
try
{
if(a==1)
a=a/a-a;
if(a==2)
{
int c[]={1};
c[42]=99;
}
}
catch(ArrayIndexOutOfBoundsException e1)
{
System.out.println("Array Index Out Of Bounds Exception " + e1);
}
}
catch(ArithmeticException e2)
{
System.out.println("Arithmetic exception has occured " + e2);
}
}
}