





public class reverse_of_an_array_8 {
    public static void reverse(int number[]){
        int first = 0 , last = number.length-1;
        // swapping with temporary variable 
        // while(first<last){          //  temp   first   last 
        //     int temp = number[first] ;      //    5      5       6
        //   number[first] = number[last];           //    5      6       5
        //    number [last] = temp ;           //    5      6       5
        //     first++;
        //     last--;
        // }


         // swapping without temporary variable 
        // while(first<last){
        //   number[first] = number[first]+number[last];
        //    number[last] = number[first] - number[last];
        //    number[first] = number[first]-number[last];
        //    first++;
        //    last--;
        // }

       // swapping using bitwise xor 
       while(first<last){
        number[first] = number[first]^number[last];
        number[last] = number[first]^number[last];
        number[first] = number[first]^number[last];
        first++;
        last--;
       }
    }
    public static void main (String[] args){
        // method 1 with extra space in memory  as arr1[]
        // int arr[]={2,4,6,8,10};
        // for(int i = 0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // int arr1[] = new int [5];
        // for (int i = 0;i<arr.length;i++){
        //     arr1[i] = arr[(arr.length-1)-i];
        // }
        // arr = arr1; // creating copy of array 
        // for(int i = 0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

     // method 2 with no extra space in memory 
     int odd_numbers [] = {3,5,7,9};
     for(int i = 0 ;i<=odd_numbers.length-1;i++ ){
        System.out.print(odd_numbers[i]+" ");
     }
    System.out.println();
     reverse(odd_numbers);
     for(int i = 0 ;i<=odd_numbers.length-1;i++ ){
        System.out.print(odd_numbers[i]+" ");
     }
     System.out.println();
     int even_numbers [] = {2,4,6,8,10};
     for(int i = 0 ;i<=even_numbers.length-1;i++ ){
        System.out.print(even_numbers[i]+" ");
     }
     System.out.println();
     reverse(even_numbers);
     for(int i = 0 ;i<=even_numbers.length-1;i++ ){
        System.out.print(even_numbers[i]+" ");
     }
     System.out.println();
     
     // You have to point a variable to the starting element of the array
     // You have to point a variable to the ending element of the array
     // Then swap those two 
     // then increase the value of the variable  which is pointing the first element.  
     // then decrease the value of the variable  which is pointing the last element. 
     // loop run till (start > end); 












    }
}
// reverse of an array with no extra space used 
// time complexity is in order of n 
// space complexity is constant 