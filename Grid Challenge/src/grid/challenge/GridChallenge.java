
package grid.challenge;

import java.util.Arrays;
import java.util.Scanner;


public class GridChallenge {


    
    static String gridChallenge(char[][] grid,int n) {
        
        
        boolean flag=false;
        
         for(int grid_i =1; grid_i < n; grid_i++){
             
             for(int grid_j=1; grid_j<n; grid_j++)
             {
                
                     if(grid[grid_j-1][grid_i-1]>grid[grid_j][grid_i-1])  
                     { 
                         return "NO";
                     }
               
             }
             
        }
         
         return "YES";    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n = in.nextInt();in.nextLine();
        char[][] grid = new char[n][n];
        while(t-->0)
        {
           for(int grid_i = 0; grid_i < n; grid_i++){
                 grid[grid_i]= in.nextLine().toCharArray();
                 Arrays.sort(grid[grid_i]);               
        } 

            String result=gridChallenge(grid,n);
            System.out.println(result);

        }    
        in.close();
    }
}
