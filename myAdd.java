// Program using funtion(methods) to add two numbers

class myAdd
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
add(a,b);   // a, b parameter
}
public static void add(int i,int j)  // public --access specifier, static---keyword, void --- return type,i,j-----argument
{
int k=0;
k=i+j;
System.out.println("Sum="+k);
}
}

