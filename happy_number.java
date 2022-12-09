import java.util.*;
class happy
{
    public static void add(int x)
    {
        
        int temp=x,s=0;
        while(temp>0)
        {
            int r=temp%10;
            
            s+=(r*r);
            temp/=10;
        }
        if(s>=10)
        {
            add(s);
        }
        else
        {
            if(s==1 || s==7)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        add(x);
       
        
    }
}