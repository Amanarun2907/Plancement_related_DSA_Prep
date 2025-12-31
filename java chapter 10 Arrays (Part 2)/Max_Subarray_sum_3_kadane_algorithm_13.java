public class Max_Subarray_sum_3_kadane_algorithm_13 {
    public static void kadane (int arr[]){
       int current_sum = arr[0];
       int max_sum = Integer.MIN_VALUE; 
       for(int i = 1;i<arr.length;i++){
        current_sum += arr[i];
        if (current_sum<0){
            current_sum=0;
        }
        // if(current_sum>max_sum){
        //     max_sum=current_sum;
        // }
        max_sum=Math.max(current_sum, max_sum);
       }
       System.out.println("max subarray sum using kadane algorithm is: "+max_sum);
    }
    public static void main(String[] args) {
       int arr[]={-2,-3,4,-1,-2,1,5,-3};
       kadane(arr); 
       // what if all number of the array are negetive 
    }
}
// 
// int arr[] = {-2,-3,4,-1,-2,1,5,-3}
// according to kadane
// big value negative number + very small value positive number = 0
// current sum = 0 0 4 3 1 2 7 4
// maximum sum = 0 0 4 4 4 4 7 7
// inital value of current_sum = 0;
// initial value of maximum_sum = Integer.MIN_VALUE;
// time complexity is : 0(n)....
// Given an integer array arr[]. You need to find the maximum sum of a subarray.


// bard ai 
// kadane algorithm 

// Kadane's algorithm is a simple and efficient way to find the contiguous subarray within an array that has the largest sum. Here's how it works:

// Initialization:

// Set two variables:
// max_so_far: Keeps track of the maximum sum encountered so far.
// max_ending_here: Keeps track of the maximum sum ending at the current position.
// Initialize both to the first element of the array.
// Iteration:

// Iterate through the array, starting from the second element.
// For each element:
// Update max_ending_here:
// If max_ending_here is positive, add the current element to it.
// If max_ending_here is negative, start a new subarray from the current element (set max_ending_here to the current element).
// Update max_so_far:
// If max_ending_here is greater than max_so_far, update max_so_far.
// Return the Result:

// After the loop, max_so_far will hold the maximum sum of any contiguous subarray in the array.
// Key Idea:

// The algorithm keeps track of the maximum sum ending at each position.
// If the current sum becomes negative, it's better to start a new subarray from the next element.
// The final max_so_far will be the maximum sum of any contiguous subarray.
// Example:
// For the array [-2, 1, -3, 4, -1, 2, 1, -5, 4], the algorithm would find the subarray [4, -1, 2, 1] with the maximum sum of 6


// if all the elements are negative then this code handle that situation effectively 
// class Solution {
//     int maxSubarraySum(int[] arr) {
//         int current_sum = 0;
//         int maximum_sum = Integer.MIN_VALUE;
//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < 0) {
//                 count++;
//             }
//         }

//         if (count == arr.length) {
//             for (int i = 0; i < arr.length; i++) {
//                 current_sum = arr[i];
//                 if (maximum_sum < current_sum) {
//                     maximum_sum = current_sum;
//                 }
//             }
//             return maximum_sum;
//         } else {
//             for (int i = 0; i < arr.length; i++) {
//                 current_sum = current_sum + arr[i];
//                 if (current_sum < 0) {
//                     current_sum = 0;
//                 }
//                 if (maximum_sum < current_sum) {
//                     maximum_sum = current_sum;
//                 }
//             }
//             return maximum_sum;
//         }
//     }
// }
