import java.util.Arrays;
import java.util.Scanner;

public class EqualityofArray
{
    public static void main(String args[])
    {
        int[] array1 = {2, 4, 5, 8};
        int[] array2 = {2, 4, 3, 6, 8};

        if (Arrays.equals(array1,array2))
        {
            System.out.println("arays are equal");
        }
        else  System.out.println("arrays are not equal");
    }

}

