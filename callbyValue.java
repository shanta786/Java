//Program using call by value
class TestCall
{
void process(int i,int j)
{
i *= 2; // i = i*2
j /= 2;  // j = j/2
}
}
class callbyValue
{
public static void main(String args[])
{
TestCall obj = new TestCall();
int a=15, b=26;
System.out.println("a and b before call : " + a +"\t" + b);
obj.process(a,b);
System.out.println("a and b after call :" + a + "\t" + b);
}
}
