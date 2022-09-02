import java.util.Scanner;
class avg
{
    public static void main(String[] args)
    {
        String[] input;
        Scanner sc = new Scanner(System.in);
        input=sc.nextLine().split(" ");
        float a,b;
        float c;
        a=Float.parseFloat(input[0]);
        b=Float.parseFloat(input[1]);
        c=(a+b)/2;
        System.out.format("%.4f",c);
    }
}
