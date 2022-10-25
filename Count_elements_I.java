import java.util.Scanner;
class count
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[100];
        int brr[]= new int[100];
        int c=0,c1=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<b;j++)
        {
            brr[j]=sc.nextInt();
        }
        for(int k=0;k<a;k++)
        {
            c=0;
            for(int l=0;l<b;l++)
            {
                if(arr[k]==brr[l])
                {
                    c+=1;
                    brr[l]=-1;
                }
            }
            if(c>0)
            {
                c1+=1;
            }
        }
        System.out.println(c1);
    }
}