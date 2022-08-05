//Program using Inheritance
class A
{
int i;
protected int j;  // protected ---- access specifier, public ,private

void setData(int a,int b)
{
i=a;
j=b;
}
}
class B extends A
{
int res;
void sum()
{
res=i+j;
}
}

class myMainInherit1
{
public static void main(String args[])
{
B obj = new B();
obj.setData(5,10);

obj.sum();
System.out.println("Sum = "+ obj.res);
}
}
