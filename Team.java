 import java.util.*;
 public class Team  {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        //To get the number of problem the team needs to solve
        int n = sc.nextInt();

        int count = 0;

        //Now for the 3 students(Petya, Vasya and Tonya) who are in we need their inputs 

        for(int i = 0; i < n; i++){
        int P = sc.nextInt();
        int V = sc.nextInt();
        int T = sc.nextInt();

        if((P + V + T) >= 2) 
            count++;

        }

        System.out.println(count);


      /*for(int i = 0; i < n; i++)  {
            int num = sc.nextInt();
        
            for(int j = 0; j < 3; j++) {
                
                int single_num = num % 10;

                if(single_num == 1) {
                     count_one = count_one + 1;
                }

                else if(single_num == 0)    {
                      count_zero = count_zero + 1;
                }

                num = num / 10;
            
            }
            if(count_one > count_zero)  {
                     count = count + 1;
                }
            
            count_one = 0;
            count_zero = 0;

        }

        System.out.print(count);*/
            


        sc.close();
    }
    
    
 }
