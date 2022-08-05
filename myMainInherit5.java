//Program using super in inheritance
class Person
{
String name;
int age;
String address;
Person(String a,int b,String c)
{
name=a;
age=b;
address=c;
}
void show()
{
System.out.println("Name : "+name);
System.out.println("Age : "+age);
System.out.println("Address : "+address);
}
}
class Employee extends Person
{
double salary;
Employee(String a,int b,String c,double d)
{
super(a,b,c);  // super keyword is used to call the constructor of the base class
salary=d;
}
void display()
{
System.out.println("Name : "+name);
System.out.println("Age : "+age);
System.out.println("Address : "+address);
System.out.println("Salary : "+salary);
}
}
class myMainInherit5
{
public static void main(String args[])
{
Employee obj=new Employee("Pallabh",23,"Lucknow",67000);
obj.display();
}
}
