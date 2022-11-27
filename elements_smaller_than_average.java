import java.util.Scanner;
class sum
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int sum=0,c=0;
        int n=sc.nextInt();
        int avg;
        int a[]= new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        
                sum+=a[i];
        }
        avg=sum/n;
        for(int i=0;i<n;i++)
        {
        if(a[i]<=avg)
        {
            c+=1;
        }
        }
        System.out.println(c);
        
    }
}