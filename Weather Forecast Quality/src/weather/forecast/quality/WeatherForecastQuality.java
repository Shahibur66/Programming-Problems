
package weather.forecast.quality;

import java.util.Scanner;

public class WeatherForecastQuality {

    public static void main(String[] args) {
       
         Scanner in = new Scanner(System.in);
         
         
         int n,i,j,c=0,s=0;
         
         int [] a=new int[103];
         int [] b=new int[103];
         
         for(i=0; i<7; i++)
         {
             a[i]=in.nextInt();
         }
         for(i=0; i<7; i++)
         {
             b[i]=in.nextInt();
         }
          
        
         for(i=0; i<7; i++)
         {
            s+=Math.abs(a[i]-b[i]);
         }
         System.out.println(s);
    }
    
}
