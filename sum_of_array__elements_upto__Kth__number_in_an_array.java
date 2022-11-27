import java.util.Scanner;
class sum
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int a[]= new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int  x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}