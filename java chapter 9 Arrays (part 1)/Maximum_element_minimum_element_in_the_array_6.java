public class Maximum_element_minimum_element_in_the_array_6 {
    public static void main(String[] args) {
        int arr[] = {12,14,16,18,20,34,35,100}; 
        // maximum = 100
        // minimum = 12
        // how  to find maximum value element in the array 
        // int largest = arr[0];// 1st method (commonly used ) 
int largest = Integer.MIN_VALUE; // 2nd method (- infinity )
int smallest1 = Integer.MAX_VALUE; // 2nd method (- infinity )
System.out.println("the value of the smallest is: "+largest); //the value of the smallest is: -2147483648 (minimum value)
System.out.println("the value of the largest is: "+smallest1); //the value of the largest is: 2147483647 (Maximum value)
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){ 
                largest=arr[i]; // updation of largest 
            }
        }
        System.out.println("Maximum value element is: "+largest);
 


        // how to find minimum value element in the array 
        int smallest = arr[0];
        // int smallest = Integer.MAX_VALUE; // 2nd method (+ infinity )
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i]; // updation of smallest 
            }
        }
        System.out.println("Minimum value element is: "+smallest);
    }
}
// topic of code 
// minimum value element in the array 
// maximum value element in the array 
// time complexity is O(n)