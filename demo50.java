class demo50
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int i=2;
int count=0;
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
System.out.println("Prime No");
}
else
{
System.out.println("Not a Prime No");
}
}
}