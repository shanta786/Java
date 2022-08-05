//Multiple operations using switch case;
class mySwitch2
{
public static void main(String args[])
{

int a,b,c=0;
int n=Integer.parseInt(args[0]);
switch(n)
{
case 1:

a=Integer.parseInt(args[1]);

b=Integer.parseInt(args[2]);
c=0;
c=a+b;
System.out.println(c);
break;
case 2:

a=Integer.parseInt(args[1]);

b=Integer.parseInt(args[2]);
c=0;
c=a-b;
System.out.println(c);
break;
case 3:

a=Integer.parseInt(args[1]);

b=Integer.parseInt(args[2]);
c=0;
c=a*b;
System.out.println(c);
break;
case 4:

a=Integer.parseInt(args[1]);

b=Integer.parseInt(args[2]);
c=0;
c=a/b;
System.out.println(c);
break;
default:
System.out.println("Invalid Input");
}
}
}