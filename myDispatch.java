//Program using Dynamic method dispatch
final class A
{
final void callme()
{
System.out.println("Inside A's callme method");
}
}
class B extends A
{
void callme()
{
System.out.println("Inside B's callme method");
}
}
class C extends A
{
void callme()
{
System.out.println("Inside C's callme method");
}
}

class myDispatch
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();

A r; // Object reference of a
r=a;
r.callme();

r=b;
r.callme();

r=c;
r.callme();
}
} 





