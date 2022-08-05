// Factorial using recursion

class Factorial
{
int fact(int n)  // n=5
{
int result;
if(n==1)
{
return 1;
}
result = n*fact(n-1);  // 5*4*3*2*1=120
return result;
}
}
class myRecursion
{
public static void main(String args[])
{
Factorial obj = new Factorial();

System.out.println("Factorial of 5 is =" + obj.fact(5));
System.out.println("Factorial of 6 is =" + obj.fact(6));
System.out.println("Factorial of 7 is =" + obj.fact(7));
}
}