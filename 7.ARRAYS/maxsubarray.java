// public class maxsubarray
// {
//     public static void main(String args[])
//     {
//         int num[] = {1,2,3,4};
//         int max = Integer.MIN_VALUE;
//         int n = num.length;

//         int prefix[] = new int[num.length];
//         prefix[0] = num[0];
//         for(int i = 1  ; i<n ;i++)
//         {
//             prefix[i]  = prefix[i-1] + num[i] ;

//         }

     
//         for(int i = 0 ; i<n ;i++)
//         {
//             for(int j = i ; j<n ; j++)
//             {   int sum = 0 ;
//                 for(int k = i ; k<= j ; k++)
//                 {
//                     sum += num[k];
//                 }
//                 System.out.print(sum);
//                 if(max<sum)
//                 {
//                     max = sum;
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.print(max);
//     }
// }
import java.util.Arrays;

class Solution {

    // Function to sort the array and return the largest element
    public static int sortArr(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // Return the last element (largest element) after sorting
        return arr[arr.length - 1];
    }
}

public class maxsubarray {

    public static void main(String[] args) {
        // Initialize arrays
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};
        
        // Find and output the largest element in both arrays
        System.out.println("The Largest element in the array is: " + Solution.sortArr(arr1));
        System.out.println("The Largest element in the array is: " + Solution.sortArr(arr2));
    }
}