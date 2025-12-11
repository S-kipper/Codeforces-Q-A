import java.util.*;
public class vanyaAndFence {
    
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        int width = 0;
        int n = sc.nextInt();
        int h = sc.nextInt();

        for(int i = 0; i < n; i++)  {
            int num = sc.nextInt();

            if(num > h)    {
                width += 2;
            }

            else
                width += 1;
        }

        System.out.println(width);
        sc.close();
    }
}
