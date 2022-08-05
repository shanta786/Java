//Program using inheritance
class Person
{
String name;
int age;
String address;
void setData(String a,int b,String c)
{
name=a;
age=b;
address=c;
}
void display()
{
System.out.println("Name ="+name);
System.out.println("Age ="+age);
System.out.println("Address ="+address);
}
}
class Employee extends Person
{
double salary;
void setSalary(double d)
{
salary = d;
}
void displaySalary()
{
System.out.println("Salary = " + salary);
}
}
class myMainInherit2
{
public static void main(String args[])
{
Employee obj = new Employee();
obj.setData("Rohit",23,"Lucknow");
obj.setSalary(45000);
obj.display();
obj.displaySalary();
}
}