import java.util.*;

public class Word {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String lowerCaseInput = input.toLowerCase();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for(int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if(Character.isLowerCase(ch)) {
                lowerCaseCount++;
            }
        }

        if(upperCaseCount > lowerCaseCount) {
            System.out.println(input.toUpperCase());
        } else {
            System.out.println(lowerCaseInput);
        }

        sc.close();
    }
}