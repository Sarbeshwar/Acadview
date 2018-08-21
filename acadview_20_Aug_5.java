import java.util.Scanner;
public class Acadview_ 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num=input.nextInt();
        int rev_number=0,rem;
        while(num!=0)
        {
            rem=num%10;
            rev_number=rev_number*10+rem;
            num/=10;
        }
        System.out.print(rev_number);
    }
}
