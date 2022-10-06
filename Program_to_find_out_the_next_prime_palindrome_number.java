import java.util.Scanner;
class primepalindrome{
    public static int prime(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int temp,r,rev=0;
        int j=x;
        while(true)
        {
            rev=0;
            j+=1;
            temp=j;
            while(temp>0)
            {
               r=temp%10;
               rev=rev*10+r;
               temp/=10;
            }
            if(rev==j)
            {
                if(prime(j)==1)
                {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}