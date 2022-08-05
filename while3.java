//Program for armstrong number 153=1+125+27=153 ,407,370,371
class while3
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int temp;
temp=n;
int sum=0,r;
while(n!=0)  // 153,15,1
{
r=n%10;   // 3,5,1
sum=sum+r*r*r;   //sum=0+27=27,sum=27+125=152,sum=152+1=153
n=n/10;  // n=15,n=1,n=0
}
if(sum==temp)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not an armstrong Number");
}
}
}
