import java.util.Scanner;
class count{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++)
        {
            if((a[i-1]<a[i]) && (a[i]>a[i+1]))
            {
                c+=1;
            }
            if((a[i-1]>a[i]) && (a[i]<a[i+1]))
            {
                c+=1;
            }
        }
        if(c==(n-2))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}