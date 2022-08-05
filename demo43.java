public class demo43{
    public static void main(String[]args)
    {
        int num=Integer.parseInt(args[0]);
        do
        {
            System.out.println(num + " is a prime number");
            num++;
        }
        while(num%2==1);
        
        if(num%2==1)
        {
        do
        { 
            System.out.println(num+ " is NOT a prime number");
            num++;
        }
        while (num%2==0);
    }
}
}