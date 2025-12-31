// Given an array arr, use selection sort to sort arr[] in increasing order.
 public class selection_sort_18 {
    public static void selection_sort(int arr[]){
     // how many time our code is running // no of turns  
     for(int i = 0;i<arr.length-1;i++){
        int minposition =i;   // minimum element is at index i intially 
        for(int j = i+1;j<arr.length;j++){
            // comparision 
            if(arr[j]<arr[minposition]){
                minposition=j;  // Comparision 
            }
            // we are finding the minimum one ............
        }
        // swap of two number using a varaible 
         // swaping 
        int temp=arr[minposition];
        arr[minposition]=arr[i];
        arr[i]=temp;
     }
    }
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
       }
    public static void main(String[] args) {
          int arr[] ={5,4,1,3,2};
          selection_sort(arr);
         printarr(arr);
    }
}




// WORKING OF THE SORTING ALGO..................
// selection sort 
// time complexity is o(n^2) in all cases
// int arr[] ={5,4,1,3,2}

// first time 
// 5 4 1 3 2
// firstly we take 5 
// inner loop run from 4 to 2 
// swaping of 5 with 1 .
// 1 4 5 3 2


// second time 
// 1 4 5 3 2
// now  we take 4
// inner loop run from 5 to 2 
// swaping of 4 with 2 .
// 1 2 5 3 4

// third time 
// 1 2 5 3 4
// now  we take 5
// inner loop run from 3 to 4 
// swaping of 5 with 3 .
// 1 2 3 5 4


// forth time 
// 1 2 3 5 4
//  now  again take 5 
// inner loop have only one element that is 4 
// swap of 4 with 5
// 1 2 3 4 5


// total element = 5
// outer loop = n-1 times 
// inner loop = from i+1 to n-1 