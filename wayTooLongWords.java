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
                System.out.println(""+str.charAt(0) + (str.length() - 2)+str.charAt(str.length() - 1));
                /*Java sees:

str.charAt(0) → char

(str.length() - 2) → int

str.charAt(str.length() - 1) → char

When you add a char + int, Java converts them to numbers and adds them, not strings.
So it does math instead of concatenation — which is why the output becomes wrong. */   
            }

            else    {
                System.out.println(str);
            }
        }
        
    }
}