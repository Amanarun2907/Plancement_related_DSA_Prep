


import java.util.Arrays;

public class revision{

    // counting sort (small range only)..................................................................................
    public static void counting_sort(int arr[]){
        // largest
        int lar = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            lar = Math.max(lar,arr[i]);
        } 
        int count [ ] = new int [lar+1] ; // indexing from 0 to lar....
        // freqency 
        for (int i = 0;i<arr.length;i++){
          count[arr[i]]++; // count[arr[i]] = count[arr[i]] + 1;
        }
        // sorting 
        int j = 0;
        for (int i = 0 ; i<count.length;i++){
            while(count[i]>0){
               arr[j] = i;
               j++;
               count[i]--;
            }
        }
    }


     public static void insertion_sort (int arr[]){
        // array is divided into sorted and unsorted part so you have to pick an element from the unsorted part and place it on the correct position on the sorted part ....
        // current and previous 
        for (int i = 1;i<arr.length;i++){
            int curr = arr[i]; // storing the value (element of the array)
            int prev = i-1; // index ......................
            while (prev>=0 && arr[prev]>curr){ // jaab taak hai jaan taab taak haar nehi manani hai .....
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
     }
     

    public static void bubble_sort(int arr[]){
        for(int i = 0 ;i<arr.length-1;i++){ // turns 
             int sort_count = 0;
            for (int j = 0 ; j<=arr.length-2-i;j++){ // inner loop
               if (arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
                sort_count++;
               }
            }
            if (sort_count==0 && i ==0){ // i == 0  is also very important here .........
                System.out.println("array is already sorted . ");
                break;
            }
        }
    }

    public static void selection_sort (int arr[]){
        // pick the smallest (from unsorted array) and , put it in the beginning 
     for (int i = 0;i<arr.length-1;i++){
        int minpos = i;
        for (int j = i+1;j<arr.length;j++){
          if (arr[minpos]>arr[j]){
            minpos = j;
          }
        }
        int temp = arr[i];
        arr[i]= arr[minpos];
        arr[minpos]= temp;
     }
    }




    // print the array ..................................................
    public static void print (int arr[]){
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr_1[] = {5,4,1,2,3};
        int arr_2[] = {7,8,9,10,11,12};
        // Arrays.sort(arr_1);
        Arrays.sort(arr_1,1,4);  // starting index to ending index -1; 
        // selection_sort(arr_1);
        // counting_sort(arr);
        //insertion_sort(arr);
        // bubble_sort(arr_2);
        print(arr_1);
        // array is called by reference in function ............... 
        //  for (int i = 0 ; i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
    
    }
}