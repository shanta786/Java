//Program for number pattern
class for4
{
public static void main(String args[])
{
int row=Integer.parseInt(args[0]);
int i,j;
for(i=1;i<=row;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}