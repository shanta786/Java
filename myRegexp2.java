//Program using Pattern
import java.util.regex.*;
class myRegexp2
{
public static void main(String args[])
{
Pattern pat=Pattern.compile("w+");
Matcher mat=pat.matcher("w ww www");

while(mat.find())
{
System.out.println("Match: " + mat.group());
}
}
}