public class Max_Subarray_sum_2_prefix_sum_12 {
public static  void prefix_array(int arr[]){ // writing a function for calculation of sum of subarrays in an array 
    int current_sum=0; 
    int maximum_sum = Integer.MIN_VALUE; // minimum value of integer 
    int prefix_arr[]=new int[arr.length]; // creating a new array of length same as length of array that is passed in function as argument 
    // calculate prefix array 
      // from our basic knowledge 
    for (int i =1;i<prefix_arr.length;i++){
        prefix_arr[i]=prefix_arr[i-1]+arr[i];    // filling the element in the prefix_arr[]  // important to understand this relation 
    }
    for(int i = 0;i<arr.length;i++){
        int start = i;    
        for(int j = i;j<arr.length;j++){
     int end = j;       
     current_sum = start==0 ? prefix_arr[end] :prefix_arr[end]-prefix_arr[start-1]; // ternary operator  used to handle exceptional case of zero
if (maximum_sum<current_sum){ // condition for updating the maximum_sum
    maximum_sum = current_sum;
}
        }
    }
 System.out.println("max sum is: "+maximum_sum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        prefix_array(arr);
    }
}
// using prefix array 
// int arr[]={1,-2,6,-1,3}
// int prefix[]={1,-1,5,4,7}
// prefix[end] - prefix[start-1] 
// suppose start = 2
// end = 4
// sum of (6,-1,3 ) = 8 
// formulla prefix[4] - prefix[1] = 7-(-1) = 8
// time complexity : o(n^2)
// prefix [i ] = prefix[i-1]+arr[i]
// currentsum = Prefix[end]-prefix[start-1] and if start ==0{ currensum=prefix[end]}
// compare currentsum with maximum_sum ;
