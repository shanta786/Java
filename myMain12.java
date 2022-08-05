interface Figure
{
public void area(double a);
public void perimeter(double b);
}
class myInterface implements Figure
{
public void area(double a)
{
double res;
res=(a*a)*(3.141);
System.out.println("Area = " + res);
}
public void perimeter(double b)
{
double res;
res = (2)*(3.141)*(b);
System.out.println("Perimeter ="+res);
}
}
class myMain12
{
public static void main(String args[])
{
myInterface obj = new myInterface();
obj.area(5);
obj.perimeter(6);
}
}
