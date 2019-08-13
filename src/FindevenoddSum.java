import java.util.Scanner;

public class FindevenoddSum
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter any five digit number");
        int n= scanner.nextInt();
        int p=0;
        int sum=0;
        int even=0;
        int odd=0;
        while(n>0)
        { p=n%10;
           if(p%2==0){ even=even+p;}
           else odd=odd+p;
           n=n/10;
        }

        System.out.println(even);
        System.out.println(odd);
    }
}
