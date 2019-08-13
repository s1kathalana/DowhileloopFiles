import java.util.Scanner;

public class InsertElementinSpecificPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no. of elements in array");
        int n= scanner.nextInt();
        System.out.println("enter element values");
        int array []= new int[n+1];

        for(int a=0;a<n;a++){
         array [a]= scanner.nextInt();}


        for(int c=0;c<n;c++){
            System.out.println(array[c]);}
        System.out.println("enter position where do u want to add an element");
        int p= scanner.nextInt();
        System.out.println("enter value to be added at that position");
        int q = scanner.nextInt();


        for(int r=n-1;r>=p-1;r--)
        {
            array[r+1]=array[r];

        }
        array[p-1]=q;

        for(int c=0;c<array.length;c++){
            System.out.println(array[c]);}



    }


}
