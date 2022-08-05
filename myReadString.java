//Program using I/O for reading the string
import java.io.*;
class myReadString
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("Enter string line by line");
System.out.println("Enter 'stop' to quit");
do
{
str=br.readLine();
System.out.println(str);
}while(!str.equals("stop"));
}
}

