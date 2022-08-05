//Program to copy one file into another using I/O
import java.io.*;
class myCopyFile
{
public static void main(String args[]) throws IOException
{
int i;
FileInputStream fin;
FileOutputStream fout;

try
{
fin = new FileInputStream(args[0]);
}
catch(FileNotFoundException e)
{
System.out.println("Input File not available");
return;
}
try
{
fout=new FileOutputStream(args[1]);
}
catch(FileNotFoundException e)
{
System.out.println("Problem occred in output file");
return;
}
try
{
do
{
i=fin.read();
if(i!=-1)
fout.write(i);
}while(i!=-1);
}
catch(IOException e)
{
System.out.println("File Error");
}
fin.close();
fout.close();
}
}