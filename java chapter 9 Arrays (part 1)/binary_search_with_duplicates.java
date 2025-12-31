public class binary_search_with_duplicates {
public static int binary_search_increment (int arr[], int k ){
   int start = 0;
   int end = arr.length-1;
   int ans = -1;
   while (start<=end) { 
       int mid = (start+end)/2;
       if (arr[mid]==k){
        ans = mid;
        end = mid-1; // left
       }
       else if (arr[mid]>k){ // left
       end = mid-1;
       }
       else {
        start = mid +1;
       }
   }
   return ans;
}

public static int binary_search_decrement (int arr[], int k ){
   int start = 0;
   int end = arr.length-1;
   int ans = -1;
   while (start<=end) { 
       int mid = (start+end)/2;
       if (arr[mid]==k){
        ans = mid;
        end = mid-1; // left
       }
       else if (arr[mid]>k){ // right
       start = mid +1;
       }
       else { // arr[mid]<k
        end = mid-1;
       }
   }
   return ans;
}
  public static void main(String[] args) {
      int arr [] = {3,3,3,4,4,4,5,6}; // incremental array // 0
      int arr2 [] = {1,2,3,4,4,4,4,4,4,4,4,6,6,6,6,9,10}; // incremental array // 3
      int arr1[] = { 6,5,4,4,4,3,3,3}; // decremental array 
      int arr3[] = { 9,9,9,9,9,9,5,5,4,4,4,4,4,4,4,3,3,3,3,2,2,1}; // decremental array 

       System.out.println("the answer of key = 3 is "+ binary_search_increment(arr2, 4)); //3
       System.out.println("the answer of key = 3 is "+ binary_search_decrement(arr3, 4)); // 8
  }  
}
