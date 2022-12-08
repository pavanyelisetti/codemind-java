import java.util.Scanner;
class ray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
        
            if(a<n || b<n)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            if(a>=n && b>=n)
            {
                if(a==b)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                    
                }
            }
        }
        
    }
}