import java.util.Scanner;
class ind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int maxi=a[0];
        for(int i=1;i<n;i++)
        {
            if(maxi<=a[i])
            {
                maxi=a[i];
            }
        }
        System.out.println(maxi);
    }
}