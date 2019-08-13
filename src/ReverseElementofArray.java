import java.util.Scanner;

public class ReverseElementofArray
{
    public static void main(String args[])
    {
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n= scanner.nextInt();
        int array []= new int[n];
        System.out.println("enter values");
        for(int i=0;i<n;i++)
        {
         array[i]=scanner.nextInt();
        }
        for(int p=n-1;p>=0;p--)
        {
            System.out.println(array[p]);
        }
    }

}