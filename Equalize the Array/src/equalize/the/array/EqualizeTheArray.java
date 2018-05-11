
package equalize.the.array;

import java.util.Arrays;
import java.util.Scanner;


public class EqualizeTheArray {

    
    public static void main(String[] args) {
       
         Scanner sc=new Scanner(System.in);
      
         int n,i,j,c=0,s=0,k,m,p,v;
        
         n=sc.nextInt();
        int arr[]=new int[n+1];
         for(i=0; i<n; i++)
         {
             arr[sc.nextInt()]++;
         }
         Arrays.sort(arr);
         
         System.out.println(n-arr[n]);
    }
    
}
