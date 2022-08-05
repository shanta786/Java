//Program using classes
class Person
{
String name;
int age;
String address;
String email;
void setData(String a,int b,String c,String d)
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

class myMain1
{
public static void main(String args[])
{
Person p=new Person();
p.setData("Rohit",23,"Lucknow","rohit@gmail.com");
p.display();
}
}
















