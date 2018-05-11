
package big.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {

    
    public static int compareToelement(String s1,String s2)
    {
        
        int n1,n2;
        n1=s1.length();
        n2=s2.length();
        
        if(n1>n2)
            return 1;
        if(n1<n2)
            return -1;
        for(int i=0; i<n1; i++)
        {
            if(s1.charAt(i)>s2.charAt(i))
                return 1;
           if(s1.charAt(i)<s2.charAt(i))
                return -1;
        }
        return 0;
    }
   
    public static void main(String[] args) {
      
         Scanner in = new Scanner(System.in);
         
          int n,i,j,m=0;
          n=in.nextInt();
        String []s=new String[n];
        
        for(i=0; i<n; i++)
        {
            s[i]=in.next();
        }
        
      Arrays.sort(s, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return compareToelement(o1,o2);
        }
       });
      
      
        for(i=0; i<n; i++)
        {
            System.out.println(s[i]);
        }

      
        
    }
   
}
