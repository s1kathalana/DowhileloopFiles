import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter any number");
        int n= scanner.nextInt();
        int p=0;
        int sum=0;
        while(n>0)
        { p=n%10;
          sum=sum+(p*p*p*p*p) ;
          n=n/10;
        }

        System.out.println(sum);

    }
}
