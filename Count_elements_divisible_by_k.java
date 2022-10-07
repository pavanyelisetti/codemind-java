import java.util.Scanner;
class count{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        int arr[] = new int[100];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]%b==0){
                c+=1;
            }
        }
        System.out.println(c);
    }
}