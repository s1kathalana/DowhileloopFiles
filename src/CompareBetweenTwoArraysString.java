public class CompareBetweenTwoArraysString
{
    public static void main(String args[])
    {
        String string1 []={"sk","cb"};
        String string2 []={"surat","sk","nusrat"};

        for(int i=0;i<string1.length;i++)
        {
            for(int k=0;k<string2.length;k++)
            {
                if(string1[i]==string2[k]){
                    System.out.println("common between two strings are  "+string1[i]);}
            }
        }



    }



}
