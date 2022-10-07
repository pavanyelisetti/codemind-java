import java.util.Scanner;
class prime{
    public static int prime(int x)
    {
        int c=0;
        if(x==1)
        {
            return 0;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(x);i++)
            {
                if(x%i==0)
                {
                    c+=1;
                }
            }
        }
        if(c==0)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(prime(i)==1)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}