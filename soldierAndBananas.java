import java.util.*;

public class soldierAndBananas {
    public static void main(String args[])  {

    
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int k = sc.nextInt(); //cost of the 1st banana
        int n = sc.nextInt(); //Initial dollars he has
        int w = sc.nextInt(); //number of banana he wants

        for(int i = 1; i <= w; i++)  {
            sum = sum + (i * k);
        }

        if(sum < n) 
            System.out.println(0);

        else
            System.out.println(sum - n);

        
        sc.close();


    }
    
}
