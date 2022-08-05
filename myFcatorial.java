//Program to find the factorial of a number using function(method)

class myFcatorial
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
fact(n);
}
public static void fact(int m)
{
int f=1;
for(int i=1;i<=m;i++)
{
f=f*i;
}
System.out.println("Factorial ="+f);
}
}
