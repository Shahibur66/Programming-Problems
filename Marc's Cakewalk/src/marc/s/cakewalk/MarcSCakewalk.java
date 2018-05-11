
package marc.s.cakewalk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MarcSCakewalk {

   static long marcsCakewalk(int[] calorie) {
        // Complete this function
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calorie = new int[n];
        for(int calorie_i = 0; calorie_i < n; calorie_i++){
            calorie[calorie_i] = in.nextInt();
             // list.add(in.nextInt());
        }
       
       
         Arrays.sort(calorie);

        long sum=0;
         for(int i=n-1,j=0; i>=0; i--,j++)
        {
          
         sum=(long) (sum+calorie[i]*Math.pow(2, j));
         
        }
        System.out.println(sum);
        in.close();
    }
    
}
