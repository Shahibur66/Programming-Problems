
package jim.and.the.orders;

import java.util.Scanner;
public class JimAndTheOrders {
      
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();

         int[] a=new int[n+100];
         int []b=new int[n+100];

         for(int i=1; i<=n; i++)
         {
             int order,prep;
             int s=0;
             order=in.nextInt();
             prep=in.nextInt();
             s=order+prep; 
             a[i]=s;
             b[i]=i;
             
         }
        
         for(int i=1; i<=n; i++)
         {
             
          for(int j=i+1; j<=n; j++)
         {
                 
                 if(a[i]>a[j])
                 {
                     int temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                     
                     
                     temp=b[i];
                     b[i]=b[j];
                     b[j]=temp;
                 }
         }
             
         }
         
         for(int i=1; i<=n; i++)
         {
             System.out.print(b[i]+" ");
         }
         
         
    }
    
}
