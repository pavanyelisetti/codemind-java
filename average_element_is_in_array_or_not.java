import java.util.Scanner;
class ind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int c=0,x=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    
        for(int i=0;i<n;i++)
        {
                c+=a[i];
        }
        int avg=(c/n);
        for(int i=0;i<n;i++)
        {
            if(a[i]==avg)
            {
                x+=1;
            }
        }
        if(x>0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}