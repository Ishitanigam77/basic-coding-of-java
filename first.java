import java.util.Scanner; 
public class Largest_number 
{
public static void main(String[] args)
{
int x,y,z;

Scanner s=new Scanner(System.in);
System.out.print("Enter the  first number");
x=s.nextInt();
System.out.print("Enter the second number:");
y=s.nextInt();
System.out.println("Enter the third number:");
z=s.nextInt();
if(x ==y && y ==z)
{
System.out.println("all the three numbers are equal:"+x);
}
else if (x >= y && x>=z)
{
System.out.println("the largest number is: "+x);
}
else if(y >= z)
{
System.out.println("the largest number is:"+y);
}
else
{
System.out.prinln("the largest number is:"+z);
}
}
}