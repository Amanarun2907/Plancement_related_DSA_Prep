public class print_subarrays_in_array_10 {
    public static void subarrays(int arr[]){
        int counter = 0;
        for (int i = 0;i<arr.length;i++){
            // int start = i;
            for (int j = i;j<arr.length;j++){
                int sum = 0;
            // int end = j;
                for(int k = i;k<=j;k++){

System.out.print(arr[k]+" ");
                   sum= sum+arr[k];
                }
                System.out.println();
                System.out.println("the sum of the subarray is: "+sum);
                counter++; // counting 
                 System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray are: "+counter);// count the no of sub array of the array 
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10};
        subarrays(arr);
    }
}
// print subarray 
// a continuous part of array 
// int arr[] = {2,4,6,8,10}
 // subarray of 2 = (2),(2,4),(2,4,6),(2,4,6,8),(2,4,6,8,10)
 // subarray of 4 = (4),(4,6),(4,6,8),(4,6,8,10)
 // subarray of 6 = (6),(6,8),(6,8,10)
 // subarray of 8 = (8),(8,10)
 // subarray of 10 = (10)
 // Time complexity - O(n^3)





 //output window 
//  2 
// 2 4 
// 2 4 6 
// 2 4 6 8 
// 2 4 6 8 10

// 4
// 4 6
// 4 6 8
// 4 6 8 10

// 6
// 6 8
// 6 8 10

// 8
// 8 10

// 10


// total subarray are: 15 = n*(n+1)/2



// Home work : find the sum of each subarray and from those print the maximum and minimum sum .