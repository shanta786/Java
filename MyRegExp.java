//Program for pattern matching
import java.util.regex.*;

class MyRegExp
{
public static void main(String args[])
{
Pattern pat;
Matcher mat;
boolean found;

pat=Pattern.compile("Java");
mat=pat.matcher("Java");

found=mat.matches();

System.out.println("Java is one of the very important programming language");
if(found)
System.out.println("Matches");
else
System.out.println("No matches");

System.out.println();

System.out.println("Java 2 is one of the fast growing programming language");
mat=pat.matcher("Java 2");

found=mat.matches();

if(found)
System.out.println("Matches");
else
System.out.println("No Matches");
}
}
