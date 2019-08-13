import java.util.Scanner;

public class MultiplicationofnTable
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value for which multiplication table you want");
        int n = scanner.nextInt();
        System.out.println("enter term");
        int t = scanner.nextInt();
        int i=1;
        do{
            System.out.println(n+ "* "+i+ " = " +(n*i));
            i++;
        }while(i<=t) ;

    }
}

