
package the.great.xor;

import java.util.Scanner;

public class TheGreatXOR {

 static long theGreatXor(long x){
    
     long c=0,i,j;
     
     for(i=1; i<x; i++)
     {
         if((i^x)>x)
         {
             c++;
         }
     }

     return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            long result = theGreatXor(x);
            System.out.println(result);
        }
    }
}
