//Program using multiple catch block
class MultipleCatch
{
public static void main(String args[])
{
try
{
int l=args.length;
System.out.println("l=" + l);
int b=42/l;
int c[]={1,2,3};
System.out.println(b);
System.out.println(c[4]);
}
catch(ArithmeticException e1)
{
System.out.println("Divide by Zero " + e1);
return;
}
catch(ArrayIndexOutOfBoundsException e2)
{
System.out.println("Array Index Out of Bounds Exception " + e2);
}
}
}
