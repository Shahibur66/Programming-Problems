
package max.min;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

    static int angryChildren(int k, int[] arr) {
        
        int i,j,maxS=0,minS=0;
       Arrays.sort(arr);     
       int unfairness = Integer.MAX_VALUE;
       for(i = 0; i < arr.length-k+1; i++)
           unfairness = Math.min(arr[i+k-1] - arr[i], unfairness);//Keeps a running min of the beginning and end of subarrays

       return unfairness;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = angryChildren(k, arr);
        System.out.println(result);
        in.close();
    }
    
}
