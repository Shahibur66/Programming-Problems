/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;

public class Correctness_and_the_Loop_Invariant {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n,key,i,j,c;
        int []a =new int[10001];
        
        n=in.nextInt();
        
        for(i=0; i<n; i++)
            a[i]=in.nextInt();
        int last=a[n-1];
        
        for(i=1; i<n; i++)
        {
            key=a[i];
            
            j=i-1; 
            
            while(j>=0 &&a[j]>key)
            {
                a[j+1]=a[j];
                j=j-1;
            }
          
            a[j+1]=key;
            
         
        }
           for(int k1=0; k1<n; k1++)
                   System.out.print(a[k1]+" ");
            System.out.println("");
       
    }
    
}
