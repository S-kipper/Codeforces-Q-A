import java.util.*;

public class antonANDdanik {
    public static void main(String args[])  {

        Scanner sc = new Scanner(System.in);

        int count1 = 0;
        int count2 = 0;

        int num = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine().toUpperCase();
        int strlen = str.length();
        //System.out.println(strlen);
        
        //while(strlen == num)   {

            for(int i = 0; i < num; i++)    {
                if(str.charAt(i) == 'A')    {
                    count1++;
                }

                else    
                    count2++; 
            }
        //}

        //System.out.println(count1);
        //System.out.println(count2);
        if(count1 > count2)
            System.out.println("Anton");

        else if(count2 > count1)
            System.out.println("Danik");

        else
            System.out.println("Friendship");

    } 
}