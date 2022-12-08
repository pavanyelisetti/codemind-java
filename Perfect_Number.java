import java.util.*;
class add
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),s=0;
        for(int i=1;i<=(int)a/2;i++)
        {
            if(a%i==0)
            s+=i;
        }
        if(s==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}