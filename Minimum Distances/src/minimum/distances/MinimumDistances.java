

package minimum.distances;

import java.util.Scanner;

public class MinimumDistances {

  
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        long a[]=new long[100001];
        int n,i,j,c=0,s=999999;
        
        n=sc.nextInt();
        
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextLong();
        }
        
        for(i=0; i<n; i++)
        {
           for(j=i+1; j<n; j++)
           {
               if(a[i]==a[j])
               {
                   int x=j-i;
                   if(s>=x)
                       s=x;
               }
           }
        }
        if(s>=999999)
            System.out.println(-1);
        else
         System.out.println(s);

    }
    
}
