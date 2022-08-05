//Program using isAlive() and join()
class NewThread implements Runnable
{
String name;
Thread t;
NewThread(String threadname)
{
name=threadname;
t=new Thread(this,name);
System.out.println("New Thread :" + t);
t.start();
}
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println(name +" :" + i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println(name + " interrupted.");
}
System.out.println(name + " exiting");
}
}
class DemoMainJoin
{
public static void main(String args[])
{
NewThread obj1=new NewThread("One");
NewThread obj2=new NewThread("Two");
NewThread obj3=new NewThread("Three");
System.out.println("Thread One is alive "+ obj1.t.isAlive());
System.out.println("Thread Two is alive "+ obj2.t.isAlive());
System.out.println("Thread Three is alive "+ obj3.t.isAlive());
try
{
System.out.println("Waiting for Thread to finish");
obj1.t.join();
obj2.t.join();
obj3.t.join();
}
catch(InterruptedException e)
{
System.out.println("Main Thread Interrupted");
}

System.out.println("Thread One is alive " + obj1.t.isAlive());
System.out.println("Thread Two is alive " + obj2.t.isAlive());
System.out.println("Thread Three is alive " + obj3.t.isAlive());

System.out.println("Main Thread exiting");
}
}







