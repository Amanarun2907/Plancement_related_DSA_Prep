public class Max_Subarray_sum_1_brute_force_11{
    public static void max_sum_of_subarray(int arr[]){
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE; 
        for (int i = 0;i<arr.length;i++){
            for (int j = i ; j<arr.length;j++){
            current_sum=0; // important step 
                for (int k = i;k<=j;k++){
// System.out.print(arr[k]+" ");
// subarray sum 
               current_sum +=arr[k];
               if(max_sum<current_sum)
               {
                max_sum=current_sum;
               }
                }
                System.out.println(current_sum);
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println("max sum = "+max_sum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        max_sum_of_subarray(arr);
    
    }
}
// maximum subarray Sum 
// int arr[] = {1,-2,6,-1,3}
// subarray of 1 = (1) (1,-2) (1,-2,6) (1,-2,6,-1) (1,-2,6,-1,3)
// subarray of -2 = (-2) (-2,6) (-2,6,-1) (-2,6,-1,3)
// subarray of 6  = (6) (6,-1) (6,-1,3)
// subarray of -1  = (-1) (-1,3)
// subarray of 3 = (3)
// total subarray of arr = n*(n+1)/2 = 5*6/2 = 15
// time complexity is O(n^3)  ..
// find all subarray 
// find sum of all individual subarray  
// from sum of all individual subarray find maximum sum . 
// Time complexity = O(n^3)