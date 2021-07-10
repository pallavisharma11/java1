import java.util.Scanner;
public class GreaterNumber 
{
    void greater()
    {
        int a , b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a");
        a = sc.nextInt();
        System.out.println("Enter the value for b");
        b = sc.nextInt();
        System.out.println("Enter the value for c");
        c = sc.nextInt();
        
        if(a>b && a>c)
        {
            System.out.println("a is greater");
        }
        
        else if(b>a && b> c)
        {
            System.out.println("b is greater");
        }
        
        else
        {
            System.out.println("c is greater");
        }
        
    
    }
    public static void main(String[] args)
    {
        GreaterNumber obj = new GreaterNumber();
        obj.greater();
    }
    
}
