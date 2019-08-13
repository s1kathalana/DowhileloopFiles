import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter limit ");
        int n= scanner.nextInt();
        int num1= 1;
        int num2= 0;
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = num1 + num2;
            num1=num2;
            num2=sum;
            System.out.println(sum);
        }
    }
}

