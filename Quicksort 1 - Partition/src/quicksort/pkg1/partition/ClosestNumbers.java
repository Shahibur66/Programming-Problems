
package quicksort.pkg1.partition;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static jdk.nashorn.internal.runtime.PropertyMap.diff;

public class ClosestNumbers {
    
  private int[] arrA;
 
	public ClosestNumbers (int[] arrA) {
		this.arrA = arrA;
	}
 
	public void quickS(int low, int high) {
		
		int left = low;
		int right = high;
		int pivot = arrA[left]; 
		while (left <= right) {
			while (arrA[left] < pivot)
				left++;
			while (arrA[right] > pivot)
				right--;
			
			if (left <= right) {
				int temp = arrA[left];
				arrA[left] = arrA[right];
				arrA[right] = temp;
				left++;
				right--;
			}
		}
	
		if (low < right)
			quickS(low, right);
		if (left < high)
			quickS(left, high);
	}
 
	public void display() {
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(" " + arrA[i]);
		}
	}
 
	public static void main(String[] args) throws java.lang.Exception {
		
		
		
		
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int[] arr = new int[n];
                int[] brr = new int[n];
                for(int arr_i = 0; arr_i < n; arr_i++){
                    arr[arr_i] = in.nextInt();
                }
                ClosestNumbers sort = new ClosestNumbers(arr);
		
		sort.quickS(0, arr.length - 1);
		//sort.display();
                long minValue=999999999;
                Map<Integer,Integer>map=new HashMap<Integer,Integer>();
               
               
                for (int i=1,j=0; i < arr.length; i++,j++) {
			
                    int dif=arr[i]-arr[i-1];
                    brr[j]=dif;
                   
                    if(dif<=minValue)
                    {
                        if(dif<minValue)
                            map.clear();
                     
                        minValue=dif;
                        map.put(arr[i-1],arr[i]);
                    }
                        
                    
		}

                for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
                    System.out.print(entry.getKey()+" "+entry.getValue()+" ");
                    
          }

                
                
	}
        
}