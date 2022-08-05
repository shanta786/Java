class for5
{
public static void main(String args[])
{
int row = Integer.parseInt(args[0]);
int sp;
sp=row-1;
for(int i=1;i<=row;i++)
{
for(int j=1;j<=sp;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++)  // 1,3,5
{
System.out.print("*");
}
sp--;
System.out.println();
}
}
}
