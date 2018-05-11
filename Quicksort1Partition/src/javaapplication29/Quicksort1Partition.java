
package javaapplication29;

import java.util.Arrays;
import java.util.Scanner;


public class Quicksort1Partition {

    
    public static void main(String[] args) {
       
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int[] arr = new int[n];
                for(int arr_i = 0; arr_i < n; arr_i++){
                    arr[arr_i] = in.nextInt();
                }
                
                
                int []result=quickSort(arr,n);
                
                for(int i=0; i<n; i++)
                    System.out.print(arr[i]+" ");
    }
    
    public static int [] quickSort(int a[],int n)
    {
        int b[]=Arrays.copyOf(a, n);
        int i,j = 0,c=0;
        int pivot=a[0];
        for(i=1;i<n;i++)
        {
            if(b[i]<=pivot)
            {
                a[j]=b[i];
                j++;
            }
        }
        a[j]=pivot;
        j++;
        for(i=0;i<n;i++)
        {
            if(b[i]>pivot)
            {
                a[j]=b[i];
                j++;
            }
        }
          
        
        return a;
    }
    
}
