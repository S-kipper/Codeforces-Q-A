import java.util.*;

public class beautifulYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        year++; 

        while (true) {

            int[] arr = String.valueOf(year)
                    .chars()
                    .map(c -> c - '0')
                    .toArray();

            boolean isBeautiful = true;

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        isBeautiful = false;
                        break;
                    }
                }
                if (!isBeautiful) break;
            }

            if (isBeautiful) {
                System.out.println(year); 
                break;
            }

            year++;
        }
    }
}
