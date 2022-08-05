//Program for even and odd using switch case

class mySwitch1
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int m=n%2;
switch(m)
{
case 0:
System.out.println("Even Number");
break;
default:
System.out.println("Odd Number");
}
}
}

