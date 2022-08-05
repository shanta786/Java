//Program for Method Overriding using inheritance
class Triangle
{
double base,height;
double res;
final void area(double a,double b)
{
base=a;
height=b;
res=(base*height)/2;
System.out.println("The area of triangle = "+res);
}
}
class Rectangle extends Triangle
{
double width,length;
double res;
void area(double a,double b)
{
width=a;
length=b;
res=a*b;
System.out.println("The area of rectangle =" + res);
}
}
class myMainInherit7
{
public static void main(String args[])
{
Rectangle obj=new Rectangle();
obj.area(5,7);
}
}
