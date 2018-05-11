
package mars.exploration;

import java.util.Scanner;

public class MarsExploration {

    static int marsExploration(String s) {
       
        char[] s1=s.toCharArray();
        int n,i,j,c=0;
        for(i=0; i<s1.length; i+=3)
        {
           if(s1[i]!='S')
            {
                c++;
            }
           if(s1[i+1]!='O')
           {
               c++;
           }
           if(s1[i+2]!='S')
           {
               c++;
           }
   
        }
        
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
    
}
