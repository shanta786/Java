class hello12
{
public static void main(String args[])
{
String letter = "NULL";
char x;
do{
    System.out.print("Enter grade (one character): ");
    switch (letter) {
       case "a": 
       System.out.println("Grade A");
       break;
     case "A":
       x=true;
       break;      
     case "b":
       x=true;
       break;      
     case "B":
       x=true;
       break;      
     case "c":
       x=true;
       break;      
     case "C":
       x=true;
       break;      
     case "d":
       x=true;
       break;      
     case "D":
       x=true;
       break;
     case "f":
       x=true;
       break;      
     case "F":
       x=true;
       break;
     default:
       System.out.println("Invalid grade - must enter A,B,C,D,F (upper or lower case)");
       System.out.println(x);
       break;
     }
      System.out.println(x);
     }
      while(x!='q');
}
}