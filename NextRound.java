import java.util.*;
public class NextRound {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        int  n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        int[] nums = new int[n];

        
        for(int i = 0; i < n; i++)  {
             nums[i] = sc.nextInt();
        }

        
        for(int j = 0; j < n; j++)  {
            if(nums[j] > 0 && nums[j] >= nums[k - 1])   {
                count++;
            }
        }

        System.out.println(count);

    }
    
}
