import java.util.*;

public class CappingWord {
    public static void main(String args[])  {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        //for(int i = 0; i < str.length(); i++)   {

            char ch = str.charAt(0);
            if(!Character.isUpperCase(ch))   {
                char newCh = Character.toUpperCase(ch);

                str = newCh + str.substring(1);
                System.out.println(str);
            }

            else
                System.out.println(str);
        
    sc.close();
    }
}
