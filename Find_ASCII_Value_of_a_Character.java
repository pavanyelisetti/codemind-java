import java.util.Scanner;
class ascii
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        char x;
        int y;
        x=sc.next().charAt(0);
        y=(int) x;
        System.out.println(y);
    }
}