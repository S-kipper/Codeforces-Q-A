import java.util.*;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int current = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); //exiting
            int b = sc.nextInt(); //entering

            current -= a;  //passengers exit
            current += b;  //passengers enter

            maxCapacity = Math.max(maxCapacity, current);
        }

        System.out.println(maxCapacity);
        sc.close();
    }
}
