
package insertion.sort.part.pkg1;

import java.util.Scanner;

public class InsertionSortPart2 {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n,key,i,j,c=0; 
        
        n=in.nextInt();
        int []a =new int[n+1];

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
          
            for(int k1=0; k1<n; k1++)
                   System.out.print(a[k1]+" ");
            System.out.println("");
        }
        
       
    }
    
}
