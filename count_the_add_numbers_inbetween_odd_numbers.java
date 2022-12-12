import java.util.*;
class count{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=1;i<a-1;i++)
        {
            if(arr[i]%2==1)
            {
                if(arr[i-1]%2==1 && arr[i+1]%2==1)
                {
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}