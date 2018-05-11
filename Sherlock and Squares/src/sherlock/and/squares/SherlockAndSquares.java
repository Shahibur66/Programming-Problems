
package sherlock.and.squares;

import java.util.Scanner;

public class SherlockAndSquares {


    public static void main(String[] args) {
       
         Scanner sc=new Scanner(System.in);
       
       
         int n,i,j,c=0,k,m,p,v;
         
         long x,y,z=0;
         n=sc.nextInt();
         while(n-->0)
         {
             z=0;
             x=sc.nextLong();
             y=sc.nextLong();
             z=(long) (Math.floor(Math.sqrt(y))-Math.ceil(Math.sqrt(x))+1);
             
             System.out.println(z);
         }
        
    }
    
}
