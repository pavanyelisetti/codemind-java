import java.util.Scanner;
class rain{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int c=0;
        if(x%3==0)
        {
            System.out.print("Pling");
            c+=1;
        }
        if(x%5==0)
        {
            System.out.print("Plang");
            c+=1;
        }
        if(x%7==0)
        {
            System.out.print("Plong");
            c+=1;
        }
        if(c==0)
        {
             System.out.print(x);
        }
    }
}