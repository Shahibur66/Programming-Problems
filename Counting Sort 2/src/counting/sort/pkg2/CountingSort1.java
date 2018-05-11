
package counting.sort.pkg2;

import java.util.Scanner;

public class CountingSort1 {

     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
       
        
        for(int arr_i = 0; arr_i < n; arr_i++){
            int x = in.nextInt();
            
            arr[x]++;
        }
       
        for(int i=0; i<100; i++)
        {
            System.out.print(arr[i]+" ");
        }

        in.close();
    }
}
