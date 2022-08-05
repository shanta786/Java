//Using Run Time Polymorphism
class Figure
{
double dim1;
double dim2;

Figure(double a,double b)
{
dim1=a;
dim2=b;
}
double area()
{
System.out.println("Area of figure is not defined");
return 0;
}
}
class Rectangle extends Figure
{
Rectangle(double a,double b)
{
super(a,b);  // To call the constructor of base class
}
double area()
{
System.out.println("Area for Rectangle =");
return dim1*dim2;
}
}
class Triangle extends Figure
{
Triangle(double a,double b)
{
super(a,b);
}
double area()
{
System.out.println("Area of Triangle =");
return (dim1*dim2)/2;
}
}
class myFindAreas
{
public static void main(String args[])
{
Figure f=new Figure(10,10);
Rectangle r=new Rectangle(5,5);
Triangle t=new Triangle(10,8);
Figure obj;  // obj is an object reference of Figure

obj=r;
System.out.println("Area is ="+obj.area());

obj=t;
System.out.println("Area is ="+obj.area());

obj=f;
System.out.println("Area is ="+obj.area());

}
}






















