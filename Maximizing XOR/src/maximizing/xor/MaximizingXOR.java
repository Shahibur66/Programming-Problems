
package maximizing.xor;

import java.util.Scanner;

public class MaximizingXOR {

static int maximizingXor(int l, int r) {
    
    int minValue=Integer.MIN_VALUE;
    
    int i,j,c=0,s=0;
 
    for(i=l; i<=r; i++)
    {
        for(j=l; j<=r; j++)
        {
            s=i^j;
            
            if(s>=minValue)
            {
                minValue=s;
                
            }
            
        }
    }
    
    
       return minValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = maximizingXor(l, r);
        System.out.println(result);
        in.close();
    }
    
}
