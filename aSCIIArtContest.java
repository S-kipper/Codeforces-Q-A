import java.util.*;

public class aSCIIArtContest {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        int g = sc.nextInt();
        int c = sc.nextInt();
        int l = sc.nextInt();

        int max = Math.max(g, Math.max(c, l));
        int min = Math.min(g, Math.min(c, l));


        ArrayList<Integer> list = new ArrayList<>();
        list.add(g);
        list.add(c);
        list.add(l);

        Collections.sort(list);

        if(max - min >= 10)  {
            System.out.println("check again");
        }

        else    {
            System.out.println("final" + " " + list.get(1));
        }
    }   
}
