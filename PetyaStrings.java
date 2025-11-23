import java.util.*;
public class PetyaStrings {
    
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String lowerA = a.toLowerCase();
        
        String b = sc.nextLine();
        String lowerB = b.toLowerCase();

        if(lowerA.compareTo(lowerB) < 0)  //A less than B
            System.out.println("-1");

        else if(lowerA.compareTo(lowerB) > 0) // A greater than B
            System.out.println("1");

        else
            System.out.println("0");

        
        /*for(int i = 0; i < a.length(); i++) {
            
            
        }*/
    }
}
