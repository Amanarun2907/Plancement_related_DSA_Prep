public class concept_of_counting_sort {
    public static void countingsort(int arr[])
    {
         // finding the maximum value element as we have to find the range 
         int largest  = Integer.MIN_VALUE;
         for(int i = 0;i<arr.length;i++)
         {
             largest  = Math.max(largest,arr[i]);
              // finding the largest 
         }
         // calculate the frequency of each element 
         int freqarr[] = new int[largest+1]; // initally all the elements are 0 
         for (int i = 0;i<arr.length;i++)
         {
            freqarr[arr[i]]++; // calculating the frequency 
         }
         //sorting  
         int j = 0;
         for(int i = 0;i<freqarr.length;i++)
         {   while(freqarr[i]>0){
            arr[j] = i; 
            j++; // increasing the index 
            freqarr[i]--; // decreasing the frequency to zero 
         }
        }
    }
    public static void main(String[] args) {
     int arr[]= {3,2,5,4,1,1,4,5};
     countingsort(arr);
     for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
    }
}


//  DRY RUN
// Step 1 : Finding the maximum value element of an array to find the range 
// int arr[]= {3,2,5,4,1,1,4,5};
// largest = Integer.MIN_VALUE
// i = 0 ---> Math.max(largest,arr[i])--->Math.max(-infinity,3)----> largest =  3 
// i = 1---> Math.max(largest,arr[i])--->Math.max(3,2)----> largest =  3 
// i = 2 ---> Math.max(largest,arr[i])--->Math.max(3,5)----> largest =  5 
// i = 3 ---> Math.max(largest,arr[i])--->Math.max(5,4)----> largest =  5 
// i = 4 ---> Math.max(largest,arr[i])--->Math.max(5,1)----> largest =  5 
// i = 5 ---> Math.max(largest,arr[i])--->Math.max(5,1)----> largest =  5 
// i = 6 ---> Math.max(largest,arr[i])--->Math.max(5,4)----> largest =  5 
// i = 7 ---> Math.max(largest,arr[i])--->Math.max(5,5)----> largest =  5
// largest = 5 
// Step 2 : Calculating frequency and store in an array 
// int freqarr = new int[5+1];
// int freqarr = new int[6];    {0,0,0,0,0,0}
// i = 0 ---> arr[0] = 3 ---> freq[3] = 1
// i = 1 ---> arr[1] = 2 ---> freq[2] = 1
// i = 2 ---> arr[2] = 5 ---> freq[5] = 1
// i = 3 ---> arr[3] = 4---> freq[4] = 1
// i = 4 ---> arr[4] = 1 ---> freq[1] = 1
// i = 5 ---> arr[5] = 1 ---> freq[1] = 2
// i = 5 ---> arr[5] = 4 ---> freq[4] = 2
// i = 5 ---> arr[5] = 5 ---> freq[5] = 2
// freqarr[]= {0,2,1,1,2,2}
// freqarr[0] =0 
// freqarr[1] =2 
// freqarr[2] =1 
// freqarr[3] =1 
// freqarr[4] =2 
// freqarr[5] =2 
// Sorting of an array 
// int j = 0 
// i= 0 ----> no next i 
// i= 1 ---->  2>0 ---> arr[0] = 1 ---> j = 1---> 2-1 = 1
// i= 1 ---->  1>0 ---> arr[1] = 1 --->j = 2--->  1-1 = 0
// i= 2 -----> 1>0 -----> arr[2] = 2 ---> j = 3 --> 1-1 = 0 
// i= 3 -----> 1>0-----> arr[3] = 3 ----> j = 4 ---> 1-1 = 0
// i= 4 -----> 2>0 ----> arr[4] = 4 ----j = 5--> 2-1 = 0
// i= 4 -----> 1>0 ----> arr[5] = 4 --j= 6---> 1-1 = 0
// i= 5 -----> 2>0 -----> arr[6] = 5 --j= 7-> 2-1 = 1
// i= 5 -----> 1 >0 ----> arr[7] = 5---> j= 8--> 1-1 = 0
// i= 6.........out of the loop
// array = { 1,1,2,3,4,4,5,5}