import java.util.Scanner;
public class Linear_search_5 {
    public static int linearSearch(int numbers[],int key){
        for(int i = 0;i<numbers.length;i++){
            if(key==numbers[i]){
             return i;
            }
           }  
           return -1;
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner  (System.in);
       System.out.println("enter the size of array ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("input in the array ");
       for (int i =0;i<arr.length;i++){
        arr[i] =sc.nextInt();
       }
       System.out.println("enter the value of key ");
       int key = sc.nextInt();
       int indexresult = linearSearch(arr, key);
       if(indexresult==-1){
       System.out.println("key not found");
   } 
   else{
    System.out.println("key found at index: "+indexresult);
   }



   
//try linear search with string array 
//    String arr1 []=new String[5];
   String arr1[] ={"aman ", "arun","asmita","sunita","axaya"}; // String array
   String key1 = "asmita";  // key 
   for(int i = 0;i<arr1.length;i++){
    if(arr1[i].equals(key1)){ // string method (.equals)
      System.out.println("key found in string array  at index: "+i);
    }
   }
}
}

// time complexity : O(n) in worst case . 
// linear search is the searching algorithm of time complexity O(n)............




// Explanation of linear search 
// Linear search is a simple method for finding a specific value in a list. It checks each element one by one from the beginning until the desired value is found or the end of the list is reached.
// Here’s how it works in Java:
// Step 1:Start from the first element of the array or list.
// Step 2:Compare the current element with the value you’re searching for (called the "key").
// Step 3:If they match, return the index of the current element.
// Step 4:If they don’t match, move to the next element.
// Step 5:Repeat this until you find the key or reach the end of the list.
// Step 6:If the key is not found in the list, return -1 (or any indicator of "not found").