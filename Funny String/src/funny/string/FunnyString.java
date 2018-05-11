
package funny.string;

import java.util.Scanner;

public class FunnyString {

   static String funnyString(String s){
     
       String revers = new StringBuffer(s).reverse().toString();
       boolean flag=false;
       char [] charRevers=revers.toCharArray();
       char [] charString=s.toCharArray();
       int i,j,k,c=0,p=0;
       String result=" ";
       for(i=1; i<charString.length; i++)
       {
          int x=Math.abs(charRevers[i]-charRevers[i-1]);
          int y=Math.abs(charString[i]-charString[i-1]);
          // System.out.println(x+" "+y);
           if(x==y)
           {
               flag=true;
           }
           else
           {
               flag=false;
               break;
           }
           
       }
       if(flag)
           result="Funny";
       else
           result="Not Funny";
       
       return result;
       
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
