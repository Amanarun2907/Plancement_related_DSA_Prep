public class insertion_sort_19 {
    public static void insertion_sort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            // finding out the correct position to insert 
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion 
            arr[prev+1]=curr;
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
       }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
     insertion_sort(arr);
     printarr(arr);
    }
}
// insertion sort 
// pick an element (from unsorted part ) and place it in the right position in sorted part of an array  
// 5,4,1,3,2
// 4,5,1,3,2  first  sorting of 5,4   
// 1,4,5,3,2  second sorting of 5,4,1
// 1,3,4,5,2  third  sorting of 5,4,1,3
// 1,2,3,4,5  forth  sorting of 5,4,1,3,2
// time complexity of selection , insertion and bubble sort is O(n^2)......................