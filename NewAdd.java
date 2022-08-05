//Program using Parameter Passing
class NewAdd
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int res=0;
res=i+j;
System.out.println("Sum="+res);  // + is a concatenation operator
}
}