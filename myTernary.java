//Program using ternary operator
class myTernary
{
public static void main(String args[])
{
int i,k;
i=10;
k = i<0 ? -i : i;
System.out.println("The absolute value of "+i+" is :\t"+k);

i=-10;
k = i<=0 ? -i : i;
System.out.println("The absolute value of  "+i +" is :\t" + k);

}
}
