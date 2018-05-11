
package pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceinanArray {

    
   static int minimumAbsoluteDifference(int n, int[] arr) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        
        List list=new ArrayList();
        
        for(int i=1; i<n; i++)
        {
           
                int x=Math.abs(arr[i-1]-arr[i]);
                list.add(x);
            
        }
        Collections.sort(list);
        
        System.out.println(list.get(0));
        
        
        in.close();
    }
        
}