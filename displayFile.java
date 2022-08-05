//Program to read a file uisng Input/Output mechanism
import java.io.*;
class displayFile
{
public static void main(String args[]) throws IOException
{
int i;
FileInputStream fin;
try
{
fin=new FileInputStream(args[0]);
}
catch(FileNotFoundException e)
{
System.out.println("File is not available");
return;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("File not given");
return;
}
do
{
i=fin.read();
if(i!=-1)
System.out.print((char)i);
}while(i!=-1);
fin.close();
}
}