// Use of super keyword
class A
{
int i;
}
class B extends A
{
int i;
B(int a,int b)
{
super.i=a;
i=b;
}
void show()
{
System.out.println("i in base class = "+ super.i);
System.out.print("i in derived class ="+ i);
}
}
class myMainInherit6
{
public static void main(String args[])
{
B obj = new B(5,10);
obj.show();
}
}
