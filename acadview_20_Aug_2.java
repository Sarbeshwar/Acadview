import java.util.Scanner;
public class Acadview_ 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int i;
        System.out.println("Enter the limit");
        int num=input.nextInt();
        for(i=0;i<=num;i++)
        {
            if(i%2==0)
            {
             System.out.print(" "+i);
            }
        }
        
        
    }
}
