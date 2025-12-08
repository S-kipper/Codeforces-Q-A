import java.util.*;

public class nearlyLuckyNumber {
    public static void main(String args[])  {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        Long num = sc.nextLong();

        while(num > 0)  {

            Long n = num % 10;

            if(n == 4 || n == 7)
                count++;

            num = num / 10;
            //System.out.println(num);
            
        }

        if(count == 4 || count == 7)
            System.out.println("YES");

        else    
            System.out.println("NO");

        sc.close();
    }    
}
