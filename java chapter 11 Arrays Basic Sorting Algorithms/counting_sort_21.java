public class counting_sort_21 {
    public static void counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE; // initializing the variable with minimum value of the integer  
        for(int i = 0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        // Here you have find the maximum value element of the array for range of the numbers 


        int count[]=new int[largest+1]; // creating a new array 
        //int count[]={0,0,0,0,0,0} // here largest = 5 (for example)
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;  
          // count[arr[i]]=count[arr[i]]+1;
        }

        // sorting 
        int j = 0;
        for(int i = 0 ;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        } // now sorting is done 
    }
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
    public static void main(String[] args) {
      int arr[]={1,4,1,3,2,4,3,7};
      counting_sort(arr);
      printarr(arr);  
    }
}
// counting sort 
// range of number is small 
