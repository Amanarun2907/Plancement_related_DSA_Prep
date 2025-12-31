public class print_sub_array_11 {
    public static void printsubarr(int arr[]){
        int n1= Integer.MAX_VALUE;
            int n2= Integer.MIN_VALUE;
             int counter = 0;
        for(int i = 0;i<arr.length;i++)
       
        {
        for(int j =i;j<arr.length;j++)
        {
            int sum =0;
            for(int k = i;k<=j;k++)
            {
              System.out.print(arr[k]+" ");

              sum = sum+arr[k];
              if(n1>sum){ // largest 
                n1=sum; // minimum
            }
            if(n2<sum){ // smallest
                n2=sum; // maximum
            }
           
            }
            counter++;
            System.out.println();
            System.out.println("the value of the sum is: "+sum); 
        }
        }
        System.out.println();
        System.out.println("the total no of subarrays are: "+counter);
        System.out.println("the largest sum possible of subarray are: "+n2);
        System.out.println("the smallest sum possible of subarray are: "+n1);
          
    }
    public static void main(String[] args) {
        // int arr[]={2,4,6,8,10};
        int arr[]={1,-2,6,-1,3};
        printsubarr(arr);
    }
}
// print the subarray 
// minimum subarray sum 
// Maximum subarray sum 
// total subarray 
// Brute force
// Time complexity = O(n^3)