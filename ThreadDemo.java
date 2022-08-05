//Program using multithreading
class NewThread implements Runnable
{
Thread t;

NewThread()
{
t=new Thread(this,"Demo Thread");
System.out.println("Child Thread :" + t);
t.start();  // start() is used to start the thread
}

public void run()  // This is the entry point for thread
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
}
}
class ThreadDemo
{
public static void main(String args[])
{
new NewThread();
try
{
for(int i=5;i>0;i--)
{
System.out.println("Main Thread:" + i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("Main Thread Interrupted");
}
}
}





