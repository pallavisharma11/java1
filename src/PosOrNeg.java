import java.util.Scanner;
public class PosOrNeg 
{
    public static void main(String[] args)
    {
        PosOrNeg obj = new PosOrNeg();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
        
    }
    
}
