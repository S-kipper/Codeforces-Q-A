import java.util.*;

public class helpfulMaths {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] numbers = input.split("\\+");
        
        Arrays.sort(numbers);
        
        String result = String.join("+", numbers);
        
        System.out.println(result);
        sc.close();
    }
}