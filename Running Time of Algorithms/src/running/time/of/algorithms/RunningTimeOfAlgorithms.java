
package running.time.of.algorithms;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n,key,i,j,c=0;
        int []a=new int[10001];
        
        n=in.nextInt();
        
        for(i=0; i<n; i++)
            a[i]=in.nextInt();
        int last=a[n-1];
        
        for(i=1; i<n; i++)
        {
            key=a[i];
            
            j=i-1; 
            
            while(j>=0 &&a[j]>key)
            {
                a[j+1]=a[j];
                j=j-1;
                c++;
            }
          
            a[j+1]=key;
            
         
        }
          
             System.out.println(c);
       
    }
    
    
}
