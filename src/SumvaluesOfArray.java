import java.util.Scanner;

public class SumvaluesOfArray
{
    public static void main(String args[])
    {
       Scanner scanner = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = scanner.nextInt();
        System.out.println("enter values");
        int number []= new int[n];
        for(int i=0;i<n;i++)
        {
            number[i] = scanner.nextInt();
        }
        int sum = number[0];
            for(int s=1;s<n;s++)
        {
            sum = sum +number[s];
        }
        System.out.println("sum  ="+sum);
    }
}
