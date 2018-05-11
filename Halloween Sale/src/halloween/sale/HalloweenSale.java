
package halloween.sale;

import java.util.Scanner;

public class HalloweenSale {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       int p,d,m,s=0,i,j,c=0,k,sum=0;
  
            p=sc.nextInt();
            d=sc.nextInt();
            m=sc.nextInt();
            s=sc.nextInt();
            
            
           c=1;
           sum+=p;
           while(true)
           {
                 
                   p=p-d;
                   if(p>=m)
                   {
                     if(sum+p>s){
                         break;
                     }else{
                         sum+=p;
                         c++;
                     }
                   }
                   else
                   {
                      if(sum+m>s){
                          break;
                      }else
                      {
                          sum+=m;
                          c++;
                      }
                   }
 
           }
        
           System.out.println(c);
        
    }
    
}
