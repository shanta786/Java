//Finding average of numbers using array
class myArray3
{
public static void main(String args[])
{
double nums[]={10.1,11.2,12.3,13.4,14.5};
double result=0;
int i;

for(i=0;i<5;i++)
{
result = result + nums[i];
}

System.out.println("Average = "+ result/5);
}
}