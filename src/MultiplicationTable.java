import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter upto which you want to print multiplication table of ");
        int n= scanner.nextInt();
        System.out.println("please enter term of upto where you want to muliply to");
        int t = scanner.nextInt();
        int i=1;
        int k=1;
        do
        {
            do
            {
                System.out.print((k*i)+" ");
                k++;
            }while(k<=t);
            k=1;
            System.out.println();
            i++;
        }while(i<=n);
    }
}


