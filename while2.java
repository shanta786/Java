//Program for palindrom numbers 121
class while2
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int temp;
temp=n;
int sum=0,r;
while(n!=0)   // 121 , 12,1
{
r=n%10;  // r=1, r=2,1
sum=sum*10 + r;   // sum=0+1=1,sum=10+2=12,sum=120+1=121
n=n/10;             // n=12,1
}
if(sum==temp)
{
System.out.println("Palindrome Number");
}
else
{
System.out.println("Not a Palindrome Number");
}
}
}
