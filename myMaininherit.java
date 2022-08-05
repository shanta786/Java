//Program using inheritance
final class A
{
int i , j;

void show()
{
System.out.println("i and j :"+ i + "\t" +j);
}
}

class B extends A
{
int k;
void display()
{
System.out.println("k :" +k);
}
}
class myMaininherit
{
public static void main(String args[])
{
A obj1=new A();
B obj2=new B();

obj1.i = 10;
obj1.j = 20;

System.out.println("Contents of class A=");
obj1.show();
System.out.println();

obj2.i=5;
obj2.j=15;
obj2.k=25;

System.out.println("Contents of class B=");
obj2.show();
obj2.display();
}
}





