//Program using methods to reverse any number
class myReverse
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
myrev(n);
}
public static void myrev(int m)
{
int sum=0;
int r;
while(m!=0)  // 123 , 12 , 1
{
r=m%10;  // 3, 2, 1
sum=sum*10 + r;  // 3, 32, 321
m=m/10;      // 12  ,1 ,0
}
System.out.println("The reverse of a number ="+sum);
}
}
