import java.util.Scanner;
public class Swap {
    Swap()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter frist number");
    int x=sc.nextInt();
    System.out.println("Enter the second number");
    int y=sc.nextInt();
    System.out .println("The value of first number:"+x);
    System.out.println("The value of second number:"+y);
    int temp=x;
    x=y;
    y=temp;
    System.out.println("After swapping:");
    System.out .println("The value of first number:"+x);
    System.out.println("The value of second number:"+y);
    }
    public static void main(String args[])
    {
    Swap obj=new Swap();
    }
    
}
//Conctructor call itself at the time of obj creation
