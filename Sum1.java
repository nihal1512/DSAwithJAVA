import java.util.Scanner;
public class Sum1 {
    void func()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int x=sc.nextInt();
    System.out.println("Enter the second number");
    int y=sc.nextInt();
    int res=x+y;
    System.out.println("Total:"+res);
    }
    public static void main(String args[]){
    Sum1 s1=new Sum1();
    s1.func();
    }
    
}
