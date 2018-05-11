
package find.the.median;

import java.util.Arrays;
import java.util.Scanner;


public class FindTheMedian {
    
     static int findMedian(int[] arr,int n) {
     
         Arrays.sort(arr);
         
         int median=n/2;
         
         int x=arr[median];
         
         return x;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = findMedian(arr,n);
        System.out.println(result);
        in.close();
    }
}
