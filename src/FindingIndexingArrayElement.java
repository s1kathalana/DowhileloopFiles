import java.util.Scanner;

public class FindingIndexingArrayElement
{
    public static void main(String args[])
    {


            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the length of an array");
            int n = scanner.nextInt();
            int array[] = new int[n];
            System.out.println("enter values");
            for (int s = 0; s < n; s++)
            {
                array[s] = scanner.nextInt();
            }

            System.out.println("choose any number from the values");
            int q = scanner.nextInt();


        for(int a=0;a<n;a++)
        {
            if(q==array[a])
            {
                System.out.println("the position of "+q+ " is "+(a+1));
            }
        }
    }
}
