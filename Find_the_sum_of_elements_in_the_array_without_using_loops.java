import java.util.Scanner;
class sum{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int arr[] = new int[100];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
        
    }
}