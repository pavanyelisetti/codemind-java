import java.util.Scanner;
class grades
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>50 && b>60 && c>100)
        {
            System.out.println("10");
        }
        if(a>50 && b>60 && c<=100)
        {
            System.out.println("9");
        }
        if(a<=50 && b>60 && c>100)
        {
            System.out.println("8");
        }
        if(a>50 && b<=60 && c>100)
        {
            System.out.println("7");
        }
        if((a>50 && b<=60 && c<=100) || (a<=50 && b>60 && c<=100) || (a<=50 && b<=60 && c>100))
        {
            System.out.println("6");
        }
        if(a<=50 && b<=60 && c<=100)
        {
            System.out.println("5");
        }
    }
}