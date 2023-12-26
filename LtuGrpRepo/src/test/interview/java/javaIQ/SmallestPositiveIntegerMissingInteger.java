package javaIQ;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Arrays;


/*
Examples 

Input:  {2, 3, 7, 6, 8, -1, -10, 15}

Output: 1

Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
Output: 4

Input: {1, 1, 0, -1, -2}
-2 -1 0 1 1 
Output: 2
*/

public class SmallestPositiveIntegerMissingInteger {
    // Function to find the smallest positive missing integer
    static int findSmallestPositiveMissingInteger(int[] array){
        Arrays.sort(array);//-2 -1 0 1 1 
        int j;
        int i = 1;
        for(j = 0; j<array.length; j++){
           if(array[j] == i){
              i++;
           }
        } 
        return i;
    }
    // Function to read input and display the output
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
       
        try {
            size = Integer.parseInt(br.readLine());//"231"
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        
        int[] array = new int[size];
        System.out.println("Enter array elements");
        
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("An error occurred");
                return;
            }
        }
        int missing = findSmallestPositiveMissingInteger(array);
        System.out.println("The smallest positive missing integer is " + missing);
    }
}
