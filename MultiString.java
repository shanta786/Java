//Program using I/O for multiple strings
import java.io.*;
class MultiString
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str[]=new String[100];
System.out.println("Enter the text for no of lines");
System.out.println("Enter 'stop ' to quit");
for(int i=0;i<100;i++)
{
str[i]=br.readLine();
if(str[i].equals("stop"))
break;
}
System.out.println("Here is your content");

for(int i=0;i<100;i++)
{
if(str[i].equals("stop"))
break;
System.out.println(str[i]);
}
}
}