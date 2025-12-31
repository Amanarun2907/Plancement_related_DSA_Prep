public class Pairs_subarray {
    public static void pairs (int arr []){
    // pairs 
    int counter = 0;
    for (int i = 0;i<arr.length;i++){
        int start = arr[i];
        for (int j = i+1;j<arr.length;j++){ 
            System.out.print("( " +arr[i]+" , "+ arr[j]+" )"+" ");
        counter++;
        }
        System.out.println();
    }
    System.out.println("total number of pairs are "+ counter);
    }
    public static void subarray (int arr []){
    // sub-arrays
    int counter = 0;
    for (int i = 0 ; i<arr.length;i++){
        for (int j = i;j<arr.length;j++){
        for (int k = i ;k<=j;k++){
            System.out.print(arr[k]+ " ");
        }
        counter++;
        System.out.println();
        }
        System.out.println();
    }
    System.out.println("total number of subarrays are "+ counter);
    }
    public static void main (String [] args ){
     int arr [] = {2,4,6,8};
    //  pairs(arr);
     subarray(arr);
    }
}
