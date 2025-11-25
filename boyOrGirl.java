import java.util.*;

public class boyOrGirl {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Set<Character> BoG = new HashSet<Character>();

        for(int i = 0; i < str.length(); i++)   {
            BoG.add(str.charAt(i));
        }   

        if(BoG.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        }

        else 
            System.out.println("IGNORE HIM!");
    }
}
