//Program using Constructor Overloading
class Box
{
double length;
double width;
double height;
Box()
{
length = 0;
width = 0;
height = 0;
double vol=0;
vol = length*width*height;
System.out.println("The volume of the box = "+ vol);
}
Box(double i,double j,double k)
{
length = i;
width = j;
height = k;
double vol=0;
vol = length*width*height;
System.out.println("The volume of the box = "+ vol);
}
}
class myMain5
{
public static void main(String args[])
{
Box b=new Box();
Box c=new Box(4,5,6);
}
}











 

