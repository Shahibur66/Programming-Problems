
package javaapplication21;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Two_Strings {

    static Set<Character>a;
    static Set<Character>b;
    


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
          
            a=new HashSet<Character>();
            b=new HashSet<Character>();
            
            for(char c: in.next().toCharArray())
                a.add(c);
            
             
            for(char c: in.next().toCharArray())
                b.add(c);
            
            a.retainAll(b);
            
            System.out.println((a.isEmpty())?"NO":"YES");
            
        }
        in.close();
    }
    
}
