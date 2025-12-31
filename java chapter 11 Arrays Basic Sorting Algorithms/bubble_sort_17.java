
public class bubble_sort_17 {
    public static void  bubblesort (int arr[]){ 
                                                      // function of bubble sort 
     for (int turns = 0;turns<=arr.length-2;turns++ ){// how many times loop is running in bubble sort .  
      int counter = 0;
      for (int j =0 ;j<arr.length-1-turns;j++){ // number of comparision 
             if(arr[j]>arr[j+1]){ // if you use arr[j]<arr[j+1] then items arrange in decreasing order and if you use  arr[j]>arr[j+1] then items arrange in ascending order.
                // swap function to swap two number 
                int temp = arr[j];   //    temp     a       b
                arr[j]=arr[j+1];     //      5       5       6       no is 56
                arr[j+1]=temp;       //      5       6       6
               counter++;
                                     //      5       6       5       no is reversed 
             }
        }
        if(counter==0){
         System.out.println("array is already sorted in nature");
         break;
        }
     }
     // n = length of an array  
     // i is moving from 0 to n-2 
     // j is  moving from 0 to n-1-i
    }
    public static void printarr(int arr[]){
     for(int i = 0;i<arr.length;i++){

        System.out.print(arr[i]+" ");
     }
    }
    public static void main (String[] args){
int arr[]={1,2,3,4,5};
int arr1[]={5,4,1,3,2};
int arr2[]={1,2,3};
bubblesort(arr2);
printarr(arr2);
    }
}
//{5,4,1,3,2}---> unsorted array 
//{1,2,3,4,5}----> increasing order 
// {5,4,3,2,1}----> decreasing order
// large elements come to the end of array by swapping with adjacent elements 
//working
// total elements = 5 
// 5,4,1,3,2 (oth term )
// 4,5,1,3,2
// 4,1,5,3,2
// 4,1,3,5,2
// 4,1,3,2,5


// 4,1,3,2,5  (1st term )
// 1,4,3,2,5
// 1,3,4,2,5
// 1,3,2,4,5


// 1,3,2,4,5  (2nd term )
// 1,3,2,4,5
// 1,2,3,4,5 


// 1,2,3,4,5   (3rd term)
// 1,2,3,4,5   
 
// if elements are n then we are taking n-1 terms 

// time complexity is o(n^2) in all cases (best, worst and average  )
// home work : what if i will give you  a sort array in increasing order [hint : use a count variable (swap)], optimal solution 
