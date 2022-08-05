//Program using nested for loop
class myFor5
{
public static void main(String args[])
{
int row=Integer.parseInt(args[0]);
int sp;
sp=row-1;
int i,j;
for(i=1;i<=row;i++)
{
for(int k=1;k<=sp;k++)
{
System.out.print(" ");
}
for(j=1;j<=2*i-1;j++)
{
System.out.print("*");
}
System.out.println();
sp--;
}
}
}