//program using I/O  for reading characters
import java.io.*;
class myReadFile
{
public static void main(String args[]) throws IOException
{
char ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter characters,'q' to quit");
do
{
ch=(char)br.read();
System.out.println(ch);
}while(ch!='q');
}
}