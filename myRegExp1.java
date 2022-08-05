//Program to find subsequence using find()

import java.util.regex.*;

class myRegExp1
{
public static void main(String args[])
{
Pattern pat=Pattern.compile("Java");
Matcher mat=pat.matcher("Java 2");

System.out.println("We are searching Java in Java 2");

if(mat.find())
System.out.println("Subsequence Found");
else
System.out.println("Not Found");
}
}