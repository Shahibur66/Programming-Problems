
package intro.to.tutorial.challenges;

import java.util.Scanner;


public class IntroToTutorialChallenges {

     static int introTutorial(int V, int[] arr) {
        
         
         return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        int x = 0,y = 0;
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
         
            if(V==arr[arr_i])
            {
                  y=arr_i;
            }
              
        }
        int result = introTutorial(V, arr);
        System.out.println(y);
        in.close();
    }
    
}
