public class binary_search_for_searching_in_array_7 {
        public static int binary_search_logic(int arr[],int key){
            int start = 0; // initializing the start w̥ith 0
            int end = arr.length-1; // initializing the end with arr.length-1 // last index 
            while (start<=end){
                int mid = start+(end-start)/2; // we this because to avoid the overflow condition / (start+end)/2;   // formation of mid 
                if (arr[mid] ==key){  
                return mid;
                }
                if (key>arr[mid]){ // right side 
                 start = mid+1; // updating start 
                }
                 if(key<arr[mid]){ // left side
                    end = mid-1; // updating end.......
                }
            }
            return -1;
            }
        public static void main(String[] args) {
            int arr[]={2,4,6,8,10,12,14};
            int key = 2;
           System.out.println("index of the key is in the array by binary search is: "+binary_search_logic(arr,key)); 
         }
        }
        // important searching algorithm 
        // int arr[]={2,4,6,8,10,12,14}
        // key = 10 
        // iteration 1 : start = 0 , end = 6 , mid = 3 , 0<=6
        //                arr[3] = 8 ---> 8<10 , right : start = 4 
        // size of an array : 7
        // iteration 2 : start = 4 , end = 6 , mid = 5 , 4<=6
        //                arr[5] = 12 -----> 12>10 , left : end = 4 
        // size of the array : 3 = 7/2
        // iteration 3 : start = 4 , end = 4 , mid = 4 ,4<=4
        //                  arr[4] = 1= , 10=10 , return 4
        // size of the array : 1 = 3/2 = 7/4
        //                 index = 4     
        // size of the array : n n/2 n/4 n/8 n/16..................1
        //           1 = n/2^k 
        //         2^k = n 
        // taking log both side : k = log(n)
        // time complexity = o(log n)
        // binary search is better than linear search as the time complexity of binary search is less than linear search . 
        // Array must be sorted in nature ..........(Prerequisite) . It is basically a searching algorithm ..
        // Modified binary search --------------> Searching in  a rotated sorted array (Rotated about pivot)
       // Better than linear search which has the time complexity of O(n)....
        