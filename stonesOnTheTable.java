import java.util.*;

public class stonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String stones = scanner.next();
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (stones.charAt(i) == stones.charAt(i - 1)) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}