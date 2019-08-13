import java.util.Scanner;

public class ReverseFiveDigitNumber
{
    public static void main(String[] args)
    {


    Scanner scanner= new Scanner(System.in);
    System.out.println("enter any five digit number");
    int n= scanner.nextInt();
    int p=0;
    while(n>0)
    { p=n%10;
        System.out.print(p);
        n=n/10;}

}}
