//Program using method overloading
class shape
{
void area(int a)
{
int res=0;
res=a*a;
System.out.println("Area of square = "+res);
}
void area(int a,int b)
{
int res=0;
res =a*b;
System.out.println("Area of Rectangle ="+res);
}
}
class myMain4
{
public static void main(String args[])
{
shape obj=new shape();
obj.area(4);
obj.area(5,6);
}
}
