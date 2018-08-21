import java.util.Scanner;
public class Acadview_ 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int rem=0,sum=0;
        System.out.println("Enter the number to check");
        int num=input.nextInt();
        int orig_num=num;
        while(num!=0)
        {
            rem=num%10;
            sum+=rem*rem*rem;
            num/=10;
        }
        if(sum==orig_num)
        {
            System.out.print("Armstrong");
        }
        else
        {
            System.out.print("Not Armstrong");
        }
    }
}
