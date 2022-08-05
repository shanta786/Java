//Program to generate fibonaci series  0 1 1 2 3 5 8 13.................
class for7
{
public static void main(String args[])
{
int first=0,second=1,next;
int n=Integer.parseInt(args[0]);
for(int i=0;i<n;i++)
{
if(i<=1)
{
System.out.print(i+"\t");
}
else
{
next=first+second;
System.out.print(next+"\t");
first=second;
second=next;
}
}
}
}
