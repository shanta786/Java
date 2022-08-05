//Program using Thread class for creating thread
class NewThread extends Thread
{
NewThread()
{
super("Demo Thread");
System.out.println("Child Thread :" + this);
start();   // It is used to start the thread
}
public void run()   // This is the entry point for the thread
{
try
{
for(int i=5;i>0;i--)
{
System.out.println("Child Thread :" + i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("Child Interrupted");
}
System.out.println("Exiting Child Thread");
}
}
class myMainThread1
{
public static void main(String args[])
{
new NewThread();
try
{
for(int i=5;i>0;i--)
{
System.out.println("Main Thread :" + i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("Main Thread interrupted");
}
System.out.println("Main Thread Exiting");
}
}
