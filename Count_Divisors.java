import java.util.Scanner;
class ray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt(),d=0;
        for(int i=a; i<=b;i++)
        {
            if(i%c==0)
            {
                d+=1;
            }
        }
        System.out.println(d);
    }
}