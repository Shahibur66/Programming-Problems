
package inserionsortpart1;

import java.util.Scanner;

public class InserionSortPart1 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n,key,i,j,c,k;
        int []a =new int[10003];
        
        n=in.nextInt();
        
        for(i=0; i<n; i++)
            a[i]=in.nextInt();
        int last=a[n-1];
  
        for(i=n-2; i>=0; i--)
        {
            key=a[i];
           if(last<=a[i])
            {
          
               a[i+1]=a[i];
                
                for(k=0; k<n; k++)
                   System.out.print(a[k]+" ");
                if(k==n)
                {
                    System.out.println("");
                }
            }
          
            if(last>=a[i])
            {
                a[i+1]=last;
                 for(int k1=0; k1<n; k1++)
                   System.out.print(a[k1]+" ");
                 break;
            }
           
              
        }
           if(i<0 && last<a[0])
             {
                  a[0]=last;
                  for(k=0; k<n; k++)
                   System.out.print(a[k]+" ");
             }
        
      
    }
    
}
