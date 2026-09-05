import java.util.Scanner;

/* Description: Program demonstrates search trace of Binary Search algorithm to find an element in the array.
After user inputs the size, elements, and the target. The function will track the value of low, high, and mid.

Programmed by: Kurt Dwayne C. Gulle BSIT 48079 Data Structures and Algorithm

Last Modified: 9/5/2026 16:30

Version: 2.0

Acknowledgegments: https://www.w3schools.com/dsa/dsa_algo_binarysearch.php

*/

public class BinarySearch{
    
    public static int bSearch(int[] array, int target, int low, int high){
        if(low > high){
            return -1;
        }
        
        int mid = low + (high - low) / 2;
        
        if(array[mid] == target){
            System.out.println("Binary Search: Low - " + low + ", High - " + high + ", Mid " + mid);
            return mid;
        }
        
        if(target < array[mid]){
            System.out.println("Binary Search: Low - " + low + ", High - " + high + ", Mid " + mid);
            return bSearch(array, target, low, mid - 1);
        }
        
        System.out.println("Binary Search: Low - " + low + ", High - " + high + ", Mid " + mid);
        return bSearch(array, target, mid + 1, high);
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element: ");
            array[i] = scanner.nextInt();
        }
        
        System.out.print("\nEnter the number you want to find: ");
        int target = scanner.nextInt();
        
        int result = bSearch(array, target, 0, size - 1);
        
        if(result == -1){
            System.out.println("\nTarget Not Found");
            System.out.println("\nIndex: " + result);
        } else {
            System.out.println("\nTarget Found");
            System.out.println("\nIndex: " + result);
        }
        scanner.close();  
    }
}
