//Program using call by reference
class TestCall
{
int a,b;
TestCall(int i,int j)
{
a=i;
b=j;
}
void process(TestCall o)
{
o.a *=2;
o.b /=2;
}
}
class callbyReference
{
public static void main(String args[])
{
TestCall obj = new TestCall(15,26);
System.out.println("obj.a and obj.b before call : " + obj.a +"\t" + obj.b);
obj.process(obj);
System.out.println("obj.a and obj.b after call :" + obj.a + "\t" + obj.b);
}
}
