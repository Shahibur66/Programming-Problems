
package counting.sort.pkg1;

import java.util.Scanner;

public class CountingSort1 {
    
    
    void sort(int arr[])
    {
        int n = arr.length;
 
        int output[] = new int[n];
 
        int count[] = new int[n+1];
        for (int i=0; i<n; ++i)
            count[i] = 0;
 
        for (int i=0; i<n; ++i)
            ++count[arr[i]];

        for (int i=1; i<=n; ++i)
            count[i] += count[i-1];

        for (int i = 0; i<n; ++i)
        {
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i<n; ++i)
            arr[i] = output[i];
    }
 
 
    public static void main(String args[])
    {
        CountingSort1 ob = new CountingSort1();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
      
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        ob.sort(arr);
        for (int i=0; i<arr.length; ++i)
             System.out.print(arr[i]+" ");
    }
}
    

