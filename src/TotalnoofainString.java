import java.util.Scanner;

public class TotalnoofainString
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scanner.next();
        char[] ch = str.toCharArray();
        int count = 0;
        for (int n = 0; n < ch.length; n++)
        {
            if (ch[n] == 'a')
            {
                count = count + 1;
            }
        }
        System.out.println("no. of a in the given string is  "+count);
    }


}





