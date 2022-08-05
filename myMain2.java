//Program using classes
class Person
{
String name;
int age;
String address;
String email;
Person(String a,int b,String c,String d)   // It is a constructor used to initialise the object
{
name = a;
age = b;
address = c;
email = d;
}
void display()
{
System.out.println("Name ="+name);
System.out.println("Age ="+age);
System.out.println("Address ="+address);
System.out.println("Email ="+email);
}
}

class myMain2
{
public static void main(String args[])
{
Person p=new Person("Rohit",23,"Lucknow","rohit@gmail.com");
p.display();
}
}
















