import java.util.Scanner;
class sign
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a>0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}