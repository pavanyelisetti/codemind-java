import java.util.Scanner;
class ind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        double c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    
        for(int i=0;i<n;i++)
        {
                c+=a[i];
        }
        System.out.format("%.2f",c/n);
    }
}