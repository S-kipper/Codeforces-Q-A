import java.util.*;
public class DominoePiling {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int Board = M * N; // Will know the number of blocks in the board 

        int fits = Board / 2; // Divide it by 2*1 block of the dominoes everytime 

        System.out.println(fits);

        sc.close();
    }
}
