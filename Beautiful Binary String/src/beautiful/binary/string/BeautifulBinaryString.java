
package beautiful.binary.string;

import java.util.Scanner;

public class BeautifulBinaryString {

   
    static int beautifulBinaryString(String b) {
        
        int n,i,j,c=0,p=0;
        char[] charString=b.toCharArray();
        for(i=2; i<charString.length; i++)
        {
            if(charString[i-2]=='0'&& charString[i-1]=='1'&&charString[i]=='0')
            {
                c++; 
                charString[i]='3';
            }
           
        }
        return c;
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }
    
}
