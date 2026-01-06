import java.util.*;
public class searchEasyProblem {
    public static void main(String args[])  {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = sc.nextInt();

        for(int i = 0; i < num; i++)  {
            int n = sc.nextInt();

            if(n == 1)  {
                count++;
            }
        }

        if(count != 0)
            System.out.println("HARD");

        else
            System.out.println("EASY");
    }
}
