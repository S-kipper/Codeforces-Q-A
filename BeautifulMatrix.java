import java.util.*;
public class BeautifulMatrix   {

    public static int Matrix(int[][] arr) {
        
        int ans = 0;
        int ans2 = 0;
        int answer = 0;
        for(int i = 0; i < 5; i++)  {
            for(int j = 0; j < 5; j++)  {
                if(arr[i][j] == 1)  {
                    
                     ans = Math.abs(i - 2);  /*The moment you find one mathematically you just need to minus the row and columns from 3 to get to 3*3 position i.e the perfect position 
                     Since java arrays are 0 indexed so the center is in 2*2 and not 3*3*/
                     ans2 = Math.abs(j - 2);
                     answer = ans + ans2;
                }
            }
        }
        return answer;
    }



    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int arr[][] = new int[5][5];
        for(int i = 0; i < 5; i++)  {
            for(int j = 0; j < 5; j++)  {
                arr[i][j] = sc.nextInt();
            }

         result = Matrix(arr);
        }

        System.out.println(result);
        sc.close();
    }
}