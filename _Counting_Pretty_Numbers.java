import java.util.Scanner;
class count{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int r;
        for(int i=1;i<=t;i++)
        {
            int v=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int j=a;j<=b;j++)
            {
                r=j%10;
                if((r==2) || (r==3) || (r==9))
                {
                    v+=1;
                }
            }
            System.out.println(v);
        }
        
    }
}