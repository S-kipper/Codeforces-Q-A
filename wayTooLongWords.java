import java.util.*;
public class wayTooLongWords {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        //Lets first accept the number of lines with one words it needs to print

        int n = sc.nextInt();
        sc.nextLine();

        //Now we need to accept the strings

        for(int i = 0; i < n; i++)  {
            String str = sc.nextLine();

        //Now we need to check whether the string has more than 10 words in it or not 

            if(str.length() > 10)   {
                System.out.println(""+ str.charAt(0) + (str.length() - 2)+str.charAt(str.length() - 1));
                
            }

            else    {
                System.out.println(str);
            }
        }
        
    }
}