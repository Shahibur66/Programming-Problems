
package sum.vs.xor;

import java.util.Scanner;

public class SumVsXOR {

 static long solve(long n) {
      
     long i,j,s=0,c=0;
     
     while(n>0)
     {
         if((n&1)==0)
         {
             c++;
         }
         n=n>>1;
     }
     
     return 1L<<c;
     
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }
    
}
