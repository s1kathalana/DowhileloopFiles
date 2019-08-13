import java.util.Scanner;

public class StringnoofWordsSpace
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
        int count = 0;
        int number =0;
        for (int n = 0; n < ch.length; n++)
        {
            if(ch[n]==' ')
            {
                number = number+1;
            }
        }
        System.out.println("no. of words are  "+(number+1));
        System.out.println("no. of spaces are "+number);
    }
}

