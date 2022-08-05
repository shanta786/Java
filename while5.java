// Program for Prime number self divisible or divisible by 1 such as 7,11,13........
class while5
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int count=0;
int i=2;
while(i<n)
{
if(n%i==0)
{
count=1;
break;
}
i++;
}
if(count==0)
{
System.out.println("Prime Number");
}
else
{
System.out.println("Not a Prime Number");
}
}
}
