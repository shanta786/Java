// Program to find the category of an employee on the basis of basic salary,hra,da and ta
class myEmployee
{
public static void main(String args[])
{
int bs=Integer.parseInt(args[0]);
int hra=Integer.parseInt(args[1]);
int da=Integer.parseInt(args[2]);
int ta=Integer.parseInt(args[3]);
int gs=0;
gs=bs+hra+da+ta;

if(gs>=80000)
{
System.out.println("Manager");
}
else if(gs>=60000 && gs<80000)
{
System.out.println("Accountant");
}
else if(gs>=40000 && gs<60000)
{
System.out.println("Staff");
}
else
{
System.out.println("Not a valid Employee");
}
}
}