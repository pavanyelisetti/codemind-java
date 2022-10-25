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
        // removing duplicates from array1.
        for(int k=0;k<a;k++)
        {
            c=0;
            for(int l=0;l<a;l++)
            {
                if(k!=l)
                {
                if(arr[k]==arr[l])
                {
                    arr[l]=-1;
                }
                }
            }
        }
        // removing duplicates from array1.
        for(int k=0;k<b;k++)
        {
            c=0;
            for(int l=0;l<b;l++)
            {
                if(k!=l)
                {
                if(brr[k]==brr[l])
                {
                    brr[l]=-1;
                }
                }
            }
        }
        // find uncommon elements from array1.
        for(int k=0;k<a;k++)
        {
            c=0;
            for(int l=0;l<b;l++)
            {
                
                {
                if(arr[k]==brr[l])
                {
                    c+=1;
                }
                }
            }
            if(c==0)
            {
                c1+=1;
            }
        }
        // find uncommon elements from array2.
        for(int k=0;k<b;k++)
        {
            c=0;
            for(int l=0;l<a;l++)
            {
                if(brr[k]==arr[l])
                {
                    c+=1;
                
                }
            }
            if(c==0)
            {
                c1+=1;
            }
        }
        System.out.println(c1);
    }
}