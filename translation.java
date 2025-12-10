import java.util.*;

public class translation {
    public static void main(String args[])  {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        //System.out.println(rev);
        if(rev.equals(t))
            System.out.println("YES");

        else
            System.out.println("NO");

        sc.close();
    }
}
