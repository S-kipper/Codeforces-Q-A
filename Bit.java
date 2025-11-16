import java.util.*;
public class Bit {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        //For the number of statements in the programm
        String x;
        int count = 0;
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++)  {
            String str = sc.nextLine();

            if(str.contains("++"))  {
                count = count + 1;
            }

            else if(str.contains("--")) {
                count = count - 1;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
