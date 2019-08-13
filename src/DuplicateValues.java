import java.util.Scanner;

public class DuplicateValues
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

        for(int s=0;s<n;s++)
        {
            for(int k=s+1;k<n;k++)
            {
                if(array[s]==array[k])  {
                    System.out.println("common no.is "+array[s]);}
            }

        }

    }
}
